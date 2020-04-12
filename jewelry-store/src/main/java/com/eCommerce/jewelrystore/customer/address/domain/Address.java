package com.eCommerce.jewelrystore.customer.address.domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "jAddresses")
public class Address {

    @Id
    @Column(name = "AddressID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressID;

    @Column(name = "CustomerID")
    private long customerID;

    @Column(name = "Street")
    private String street;

    @Column(name = "ApartmentNumber")
    private String apartmentNumber;

    @Column(name = "City")
    private String city;

    @Column(name = "State")
    private String state;

    @Column(name = "Country")
    private String country;

    @Column(name = "isDefaultShipping")
    private boolean isDefaultShipping;

    @Column(name = "isDefaultBilling")
    private boolean isDefaultBilling;

    @Version
    private long version;

    @Column(name = "ObjectID")
    private UUID objectID;

    protected Address(){ }

    public Address(long customerID, String street, String city, String state, String country) {
        this.customerID = customerID;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.objectID = UUID.randomUUID();
    }

    public long getAddressID() {
        return addressID;
    }

    public void setAddressID(long addressID) {
        this.addressID = addressID;
    }

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isDefaultShipping() {
        return isDefaultShipping;
    }

    public void setDefaultShipping(boolean defaultShipping) {
        isDefaultShipping = defaultShipping;
    }

    public boolean isDefaultBilling() {
        return isDefaultBilling;
    }

    public void setDefaultBilling(boolean defaultBilling) {
        isDefaultBilling = defaultBilling;
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
        this.objectID = objectID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return addressID == address.addressID;
    }

    @Override
    public int hashCode() {
        return objectID.hashCode();
    }
}
