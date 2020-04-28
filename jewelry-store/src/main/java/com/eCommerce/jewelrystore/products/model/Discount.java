package com.eCommerce.jewelrystore.products.model;

import javax.persistence.*;

@Entity
@Table(name = "jDiscount")
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DiscountID")
    private long discountID;

    @Column(name = "DiscountType")
    private String discountType;

    @Column(name = "Percentage")
    private double percentage;

    public Discount() {
    }

    public long getDiscountID() {
        return discountID;
    }

    public void setDiscountID(long discountID) {
        this.discountID = discountID;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
