package com.eCommerce.jewelrystore.products.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

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
    @Column(name = "BestSeller")
    private boolean bestSeller;
    @Column(name = "TopProduct")
    private boolean topProduct;
    @Column(name = "ImagePath")
    private String imagePath;
    @Column(name = "MaterialID")
    private String materialID;
    @Column(name = "MetalPurityID")
    private String metalPurityID;
    @Column(name = "Discount")
    private BigDecimal discount;
    @Column(name = "CreateDate")
    @DateTimeFormat(pattern = "MM-dd-yyyy hh:mm:ss")
    private Date createDate;
    @Column(name = "UpdateDate")
    @DateTimeFormat(pattern = "MM-dd-yyyy hh:mm:ss")
    private Date updateDate;
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

    public long getSectionID() {
        return sectionID;
    }

    public long getCollectionID() {
        return collectionID;
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

    public boolean isBestSeller() {
        return bestSeller;
    }

    public void setBestSeller(boolean bestSeller) {
        this.bestSeller = bestSeller;
    }

    public boolean isTopProduct() {
        return topProduct;
    }

    public void setTopProduct(boolean topProduct) {
        this.topProduct = topProduct;
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


    public void setCategoryID(long categoryID) {
        this.categoryID = categoryID;
    }

    public void setSectionID(long sectionID) {
        this.sectionID = sectionID;
    }

    public void setCollectionID(long collectionID) {
        this.collectionID = collectionID;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getMaterialID() {
        return materialID;
    }

    public void setMaterialID(String materialID) {
        this.materialID = materialID;
    }

    public String getMetalPurityID() {
        return metalPurityID;
    }

    public void setMetalPurityID(String metalPurityID) {
        this.metalPurityID = metalPurityID;
    }
}
