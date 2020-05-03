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

    protected SubCategory(){}

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
}
