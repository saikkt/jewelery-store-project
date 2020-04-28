package com.eCommerce.jewelrystore.products.model;

import javax.persistence.*;

@Entity
@Table(name = "jMetalPurity")
public class MetalPurity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MetalPurityID")
    private long metalPurityID;

    @Column(name = "Purity")
    private String purity;

    public MetalPurity(){}

    public long getMetalPurityID() {
        return metalPurityID;
    }

    public void setMetalPurityID(long metalPurityID) {
        this.metalPurityID = metalPurityID;
    }

    public String getPurity() {
        return purity;
    }

    public void setPurity(String purity) {
        this.purity = purity;
    }
}
