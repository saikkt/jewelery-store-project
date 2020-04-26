package com.eCommerce.jewelrystore.cart.domain;

public class CartItem {
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
}
