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

@Component
public class CartLoaderUtility {

    @Autowired
    OrderService orderService;

    @Autowired
    CartClient cartClient;

    @Transactional
    public void loadCartToCustomer(HttpSession session){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        MyUserDetails userDetails = (MyUserDetails) principal;
        Order order = orderService.getByCustomerIdInCart(userDetails.getCustomerId()).get(0);
        //exception handling pending
        if(order==null)
            return;
        orderService.deleteByOrderID(order.getOrderID());
       cartClient.getCartItems(session).entrySet().stream().forEach(p->{
           orderService.addToCart(p.getKey(),p.getValue());
       });
    }

    @Transactional
    public void loadCustomerToCart(HttpSession httpSession) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        MyUserDetails userDetails = (MyUserDetails) principal;
        Order order = orderService.getByCustomerIdInCart(userDetails.getCustomerId()).get(0);
        order.getOrderItems().stream().forEach(p->{
            try {
                cartClient.addItemToCart(p.getProductID(),p.getQuantity(),httpSession);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
