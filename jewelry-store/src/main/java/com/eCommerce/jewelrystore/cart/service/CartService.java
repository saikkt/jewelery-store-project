package com.eCommerce.jewelrystore.cart.service;

import com.eCommerce.jewelrystore.cart.domain.CartItem;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Calendar;
import java.util.List;

@Service
public interface CartService {
    List<CartItem> addItemToCart(long productID, int quantity, HttpSession session) throws Exception;
    List<CartItem> removeCartItem(long productID, HttpSession session) throws Exception;
    List<CartItem> updateCartItem(long productID, HttpSession session,int quantity) throws Exception;
    List<CartItem> getCart(HttpSession session);
    void emptyCart(HttpSession session);

    List<CartItem> updateCart(List<CartItem> cartItems,HttpSession session);
    // boolean decreaseQuantity(long productID);
   // boolean increaseQuantity(long productID);
}
