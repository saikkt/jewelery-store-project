package com.eCommerce.jewelrystore.order.api;

import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.domain.OrderStatus;
import com.eCommerce.jewelrystore.order.dto.OrderModel;
import com.eCommerce.jewelrystore.order.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    //Admin access only
    @GetMapping
    public ResponseEntity<List<OrderModel>> getAllOrders(@RequestParam(required = false) Optional<Integer> page,
                                                         @RequestParam(required = false) Optional<Integer> size) {
        List<OrderModel> orders = orderService.getAll(page.orElse(0),size.orElse(10)).stream()
                .map(OrderMapper::toModel)
                .collect(Collectors.toList());
        return ResponseEntity.ok(orders);
    }

    //Admin access only
    @GetMapping("/order-status")
    public ResponseEntity<List<OrderModel>> getByOrderStatus(@RequestParam(name = "status") OrderStatus orderStatus) {
        List<OrderModel> orders = orderService.findByOrderStatus(orderStatus).stream()
                .map(OrderMapper::toModel)
                .collect(Collectors.toList());
        return ResponseEntity.ok(orders);
    }

    //Admin and user access
    @GetMapping("/history")
    public ResponseEntity<List<OrderModel>> getOrdersByCustomerID(@RequestParam(name = "customerID") long customerID) {
        List<OrderModel> customerOrders = orderService.getByCustomerID(customerID).stream()
                .map(OrderMapper::toModel)
                .collect(Collectors.toList());
        return ResponseEntity.ok(customerOrders);
    }

    //Admin Access only
    @GetMapping("/{orderID}")
    public ResponseEntity<OrderModel> getByOrderID(@PathVariable(name = "orderID") long orderID) {
        Optional<Order> orderOptional = orderService.getByOrderID(orderID);
        if (!orderOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(OrderMapper.toModel(orderOptional.get()));
    }


    //Admin Access Only
    @PostMapping
    public ResponseEntity<OrderModel> save(@RequestBody OrderModel orderModel) {
        if (orderModel.getOrderItems() == null || orderModel.getOrderItems().isEmpty()) {
            return ResponseEntity.unprocessableEntity().build();
        }
        Order savedOrder = orderService.save(OrderMapper.toEntity(orderModel));
        return new ResponseEntity<>(OrderMapper.toModel(savedOrder), HttpStatus.CREATED);
    }

    //Admin Access Only
    @PutMapping("/{orderID}")
    public ResponseEntity<OrderModel> update(@PathVariable(name = "orderID") long orderID, @RequestBody Order order) {
        Optional<Order> orderOptional = orderService.getByOrderID(orderID);
        if (!orderOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        if (order.getVersion() != orderOptional.get().getVersion()) {
            return new ResponseEntity<>(OrderMapper.toModel(orderOptional.get()), HttpStatus.CONFLICT);
        }
        return ResponseEntity.ok(OrderMapper.toModel(orderService.save(order)));
    }

    // Admin/Admin Trusted API Access Only
    @PutMapping("/orderShipped/{orderID}")
    public ResponseEntity<OrderModel> updateShippingStatus(@PathVariable(name = "orderID") long orderID) {
        Optional<Order> orderOptional = orderService.getByOrderID(orderID);
        if (!orderOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        if (orderOptional.get().getOrderStatus() == OrderStatus.CANCELLED) {
            return ResponseEntity.unprocessableEntity().build();
        }
        Order processingOrder = orderOptional.get();
        processingOrder.setOrderStatus(OrderStatus.SHIPPED);
        return ResponseEntity.ok(OrderMapper.toModel(orderService.save(processingOrder)));
    }

    //Admin and user Access
    @PutMapping("/cancelOrder/{orderID}")
    public ResponseEntity<OrderModel> cancelOrder(@PathVariable(name = "orderID") long orderID) {
        Optional<Order> orderOptional = orderService.getByOrderID(orderID);
        if (!orderOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        if (orderOptional.get().getOrderStatus() == OrderStatus.SHIPPED) {
            return ResponseEntity.unprocessableEntity().build();
        }
        Order processingOrder = orderOptional.get();
        processingOrder.setOrderStatus(OrderStatus.CANCELLED);
        return ResponseEntity.ok(OrderMapper.toModel(orderService.save(processingOrder)));
    }

    //Admin Access Only
    @DeleteMapping("/{orderID}")
    public ResponseEntity<Order> deleteOrder(@PathVariable(name = "orderID") long orderID) {
        orderService.deleteByOrderID(orderID);
        return ResponseEntity.ok().build();
    }

}