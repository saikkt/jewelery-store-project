package com.eCommerce.jewelrystore.customer.address.service;

import com.eCommerce.jewelrystore.customer.address.domain.Address;
import com.eCommerce.jewelrystore.customer.address.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }


    public List<Address> getAll(){
        return addressRepository.findAll();
    }

    public List<Address> getByCustomerID(long customerID){
        return addressRepository.findAllByCustomerID(customerID);
    }

    public Address save(Address address){
        return addressRepository.save(address);
    }
}
