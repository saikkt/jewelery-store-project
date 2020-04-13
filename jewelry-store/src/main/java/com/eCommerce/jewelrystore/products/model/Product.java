package com.eCommerce.jewelrystore.products.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "jProducts")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID")
    private long productID;

    @Column(name = "ProductName")
    private String productName;
    @Column(name = "CategoryID")
    private long categoryID;
    @Column(name = "SectionID")
    private long sectionID;
    @Column(name = "CollectionID")
    private long collectionID;
    @Column(name = "InStockQuantity")
    private int inStockQuantity;
    @Column(name = "Price")
    private BigDecimal price;
    @Column(name = "ImagePath")
    private String imagePath;
    @Version
    private int version;


  //  private UUID objectID;

    public Product() {
    }

//    @Override
//    public int hashCode() {
//        return objectID.hashCode();
//    }



//    public Product(UUID objectID) {
//
//        this.objectID=objectID;
//    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {

        this.productName = productName;

    }

    public long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public long getSectionID() {
        return sectionID;
    }

    public void setSectionID(int sectionID) {
        this.sectionID = sectionID;
    }

    public long getCollectionID() {
        return collectionID;
    }

    public void setCollectionID(int collectionID) {
        this.collectionID = collectionID;
    }

    public int getInStockQuantity() {
        return inStockQuantity;
    }

    public void setInStockQuantity(int inStockQuantity) {
        this.inStockQuantity = inStockQuantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

//    public UUID getObjectID() {
//        return objectID;
//    }
//
//    public void setObjectID(UUID objectID) {
//        this.objectID = objectID;
//    }
}
