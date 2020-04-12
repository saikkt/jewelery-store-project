package com.eCommerce.jewelrystore.order.api;

import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.repository.OrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderRepository orderService;

    public OrderController(OrderRepository orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{customerID}")
    public ResponseEntity<List<Order>> getOrdersByCustomerID(@PathVariable (name = "customerID") long customerID){
        List<Order> customerOrders = orderService.findByCustomerID(customerID);
        return ResponseEntity.ok(customerOrders);
    }

    @PostMapping
    public ResponseEntity<Order> save(@RequestBody Order order){
        Order savedOrder = orderService.save(order);
        return new ResponseEntity<>(savedOrder, HttpStatus.CREATED);
    }
}
