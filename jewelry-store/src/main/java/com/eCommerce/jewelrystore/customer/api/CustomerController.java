/**
 * This api is used to create, delete and update customer.
 *
 */

package com.eCommerce.jewelrystore.customer.api;

import com.eCommerce.jewelrystore.accounts.MyUserDetailsService;
import com.eCommerce.jewelrystore.accounts.UserRepository;
import com.eCommerce.jewelrystore.accounts.exceptions.UserForbiddenException;
import com.eCommerce.jewelrystore.accounts.exceptions.UserInActiveException;
import com.eCommerce.jewelrystore.accounts.models.MyUserDetails;
import com.eCommerce.jewelrystore.accounts.models.User;
import com.eCommerce.jewelrystore.accounts.utilities.BcryptGenerator;
import com.eCommerce.jewelrystore.adapter.CartClient;
import com.eCommerce.jewelrystore.customer.domain.Customer;
import com.eCommerce.jewelrystore.customer.dto.CustomerModel;
import com.eCommerce.jewelrystore.customer.repository.CustomerRepository;
import com.eCommerce.jewelrystore.customer.service.CustomerService;
import com.eCommerce.jewelrystore.customer.util.CartLoaderUtility;
import com.eCommerce.jewelrystore.email.accounts.verfication.utility.OnRegistrationCompleteEvent;
import com.eCommerce.jewelrystore.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private  UserRepository userRepository;

    @Autowired
    ApplicationEventPublisher eventPublisher;

    @Autowired
    CartLoaderUtility cartLoaderUtility;

    @Autowired
    CartClient cartClient;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
    @GetMapping("/login")
    public ResponseEntity<CustomerModel> checkUser(HttpSession httpSession) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        cartLoaderUtility.loadCustomerToCart(httpSession);
        long id = ((MyUserDetails) principal).getCustomerId();
        CustomerModel customerModel = CustomerMapper.toModel(customerService.get(id).get(),userDetailsService.getUserByCustomerID(id).get());
        return ResponseEntity.ok().body(customerModel);
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
    @GetMapping("/login/reload")
    public ResponseEntity<CustomerModel> reloadBrowser(HttpSession httpSession) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        long id = ((MyUserDetails) principal).getCustomerId();
        CustomerModel customerModel = CustomerMapper.toModel(customerService.get(id).get(),userDetailsService.getUserByCustomerID(id).get());
        return ResponseEntity.ok().body(customerModel);
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
    @GetMapping("/logout")
    public Long logOutUser(HttpSession httpSession) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(cartClient.getCartItems(httpSession).size()!=0) {
            cartLoaderUtility.loadCartToCustomer(httpSession);
            cartClient.emptyCart(httpSession);
        }
        SecurityContextHolder.getContext().getAuthentication().setAuthenticated(false);
        return ((MyUserDetails) principal).getCustomerId();
    }

    @PostMapping("/registerCustomer")
    public ResponseEntity<Customer> post(@RequestBody CustomerModel customer, HttpServletRequest request){

        //if account with email id exists or by user name
        if(customerService.findByEmailAddress(customer.getEmailAddress())!=null )
            return ResponseEntity.unprocessableEntity().build();

        if(userRepository.findByUserName(customer.getUserName()).isPresent())
            return ResponseEntity.unprocessableEntity().build();

        if(customerService.findByEmailAddress(customer.getEmailAddress())!=null )
            return ResponseEntity.unprocessableEntity().build();
        //save new entity into customer
        final Customer savedCustomer = customerService.save(CustomerMapper.toEnity(customer));

        //creating User for the Customer for login
        User user = new User();
        user.setUserName(customer.getUserName());
        //yet to include encoder
       // user.setPassword(BcryptGenerator.getEncodedString(customer.getPassword()));
        user.setPassword(customer.getPassword());
        user.setCustomerId(savedCustomer.getCustomerID());
        user.setRoles("ROLE_USER");
        user.setActive(false);
        User savedUser = userRepository.save(user);
        String appUrl = request.getContextPath();

        //publishing email event for customer verfication
        eventPublisher.publishEvent(new OnRegistrationCompleteEvent(savedUser,
                request.getLocale(), appUrl));

        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

    @GetMapping("/{customerID}")
    public ResponseEntity<Customer> getById(@PathVariable(name = "customerID") long customerID){
        final Optional<Customer> customer = customerService.get(customerID);
        if(!customer.isPresent()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(customer.get());
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping
    public ResponseEntity<List<Customer>> getAll(){
        return ResponseEntity.ok(customerService.getAll());
    }

//  @PutMapping("/updateCustomer")
//  public ResponseEntity<CustomerModel> delete(@RequestBody CustomerModel customerModel){
//      Optional<Customer> existingCustomer = customerService.get(customerModel.getCustomerID());
//      Optional<User> existingUser = userDetailsService.getUserByCustomerID(customerModel.getCustomerID());
//      if(!(existingCustomer.isPresent())){
//          return ResponseEntity.notFound().build();
//      }
//      if(!(existingUser.isPresent())){
//          return ResponseEntity.notFound().build();
//      }
//      if(!existingUser.get().isActive()){
//          throw new UserInActiveException("User not yet active. Please activate your account before editing");
//      }
//      Customer customerToBeSaved = CustomerMapper.merge(customerModel,existingCustomer.get());
//      Customer updatedCustomer = customerService.save(customerToBeSaved);
//      User updatedUser = userDetailsService.updateUser(existingUser.get(),customerModel);
//      CustomerModel savedCustomerModel = CustomerMapper.toModel(updatedCustomer,updatedUser);
//      return ResponseEntity.ok().body(savedCustomerModel);
//  }

  @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
  @PutMapping("/updateCustomer")
  public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
  	
  	Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
  	long customerId = ((MyUserDetails) principal).getCustomerId();
  	
  	Customer savedCustomer = null;
  	
  	if(customer.getCustomerID() == customerId) {
  		savedCustomer = customerService.save(customer);
  	} else {
  		throw new UserForbiddenException("You're not authorized to perform update on other user");
  	}
  	
  	if(savedCustomer ==  null)
  		return ResponseEntity.status(HttpStatus.CONFLICT).body(customer);
  	
  	return ResponseEntity.ok().body(savedCustomer);
  }
  

  @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
  @PutMapping("/updateUserPersonal")
  public ResponseEntity<Map<String, Object>> updateCustomer(@RequestBody Map<String, Object> model){
  	
  	Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
  	long customerId = ((MyUserDetails) principal).getCustomerId();
  	
  	long modelCustomerID =  (int) model.get("customerID");
  	String modelOldPassword = (String) model.get("oldPassword");
  	String modelnewPassword = (String) model.get("newPassword");
  	
  	User existingUser = null;
  	
  	if(modelCustomerID == customerId) {
  		Optional<User> existingUserOptional = userDetailsService.getUserByCustomerID(modelCustomerID);
  		
  		if(existingUserOptional.isPresent()) {
  			existingUser = existingUserOptional.get();
  			
  			if(existingUser.getPassword().equals(modelOldPassword)) {
  				existingUser.setPassword(modelnewPassword);
  				existingUser = userDetailsService.save(existingUser);
  				
  					if(existingUser != null)
  						model.put("status", "Password updated !!!");
  					else
  						model.put("status", "Update failed !!!");
  			} else {
  				model.put("status", "Incorrect previous password !!!");
  			}
  		} else {
  			return ResponseEntity.notFound().build();
  		}
  		
  		
  	} else {
  		throw new UserForbiddenException("You're not authorized to perform update on other user");
  	}

		return ResponseEntity.ok().body(model);
  }
  
//  @DeleteMapping("/{emailAddress}")
//  public ResponseEntity delete(@PathVariable(name = "emailAddress") String emailAddress){
//      Customer customer = customerService.findByEmailAddress(emailAddress);
//      customerService.delete(customer.getCustomerID());
//      return ResponseEntity.noContent().build();
//  }
}
