package com.eCommerce.jewelrystore.customer.wishlist.domain;

import com.eCommerce.jewelrystore.products.model.Product;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "JWishList")
public class WishList {

    @Column(name = "Id", length = 11)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "CustomerID", length = 11)
    private long customerID;

    @Column(name = "ProductsList", length = 200)
    private String productsList;

    @Version
    private long version;

    @Column(name = "ObjectID")
    private UUID objectID;

    protected WishList(){}

    public WishList(long customerID, String productsList) {
        this.customerID = customerID;
        this.productsList = productsList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public String getProductsList() {
        return productsList;
    }

    public void setProductsList(String productsList) {
        this.productsList = productsList;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public UUID getObjectID() {
        return objectID;
    }

    public void setObjectID(UUID objectID) {
        this.objectID = UUID.randomUUID();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof com.eCommerce.jewelrystore.customer.wishlist.domain.WishList)) {
            return false;
        }
        com.eCommerce.jewelrystore.customer.wishlist.domain.WishList other = (com.eCommerce.jewelrystore.customer.wishlist.domain.WishList) o;
        return this.objectID.equals(other.objectID);
    }

    @Override
    public int hashCode() {
        return objectID.hashCode();
    }
}
