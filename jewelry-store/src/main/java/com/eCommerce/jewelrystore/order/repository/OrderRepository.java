package com.eCommerce.jewelrystore.order.repository;

import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.domain.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    List<Order> findByCustomerID(long customerID);
    List<Order> findByOrderStatus(OrderStatus orderStatus);
    @Query(value = "select * from jOrders o where o.CustomerID=?1 and o.OrderStatus='CART'",nativeQuery = true)
    List<Order> findByCustomerIDCartStatus(long customerID);
}
