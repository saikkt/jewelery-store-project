package com.eCommerce.jewelrystore.payments.taxes.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "jTaxes")
public class Tax {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TaxID")
    private long taxID;

    @Column(name = "TaxType")
    private String taxType;

    @Column(name = "Percentage")
    private BigDecimal percentage;

    @Column(name = "Worth")
    private BigDecimal worth;

    public Tax() {
    }

    public long getTaxID() {
        return taxID;
    }

    public void setTaxID(long taxID) {
        this.taxID = taxID;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public BigDecimal getWorth() {
        return worth;
    }

    public void setWorth(BigDecimal worth) {
        this.worth = worth;
    }
}
