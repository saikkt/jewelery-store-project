package com.eCommerce.jewelrystore.order.repository;

import com.eCommerce.jewelrystore.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    List<Order> findByCustomerID(long customerID);
}