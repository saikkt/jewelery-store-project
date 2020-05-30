package com.eCommerce.jewelrystore.products.model;

import javax.persistence.*;
import java.math.BigDecimal;

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
    private BigDecimal percentage;

//    @Column(name = "Worth")
//    private BigDecimal worth;

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

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

}
