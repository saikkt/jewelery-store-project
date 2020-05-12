package com.eCommerce.jewelrystore.customer.api;

import com.eCommerce.jewelrystore.accounts.models.User;
import com.eCommerce.jewelrystore.customer.domain.Customer;
import com.eCommerce.jewelrystore.customer.dto.CustomerModel;

import java.util.Optional;

class CustomerMapper {

    static Customer toEnity(CustomerModel customerModel){
        final Customer customer;
        customer = new Customer(
                customerModel.getCustomerFirstName(),
                customerModel.getCustomerLastName(),
                customerModel.getEmailAddress());
        customer.setGuest(customerModel.isGuest());
        customer.setCustomerID(customerModel.getCustomerID());
        customer.setPhone(customerModel.getPhone());
        customer.setVersion(customerModel.getVersion());

        return customer;
    }


    static Customer merge(CustomerModel customerModel,Customer customer){
        customer = new Customer(
                customerModel.getCustomerFirstName(),
                customerModel.getCustomerLastName(),
                customerModel.getEmailAddress());
        customer.setGuest(customerModel.isGuest());
        customer.setCustomerID(customerModel.getCustomerID());
        customer.setPhone(customerModel.getPhone());
        customer.setVersion(customerModel.getVersion());
        return customer;
    }

    public static CustomerModel  toModel(Customer updatedCustomer, User updatedUser) {
        final CustomerModel customerModel = new CustomerModel();
        customerModel.setCustomerID(updatedCustomer.getCustomerID());
        customerModel.setCustomerFirstName(updatedCustomer.getCustomerFirstName());
        customerModel.setCustomerLastName(updatedCustomer.getCustomerLastName());
        customerModel.setEmailAddress(updatedCustomer.getEmailAddress());
        customerModel.setGuest(updatedCustomer.isGuest());
        customerModel.setPhone(updatedCustomer.getPhone());
        customerModel.setUserName(updatedUser.getUserName());
        customerModel.setPassword(updatedUser.getPassword());
        return customerModel;

    }

}
