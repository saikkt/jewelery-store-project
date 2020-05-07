package com.eCommerce.jewelrystore.order.service;

import com.eCommerce.jewelrystore.accounts.models.MyUserDetails;
import com.eCommerce.jewelrystore.adapter.ProductClient;
import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.domain.OrderItem;
import com.eCommerce.jewelrystore.order.domain.OrderStatus;
import com.eCommerce.jewelrystore.order.repository.OrderRepository;
import com.eCommerce.jewelrystore.products.service.ProductService;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {


    private OrderRepository orderRepository;
    private ProductClient productClient;
    private ProductService productService;

    public OrderService(OrderRepository orderRepository, ProductClient productClient,ProductService productService) {
        this.orderRepository = orderRepository;
        this.productClient = productClient;
        this.productService = productService;
    }

    public List<Order> getAll(int page, int size) {
        return orderRepository.findAll(PageRequest.of(page, size)).toList();
    }

    public List<Order> getByCustomerID(long customerID) {
        return orderRepository.findByCustomerID(customerID);
    }

    public Order save(Order order) {
        //Set Order
        //Get Unit Price
        //Calculate Total price
        //******To Do******
        //Get Discount from discount table
        //Get Tax From tax table (Not Sure How tax is calculated. Either for individual product or total price)

//        order.getOrderItems().stream().forEach(orderItem -> {
//            System.out.println(productClient.getProductPriceByID(orderItem.getProductID()));
//        });

//        for(int i=0;i<order.getOrderItems().size();i++){
//            System.out.println(productClient.getProductPriceByID(order.getOrderItems().get(i).getProductID()));
//        }

        order.getOrderItems().stream()
                .forEach(orderItem -> {
                    orderItem.setOrder(order);
                   System.out.println(productService.getByProductID(orderItem.getProductID()));
//                    orderItem.setUnitPrice(productClient.getProductPriceByID(orderItem.getProductID()));
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


    public Order addToCart(long productID,int quantity){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        MyUserDetails userDetails = null;
        userDetails = (MyUserDetails) principal;
        List<Order> order_list = getByCustomerIdInCart(userDetails.getCustomerId());
        Order order = null;
        if(order_list.size()!=0)
             order = order_list.get(0);
        if(order==null)
        {
            Order order_new = new Order(userDetails.getCustomerId());
            OrderItem orderItem = new OrderItem(order_new,productID);
            orderItem.setQuantity(quantity);
            orderItem.setUnitPrice(productClient.getProductPriceByID(orderItem.getProductID()));
            List<OrderItem> orderItemsList = new ArrayList<>();
            orderItemsList.add(orderItem);
            order_new.setOrderItems(orderItemsList);
            return save(order_new);
        }
        else
        {
            OrderItem orderItem = new OrderItem(order,productID);
            orderItem.setQuantity(quantity);
            orderItem.setUnitPrice(productClient.getProductPriceByID(orderItem.getProductID()));
            order.getOrderItems().add(orderItem);
            return save(order);
        }
    }


    public Order updateOrder(Order order){
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


    public List<Order> getByCustomerIdInCart(long customerId) {
        return orderRepository.findByCustomerIDCartStatus(customerId);
    }

    public Order deleteFromCart(long customerID,long productID,int quantity) {
        Order order = getByCustomerIdInCart(customerID).get(0);

        //considering front end restricts the condition quantity>getQuantity()
        order.getOrderItems().stream().forEach(p->{
            if(p.getProductID()==productID){
                p.setQuantity(p.getQuantity()-quantity);
            }
        });

        //saving back order
       return  save(order);
    }
}
