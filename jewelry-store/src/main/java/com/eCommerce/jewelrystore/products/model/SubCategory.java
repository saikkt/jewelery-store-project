package com.eCommerce.jewelrystore.products.model;

import javax.persistence.*;

@Entity
@Table(name = "jSubCategories")
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SubCategoryID")
    private long subCategoryID;

    @Column(name = "CategoryID")
    private Long categoryID;

    @Column(name = "SubCategoryName")
    private String subCategoryName;

    @Column(name = "MEN")
    private boolean menSection;

    @Column(name = "WOMEN")
    private boolean womenSection;

    @Column(name = "KIDS")
    private boolean kidsSection;

    protected SubCategory() {
    }

    public long getSubCategoryID() {
        return subCategoryID;
    }

    public void setSubCategoryID(long subCategoryID) {
        this.subCategoryID = subCategoryID;
    }

    public Long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public boolean isMenSection() {
        return menSection;
    }

    public void setMenSection(boolean menSection) {
        this.menSection = menSection;
    }

    public boolean isWomenSection() {
        return womenSection;
    }

    public void setWomenSection(boolean womenSection) {
        this.womenSection = womenSection;
    }

    public boolean isKidsSection() {
        return kidsSection;
    }

    public void setKidsSection(boolean kidsSection) {
        this.kidsSection = kidsSection;
    }
}
