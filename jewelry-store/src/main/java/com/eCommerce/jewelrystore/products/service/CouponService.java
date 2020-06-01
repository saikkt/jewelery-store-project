package com.eCommerce.jewelrystore.products.service;

import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.service.OrderService;
import com.eCommerce.jewelrystore.products.model.Coupon;
import com.eCommerce.jewelrystore.products.repositories.CouponRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class CouponService {

    @Autowired
    private CouponRepository couponRepository;

    @Autowired
    private OrderService orderService;

    public Coupon validateCoupon(String couponName) {
        Coupon coupon = couponRepository.findByCouponType(couponName);
        coupon.setValid(true);
        return coupon;
    }

}
