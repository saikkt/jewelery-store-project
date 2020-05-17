package com.eCommerce.jewelrystore.customer.wishlist.repository;

import com.eCommerce.jewelrystore.customer.wishlist.domain.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WishListRepository extends JpaRepository<WishList,Long> {
    WishList findByCustomerID(long customerId);
    Long deleteByCustomerID(long customerId);
}
