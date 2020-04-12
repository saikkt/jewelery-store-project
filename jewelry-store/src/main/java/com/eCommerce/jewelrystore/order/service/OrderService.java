package com.eCommerce.jewelrystore.order.service;

import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getByCustomerID(long customerID){
        return orderRepository.findByCustomerID(customerID);
    }

    public Order save(Order order){
        order.getOrderItems().stream()
                    .forEach(orderItem -> {
                        order.addItem(orderItem);
                    });
        return orderRepository.save(order);
    }
}
