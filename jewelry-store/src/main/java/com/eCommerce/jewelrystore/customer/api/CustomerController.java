/**
 * This api is used to create, delete and update customer.
 *
 */

package com.eCommerce.jewelrystore.customer.api;

import com.eCommerce.jewelrystore.accounts.MyUserDetailsService;
import com.eCommerce.jewelrystore.accounts.UserRepository;
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
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    private UserRepository userRepository;

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
    public Long checkUser(HttpSession httpSession) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        cartLoaderUtility.loadCustomerToCart(httpSession);
        return ((MyUserDetails) principal).getCustomerId();
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
    @GetMapping("/logout")
    public Long logOutUser(HttpSession httpSession) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        cartLoaderUtility.loadCartToCustomer(httpSession);
        cartClient.emptyCart(httpSession);
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

//    @DeleteMapping("/{emailAddress}")
//    public ResponseEntity delete(@PathVariable(name = "emailAddress") String emailAddress){
//        Customer customer = customerService.findByEmailAddress(emailAddress);
//        customerService.delete(customer.getCustomerID());
//        return ResponseEntity.noContent().build();
//    }
}
