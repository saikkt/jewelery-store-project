package com.eCommerce.jewelrystore.customer.wishlist.api;

import com.eCommerce.jewelrystore.customer.wishlist.domain.WishList;
import com.eCommerce.jewelrystore.customer.wishlist.model.WishListModel;
import org.springframework.stereotype.Component;


public class WishListMapper {

    public static WishListModel toModel(WishList wishList){
        WishListModel wishListModel = new WishListModel();
        wishListModel.setCustomerID(wishList.getCustomerID());
        wishListModel.setWishListCount(wishList.getProductsList().split("~").length);
        return wishListModel;
    }

    public static WishList toNewDomain(WishListModel wishListModel){
        StringBuilder productsList=new StringBuilder();
        wishListModel.getCartListProducts().stream().forEach(product->{
            productsList.append(product.getProductID());
        });
        WishList wishList = new WishList(wishListModel.getCustomerID(),productsList.toString());
        return  wishList;
    }

    public static WishList merge(WishListModel wishListModel, WishList wishList) {
        StringBuilder productsList=new StringBuilder(wishList.getProductsList());
        wishListModel.getCartListProducts().stream().forEach(product->{
            productsList.append(product.getProductID());
        });
        wishList.setProductsList(productsList.toString());
        return wishList;
    }
}
