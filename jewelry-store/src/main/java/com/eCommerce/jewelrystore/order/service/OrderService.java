package com.eCommerce.jewelrystore.order.service;

import com.eCommerce.jewelrystore.order.adapter.ProductClient;
import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.domain.OrderStatus;
import com.eCommerce.jewelrystore.order.repository.OrderRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {



    private OrderRepository orderRepository;
    private ProductClient productClient;

    public OrderService(OrderRepository orderRepository, ProductClient productClient) {
        this.orderRepository = orderRepository;
        this.productClient = productClient;
    }

    public List<Order> getAll(int page, int size){
        return orderRepository.findAll(PageRequest.of(page,size)).toList();
    }

    public List<Order> getByCustomerID(long customerID){
        return orderRepository.findByCustomerID(customerID);
    }

    public Order save(Order order){
        order.getOrderItems().stream()
                    .forEach(orderItem -> {
                        orderItem.setOrder(order);
                        orderItem.setUnitPrice(productClient.getProductPriceByID(orderItem.getProductID()));
                        orderItem.setTotalPrice(orderItem.getUnitPrice().multiply(new BigDecimal(orderItem.getQuantity())));
                    });
        return orderRepository.save(order);
    }

    public Optional<Order> getByOrderID(long orderID){
        return orderRepository.findById(orderID);
    }

    public void deleteByOrderID(long orderID){
         orderRepository.deleteById(orderID);
    }

    public List<Order> findByOrderStatus(OrderStatus orderStatus){
        return orderRepository.findByOrderStatus(orderStatus);
    }
}
