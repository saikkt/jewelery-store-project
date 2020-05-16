package com.eCommerce.jewelrystore.customer.wishlist.model;

import com.eCommerce.jewelrystore.products.model.Product;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class WishListModel {

    private long customerID;
    private int wishListCount;
    private List<Product> wishListProducts;

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public int getWishListCount() {
        return wishListCount;
    }

    public void setWishListCount(int wishListCount) {
        this.wishListCount = wishListCount;
    }

    public List<Product> getWishListProducts() {
        return wishListProducts;
    }

    public void setWishListProducts(List<Product> wishListProducts) {
        this.wishListProducts = wishListProducts;
    }
}
