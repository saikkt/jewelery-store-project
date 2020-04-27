package com.eCommerce.jewelrystore.order.api;

import com.eCommerce.jewelrystore.accounts.models.MyUserDetails;
import com.eCommerce.jewelrystore.cart.service.CartService;
import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.domain.OrderItem;
import com.eCommerce.jewelrystore.order.domain.OrderStatus;
import com.eCommerce.jewelrystore.order.dto.OrderModel;
import com.eCommerce.jewelrystore.order.service.OrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;

    private CartService cartService;

    public OrderController(OrderService orderService,CartService cartService) {
        this.orderService = orderService;
        this.cartService = cartService;
    }

    //Admin access only
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping
    public ResponseEntity<List<OrderModel>> getAllOrders(@RequestParam(required = false) Optional<Integer> page,
                                                         @RequestParam(required = false) Optional<Integer> size) {
        List<OrderModel> orders = orderService.getAll(page.orElse(0),size.orElse(10)).stream()
                .map(OrderMapper::toModel)
                .collect(Collectors.toList());
        return ResponseEntity.ok(orders);
    }

    //Admin access only
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/order-status")
    public ResponseEntity<List<OrderModel>> getByOrderStatus(@RequestParam(name = "status") OrderStatus orderStatus) {
        List<OrderModel> orders = orderService.findByOrderStatus(orderStatus).stream()
                .map(OrderMapper::toModel)
                .collect(Collectors.toList());
        return ResponseEntity.ok(orders);
    }

    //Admin and user access
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
    @GetMapping("/history")
    public ResponseEntity<List<OrderModel>> getOrdersByCustomerID(@RequestParam(name = "customerID") long customerID) {
        List<OrderModel> customerOrders = orderService.getByCustomerID(customerID).stream()
                .map(OrderMapper::toModel)
                .collect(Collectors.toList());
        return ResponseEntity.ok(customerOrders);
    }

    //Admin Access only
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/{orderID}")
    public ResponseEntity<OrderModel> getByOrderID(@PathVariable(name = "orderID") long orderID) {
        Optional<Order> orderOptional = orderService.getByOrderID(orderID);
        if (!orderOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(OrderMapper.toModel(orderOptional.get()));
    }

//    @ApiOperation(value = "Called when an item is added to cart for the first time or buy now is pressed with only one item", response = Iterable.class)
//    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
//    @PostMapping("/saveOrder")
//    public ResponseEntity<OrderModel> saveOrder(@RequestBody OrderModel orderModel) {
//        if (orderModel.getOrderItems() == null || orderModel.getOrderItems().isEmpty()) {
//            return ResponseEntity.unprocessableEntity().build();
//        }
//        Order order = OrderMapper.toEntity(orderModel);
//
//        //setting customer Id
//        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        MyUserDetails userDetails = (MyUserDetails) principal;
//        long customerId = userDetails.getCustomerId();
//        order.setCustomerID(customerId);
//
//        //setting order status to "CART"
//        order.setOrderStatus(OrderStatus.CART);
//
//        //saving order
//        Order savedOrder = orderService.save(order);
//
//        return new ResponseEntity<>(OrderMapper.toModel(savedOrder), HttpStatus.CREATED);
//    }


    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
    @PutMapping("/updateOrder/{orderID}")
    public ResponseEntity<OrderModel> updateOrder(@PathVariable(name = "orderID") long orderID, @RequestBody OrderModel orderModel) {
        Optional<Order> orderOptional = orderService.getByOrderID(orderID);
        if (!orderOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
//        if (order.getVersion() != orderOptional.get().getVersion()) {
//            return new ResponseEntity<>(OrderMapper.toModel(orderOptional.get()), HttpStatus.CONFLICT);
//        }
        Order updatedOrder = orderService.save(OrderMapper.merge(orderOptional.get(),orderModel));
        return ResponseEntity.ok(OrderMapper.toModel(orderService.save(updatedOrder)));
    }

    //not used
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
    @PutMapping("/addToCart")
    public ResponseEntity<OrderModel> addToCart(@RequestParam(name = "productID") long productID,@RequestParam(name = "quantity") int quantity) {

       return ResponseEntity.ok().body(OrderMapper.toModel(orderService.addToCart(productID,quantity)));
    }

    //not used
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
    @PutMapping("/deleteFromCart/{productID}")
    public ResponseEntity<OrderModel> deleteFromCart(@PathVariable(name = "productID") long productID,@RequestParam(name = "quantity") int quantity) {

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        MyUserDetails userDetails = null;
        userDetails = (MyUserDetails) principal;
            Order order = orderService.deleteFromCart(userDetails.getCustomerId(),productID,quantity);
            return ResponseEntity.ok().body(OrderMapper.toModel(order));
    }


    // Admin/Admin Trusted API Access Only
    @PreAuthorize("hasRole('ROLE_ADMIN')")
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

    //Admin and user Access -- ADMIN FOR NOW
    @PreAuthorize("hasRole('ROLE_ADMIN')")
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
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @DeleteMapping("/{orderID}")
    public ResponseEntity<Order> deleteOrder(@PathVariable(name = "orderID") long orderID) {
        orderService.deleteByOrderID(orderID);
        return ResponseEntity.ok().build();
    }

}