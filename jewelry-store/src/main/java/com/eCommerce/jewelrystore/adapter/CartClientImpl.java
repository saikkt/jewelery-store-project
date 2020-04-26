package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.cart.domain.CartItem;
import com.eCommerce.jewelrystore.cart.service.CartService;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Component
public class CartClientImpl implements CartClient {

    private CartService cartService;

    public CartClientImpl(CartService cartService) {
        this.cartService = cartService;
    }

    @Override
    public HashMap<Long, Integer> getCartItems(HttpSession session) {
        //To do -- handle exception if cart is empty
        List<CartItem> cartItems = cartService.getCart(session);
        HashMap<Long, Integer> cartItemsHashMap = new HashMap<>();

        cartItems.forEach(
                cartItem ->
                        cartItemsHashMap.put(cartItem.getProductID(), cartItem.getQuantity()));
        return cartItemsHashMap;
    }
}
