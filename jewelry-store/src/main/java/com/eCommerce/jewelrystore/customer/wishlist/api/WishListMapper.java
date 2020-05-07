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
}
