package com.eCommerce.jewelrystore.customer.address.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.UUID;

@JsonSerialize
public class AddressModel {

    @JsonProperty
    private long addressID;
    @JsonProperty
    private long customerID;
    @JsonProperty
    private String street;
    @JsonProperty
    private String apartmentNumber;
    @JsonProperty
    private String city;
    @JsonProperty
    private String state;
    @JsonProperty
    private String country;
    @JsonProperty
    private String zipCode;
    @JsonProperty
    private boolean isDefaultShipping;
    @JsonProperty
    private boolean isDefaultBilling;
    @JsonProperty
    private long version;
    @JsonProperty
    private UUID objectID;

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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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
}
