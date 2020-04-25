package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.cart.domain.CartItem;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

public interface CartClient {
    HashMap<Long,Integer> getCartItems(HttpSession session);
}
