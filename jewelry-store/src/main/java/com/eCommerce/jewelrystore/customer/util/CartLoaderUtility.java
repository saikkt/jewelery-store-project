package com.eCommerce.jewelrystore.customer.util;

import com.eCommerce.jewelrystore.accounts.models.MyUserDetails;
import com.eCommerce.jewelrystore.adapter.CartClient;
import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class CartLoaderUtility {

    @Autowired
    OrderService orderService;

    @Autowired
    CartClient cartClient;

    public void loadCartToCustomer(HttpSession session){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        MyUserDetails userDetails = (MyUserDetails) principal;
        List<Order> order = orderService.getByCustomerIdInCart(userDetails.getCustomerId());
        //exception handling pending
        System.out.println(order.size());
        if(order.size()==0) {
            System.out.println(order.size());
            cartClient.getCartItems(session).entrySet().stream().forEach(p -> {
                orderService.addToCart(p.getKey(), p.getValue());
            });
            return;
        }
        orderService.deleteByOrderID(order.get(0).getOrderID());
       cartClient.getCartItems(session).entrySet().stream().forEach(p->{
           orderService.addToCart(p.getKey(),p.getValue());
       });
    }

    public void loadCustomerToCart(HttpSession httpSession) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        MyUserDetails userDetails = (MyUserDetails) principal;
        List<Order> order = orderService.getByCustomerIdInCart(userDetails.getCustomerId());
        if(order.size()==0)
            return;
        order.get(0).getOrderItems().stream().forEach(p->{
            try {
                cartClient.addItemToCart(p.getProductID(),p.getQuantity(),httpSession);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
