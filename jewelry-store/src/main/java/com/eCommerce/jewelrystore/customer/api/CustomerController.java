/**
 * This api is used to create, delete and update customer.
 *
 */

package com.eCommerce.jewelrystore.customer.api;

import com.eCommerce.jewelrystore.customer.domain.Customer;
import com.eCommerce.jewelrystore.customer.dto.CustomerModel;
import com.eCommerce.jewelrystore.customer.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<Customer> post(@RequestBody CustomerModel customer){
        final Customer savedCustomer = customerService.save(CustomerMapper.toEnity(customer));
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

    @GetMapping
    public ResponseEntity<List<Customer>> getAll(){
        return ResponseEntity.ok(customerService.getAll());
    }

    @DeleteMapping("/{emailAddress}")
    public ResponseEntity delete(@PathVariable(name = "emailAddress") String emailAddress){
        Customer customer = customerService.findByEmailAddress(emailAddress);
        customerService.delete(customer.getCustomerID());
        return ResponseEntity.noContent().build();
    }
}
