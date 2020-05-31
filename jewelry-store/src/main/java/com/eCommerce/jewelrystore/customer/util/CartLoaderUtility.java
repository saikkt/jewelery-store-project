package com.eCommerce.jewelrystore.customer.util;

import com.eCommerce.jewelrystore.accounts.models.MyUserDetails;
import com.eCommerce.jewelrystore.adapter.CartClient;
import com.eCommerce.jewelrystore.adapter.ProductClient;
import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.service.OrderService;
import com.eCommerce.jewelrystore.products.model.Product;
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

    @Autowired
    ProductClient productClient;

    public void loadCartToCustomer(HttpSession session){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        MyUserDetails userDetails = (MyUserDetails) principal;
        List<Order> order = orderService.getByCustomerIdInCart(userDetails.getCustomerId());
        //exception handling pending
        if(order.size()==0) {
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
    
    public void removeCartIfExists() {
    	Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        MyUserDetails userDetails = (MyUserDetails) principal;
        List<Order> order = orderService.getByCustomerIdInCart(userDetails.getCustomerId());
        
        if(order != null && order.size() > 0)
        	orderService.deleteByOrderID(order.get(0).getOrderID());
    }

    public void loadCustomerToCart(HttpSession httpSession) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        MyUserDetails userDetails = (MyUserDetails) principal;
        List<Order> order = orderService.getByCustomerIdInCartRefreshed(userDetails.getCustomerId());
        if(order.size()==0)
            return;
        Order order_refreshed = orderService.refreshOrder(order.get(0));
        order_refreshed.getOrderItems().stream().forEach(orderItem->{
            try {
                cartClient.addItemToCart(productClient.getProductByName(orderItem.getProductName()).getProductID(),orderItem.getQuantity(),httpSession);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
