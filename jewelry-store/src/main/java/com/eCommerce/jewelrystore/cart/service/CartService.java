package com.eCommerce.jewelrystore.cart.service;

import com.eCommerce.jewelrystore.cart.domain.CartItem;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public interface CartService {
    List<CartItem> addItemToCart(long productID, int quantity, HttpSession session) throws Exception;
    List<CartItem> removeCartItem(long productID, HttpSession session) throws Exception;
    List<CartItem> getCart(HttpSession session);
    void emptyCart(HttpSession session);
   // boolean decreaseQuantity(long productID);
   // boolean increaseQuantity(long productID);
}
