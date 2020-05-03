package com.eCommerce.jewelrystore.products.model;

import javax.persistence.*;

@Entity
@Table(name = "jCategories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryID")
    private long categoryID;

    @Column(name = "CategoryName")
    private String categoryName;

    @Column(name = "MEN")
    private boolean menSection;

    @Column(name = "WOMEN")
    private boolean womenSection;

    @Column(name = "KIDS")
    private boolean kidsSection;

//    @OneToMany(mappedBy = "category", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    private List<Product> products;

    public Category() {
    }

    public long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(long categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
