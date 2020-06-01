package com.eCommerce.jewelrystore.products.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "jCoupon")
public class  Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CouponID")
    private long couponID;

    @Column(name = "CouponType")
    private String couponType;

    @Column(name = "Worth")
    private BigDecimal worth;

    @Column(name = "LimitPerCustomer")
    private long limitPerCustomer;

    @JsonInclude()
    @Transient
    private boolean isValid;

//    @Column(name = "Worth")
//    private BigDecimal worth;

    protected Coupon() {
    }

    public Coupon(String couponType){
        this.couponType=couponType;
        this.isValid=false;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public long getCouponID() {
        return couponID;
    }

    public void setCouponID(long couponID) {
        this.couponID = couponID;
    }

    public BigDecimal getWorth() {
        return worth;
    }

    public void setWorth(BigDecimal worth) {
        this.worth = worth;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public long getLimitPerCustomer() {
        return limitPerCustomer;
    }

    public void setLimitPerCustomer(long limitPerCustomer) {
        this.limitPerCustomer = limitPerCustomer;
    }
}
