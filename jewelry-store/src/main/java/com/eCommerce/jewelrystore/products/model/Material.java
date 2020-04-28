package com.eCommerce.jewelrystore.products.model;

import javax.persistence.*;

@Entity
@Table(name = "jMaterials")
public class Material {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "MaterialID")
    private long materialID;

    @Column(name = "MaterialType")
    private String materialType;

    public Material() {
    }

    public long getMaterialID() {
        return materialID;
    }

    public void setMaterialID(long materialID) {
        this.materialID = materialID;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }
}
