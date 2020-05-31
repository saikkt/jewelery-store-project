package com.eCommerce.jewelrystore.products.api;

import com.eCommerce.jewelrystore.products.model.Coupon;
import com.eCommerce.jewelrystore.products.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coupons")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @GetMapping("/{couponName}")
    private ResponseEntity<Coupon> validateCoupon(@PathVariable(name="couponName") String couponName){
        Coupon coupon = couponService.validateCoupon(couponName);
        if(coupon==null)
            return ResponseEntity.ok().body(new Coupon(couponName));
        return ResponseEntity.ok().body(coupon);
    }
}
