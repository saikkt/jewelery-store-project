package com.eCommerce.jewelrystore.customer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Column;
import javax.persistence.Version;
import java.util.UUID;

@JsonSerialize
public class CustomerModel {

    @JsonProperty
    private long customerID;
    @JsonProperty
    private String customerFirstName;
    @JsonProperty
    private String CustomerLastName;
    @JsonProperty
    private String phone;
    @JsonProperty
    private String emailAddress;
    @JsonProperty
    private boolean isGuest;
    @JsonProperty
    private long version;

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return CustomerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        CustomerLastName = customerLastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean isGuest() {
        return isGuest;
    }

    public void setGuest(boolean guest) {
        isGuest = guest;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}
