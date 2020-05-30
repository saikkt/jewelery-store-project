package com.eCommerce.jewelrystore.products.repositories;

import com.eCommerce.jewelrystore.products.model.Coupon;
import com.eCommerce.jewelrystore.products.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CouponRepository extends JpaRepository<Coupon, Long> {
    @Query(value = "select * from jCoupon d where d.Worth<>0",nativeQuery = true)
    List<Coupon> findAllCouponsWithWorth();
    Coupon findByCouponType(String couponType);
}