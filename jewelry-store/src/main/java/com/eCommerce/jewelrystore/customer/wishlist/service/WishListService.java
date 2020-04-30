package com.eCommerce.jewelrystore.customer.wishlist.service;

import com.eCommerce.jewelrystore.customer.wishlist.domain.WishList;
import com.eCommerce.jewelrystore.customer.wishlist.repository.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListService {

    @Autowired
    private WishListRepository wishListRepository;


    public WishList getByCustomerId(long customerId) {
        return wishListRepository.findByCustomerID(customerId);
    }
}
