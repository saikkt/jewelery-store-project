package com.eCommerce.jewelrystore.customer.wishlist.service;

import com.eCommerce.jewelrystore.accounts.models.MyUserDetails;
import com.eCommerce.jewelrystore.customer.wishlist.api.WishListMapper;
import com.eCommerce.jewelrystore.customer.wishlist.domain.WishList;
import com.eCommerce.jewelrystore.customer.wishlist.model.WishListModel;
import com.eCommerce.jewelrystore.customer.wishlist.repository.WishListRepository;
import com.eCommerce.jewelrystore.products.model.Product;
import com.eCommerce.jewelrystore.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class WishListService {

    @Autowired
    private WishListRepository wishListRepository;

    @Autowired
    ProductService productService;

    public WishList getByLoggedInCustomerId() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        MyUserDetails userDetails = (MyUserDetails) principal;
        long customerId = userDetails.getCustomerId();
        WishList wishList = wishListRepository.findByCustomerID(customerId);
        return wishList;
    }

    public WishList save(WishList wishListMapped) {
       return wishListRepository.save(wishListMapped);
    }

    public WishList update(WishList wishListMapped) {
        return save(wishListMapped);
    }

    @Transactional
    public void delete(long customerId) {
        wishListRepository.deleteByCustomerID(customerId);
    }
}
