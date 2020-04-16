package com.eCommerce.jewelrystore.order.service;

import com.eCommerce.jewelrystore.order.adapter.ProductClient;
import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.domain.OrderItem;
import com.eCommerce.jewelrystore.order.domain.OrderStatus;
import com.eCommerce.jewelrystore.order.repository.OrderRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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

    public List<Order> getAll(int page, int size) {
        return orderRepository.findAll(PageRequest.of(page, size)).toList();
    }

    public List<Order> getByCustomerID(long customerID) {
        return orderRepository.findByCustomerID(customerID);
    }

    @Transactional
    public Order save(Order order) {
        //Set Order
        //Get Unit Price
        //Calculate Total price
        //******To Do******
        //Get Discount from discount table
        //Get Tax From tax table (Not Sure How tax is calculated. Either for individual product or total price)
        order.getOrderItems().stream()
                .forEach(orderItem -> {
                    orderItem.setOrder(order);
                    orderItem.setUnitPrice(productClient.getProductPriceByID(orderItem.getProductID()));
                    orderItem.setTotalPrice(orderItem.getUnitPrice().multiply(new BigDecimal(orderItem.getQuantity())));
                });
        //Calculate CheckOut Price
        BigDecimal checkOutPrice = order.getOrderItems().stream()
                .map(OrderItem::getTotalPrice)
                .reduce(new BigDecimal(0), BigDecimal::add);
        //Set Checkout price
        order.setCheckoutPrice(checkOutPrice);
        return orderRepository.save(order);
    }

    public Optional<Order> getByOrderID(long orderID) {
        return orderRepository.findById(orderID);
    }

    public void deleteByOrderID(long orderID) {
        orderRepository.deleteById(orderID);
    }

    public List<Order> findByOrderStatus(OrderStatus orderStatus) {
        return orderRepository.findByOrderStatus(orderStatus);
    }


}
