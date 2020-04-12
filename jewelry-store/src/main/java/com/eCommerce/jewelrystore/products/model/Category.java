package com.eCommerce.jewelrystore.products.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "jCategories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryID")
    private long categoryID;

    @Column(name = "CategoryName")
    private String categoryName;

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
}
