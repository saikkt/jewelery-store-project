package com.eCommerce.jewelrystore.customer.api;

import com.eCommerce.jewelrystore.customer.domain.Customer;
import com.eCommerce.jewelrystore.customer.dto.CustomerModel;

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
}
