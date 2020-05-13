package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.cart.domain.CartItem;
import com.eCommerce.jewelrystore.cart.service.CartService;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${cart.session.attribute.name}")
    private String cartSessionAttributeName;

    @Override
    public HashMap<Long, Integer> getCartItems(HttpSession session) {
        //To do -- handle exception if cart is empty
        List<CartItem> cartItems = cartService.getCart(session);
        HashMap<Long, Integer> cartItemsHashMap = new HashMap<>();
        if(cartItems != null)
        	cartItems.forEach(
        			cartItem ->
                        	cartItemsHashMap.put(cartItem.getProductID(), cartItem.getQuantity()));
        return cartItemsHashMap;
    }

    @Override
    public void emptyCart(HttpSession session) {
        session.removeAttribute(cartSessionAttributeName);
    }

    @Override
    public List<CartItem> addItemToCart(long productID, int quantity, HttpSession session) throws Exception{
       return cartService.addItemToCart(productID,quantity,session);
    }
}
