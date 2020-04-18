package com.eCommerce.jewelrystore.cart.domain;


import java.util.List;

public class Cart {
    private List<CartItem> cartItem;

    public Cart(List<CartItem> cartItem) {
        this.cartItem = cartItem;
    }

    public List<CartItem> getCartItem() {
        return cartItem;
    }

    public void setCartItem(List<CartItem> cartItem) {
        this.cartItem = cartItem;
    }
}
