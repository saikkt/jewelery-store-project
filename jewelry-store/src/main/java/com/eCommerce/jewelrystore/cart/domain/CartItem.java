package com.eCommerce.jewelrystore.cart.domain;

import com.eCommerce.jewelrystore.adapter.CartClient;
import com.eCommerce.jewelrystore.customer.util.CartLoaderUtility;
import com.eCommerce.jewelrystore.products.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import javax.servlet.http.HttpSession;


public class CartItem {


    private long productID;
    private int quantity;
    private Product product;
    
    public CartItem() {
    	
    }

    public CartItem(long productID, int quantity,Product product) {
        this.productID = productID;
        this.quantity = quantity;
        this.product = product;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
