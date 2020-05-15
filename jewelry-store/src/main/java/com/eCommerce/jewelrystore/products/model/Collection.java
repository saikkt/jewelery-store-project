package com.eCommerce.jewelrystore.products.model;

import javax.persistence.*;

@Entity
@Table(name="jCollections")
public class Collection {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CollectionID")
    private long collectionID;

    @Column(name="CollectionName")
    private String collectionName;

    @Column(name = "ImagePath")
    private String imagePath;

    public Collection() {
    }

    public long getCollectionID() {
        return collectionID;
    }

    public void setCollectionID(long collectionID) {
        this.collectionID = collectionID;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
