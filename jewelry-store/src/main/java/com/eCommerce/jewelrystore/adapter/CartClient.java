package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.cart.domain.CartItem;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

public interface CartClient {
     List<CartItem> addItemToCart(long productID, int quantity, HttpSession session) throws Exception;
     HashMap<Long,Integer> getCartItems(HttpSession session);
     void emptyCart(HttpSession session);
}
