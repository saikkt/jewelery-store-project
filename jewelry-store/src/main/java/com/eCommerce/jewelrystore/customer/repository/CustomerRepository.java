package com.eCommerce.jewelrystore.customer.repository;

import com.eCommerce.jewelrystore.customer.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmailAddress(String emailAddress);
}
