/**
 * This api is used to create, delete and update customer addresses.
 *
 */

package com.eCommerce.jewelrystore.customer.address.api;

import com.eCommerce.jewelrystore.customer.address.domain.Address;
import com.eCommerce.jewelrystore.customer.address.dto.AddressModel;
import com.eCommerce.jewelrystore.customer.address.service.AddressService;
import com.eCommerce.jewelrystore.customer.domain.Customer;
import com.eCommerce.jewelrystore.customer.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    private AddressService addressService;
    private CustomerService customerService;

    public AddressController(AddressService addressService, CustomerService customerService) {
        this.addressService = addressService;
        this.customerService = customerService;
    }

   @GetMapping("/{customerID}")
   public ResponseEntity<List<Address>> getByCustomerId(@PathVariable (name = "customerID") long customerID){
       List<Address> customerAddresses;
       customerAddresses = addressService.getByCustomerID(customerID);
       return ResponseEntity.ok(customerAddresses);
   }

    @PostMapping
    public ResponseEntity<Address> save(@RequestBody AddressModel addressModel){
        Optional<Customer> customer = customerService.get(addressModel.getCustomerID());
        if(!customer.isPresent()){
            return ResponseEntity.unprocessableEntity().build();
        }
        Address savedAddress;
        savedAddress = addressService.save(AddressMapper.toEntity(addressModel));
        return new ResponseEntity<>(addressService.save(savedAddress), HttpStatus.CREATED);
    }
}
