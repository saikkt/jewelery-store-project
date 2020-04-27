package com.eCommerce.jewelrystore.cart.domain;

import com.eCommerce.jewelrystore.adapter.CartClient;
import com.eCommerce.jewelrystore.customer.util.CartLoaderUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import javax.servlet.http.HttpSession;


public class CartItem {

    @Autowired
    private CartLoaderUtility cartLoaderUtility;

    private long productID;
    private int quantity;

    public CartItem(long productID, int quantity) {
        this.productID = productID;
        this.quantity = quantity;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @PreDestroy
    public void addItemsToCustomers(HttpSession httpSession){
        cartLoaderUtility.loadCartToCustomer(httpSession);
    }
}
