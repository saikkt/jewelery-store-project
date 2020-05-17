package com.eCommerce.jewelrystore.customer.wishlist.api;

import com.eCommerce.jewelrystore.customer.wishlist.domain.WishList;
import com.eCommerce.jewelrystore.customer.wishlist.model.WishListModel;

import java.util.Arrays;
import java.util.List;

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
        wishListModel.getWishListProducts().stream().forEach(product->{
            productsList.append(product.getProductID()+"~");
        });
        WishList wishList = new WishList(wishListModel.getCustomerID(),productsList.toString());
        wishList.setCustomerID(wishListModel.getCustomerID());
        return  wishList;
    }

    public static WishList merge(WishListModel wishListModel, WishList wishList) {
        StringBuilder productsList=new StringBuilder();
        wishListModel.getWishListProducts().stream().forEach(product->{
            productsList.append(product.getProductID()+"~");
        });
        wishList.setProductsList(productsList.toString());
        wishList.setCustomerID(wishListModel.getCustomerID());
        return wishList;
    }
    


    // Added by seethend - start
    public static WishList mergeProduct(String productId, WishList wishList, long customerID) {
    	StringBuilder productsList=new StringBuilder(wishList.getProductsList());
    	String[] ProductIds = wishList.getProductsList().split("~");
    	
    	for(String productID: ProductIds) {
    		if(productID.equals(productId)) {
    			return wishList;
    		}
    	}
    	
    	productsList.append(productId+"~");
    	wishList.setProductsList(productsList.toString());
        wishList.setCustomerID(customerID);
        return wishList;
    }

	public static WishList removeProduct(String productId, WishList wishList, long customerId) {
		List<String> productIds = Arrays.asList(wishList.getProductsList().split("~"));
		
		StringBuilder newProductsList = new StringBuilder();
		
		for(String prodId: productIds) {
			if(prodId.equals(productId)) continue;
			newProductsList.append(prodId + "~");
		}
		
		wishList.setProductsList(newProductsList.toString());
		wishList.setId(wishList.getId());
		return wishList;
	}
    // Added by seethend - end
    
}
