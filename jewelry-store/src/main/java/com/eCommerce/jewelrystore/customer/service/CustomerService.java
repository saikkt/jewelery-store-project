package com.eCommerce.jewelrystore.customer.service;

import com.eCommerce.jewelrystore.customer.domain.Customer;
import com.eCommerce.jewelrystore.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer save(Customer customer){
        final Customer savedCustomer = customerRepository.save(customer);
        return savedCustomer;
    }

    public Optional<Customer> get(long customerID){
       final Optional<Customer> customer =  customerRepository.findById(customerID);
       return customer;
    }

    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

    public Customer findByEmailAddress(String emailAddress){
        return customerRepository.findByEmailAddress(emailAddress);
    }

    public void delete(long customerID){
        customerRepository.deleteById(customerID);
    }
}
