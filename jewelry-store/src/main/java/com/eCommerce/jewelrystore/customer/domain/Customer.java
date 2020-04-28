/**
 *
 */
package com.eCommerce.jewelrystore.customer.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.UUID;

@Entity
@Table(name = "jCustomers")
public class Customer {

    @Column(name = "CustomerID", length = 11)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerID;

    @Column(name = "CustomerFirstName", length = 120)
    private String customerFirstName;

    @Column(name = "CustomerLastName", length = 120)
    private String CustomerLastName;

    @Column(name = "Phone", length = 20)
    private String phone;

    @Column(name = "EmailAddress")
    @Email
    private String emailAddress;

    @Column(name = "IsGuest", length = 1)
    private boolean isGuest;

    @Version
    private long version;

    @Column(name = "ObjectID")
    private UUID objectID;

    protected Customer(){}

    public Customer(String customerFirstName, String customerLastName, String emailAddress) {
        this.customerFirstName = customerFirstName;
        CustomerLastName = customerLastName;
        this.emailAddress = emailAddress;
        this.objectID = UUID.randomUUID();
    }

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
        String cleanPhone = null;
        if (phone != null) {
            cleanPhone = phone.trim();
        }
        if (cleanPhone != null && (cleanPhone.length() == 0 || cleanPhone.length() > 24 )) {
            throw new IllegalArgumentException("Phone must be between 1 and 24 characters.");
        }
        this.phone = cleanPhone;
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

    public UUID getObjectID() {
        return objectID;
    }

    public void setObjectID(UUID objectID) {
        this.objectID = UUID.randomUUID();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) o;
        return this.objectID.equals(other.objectID);
    }

    @Override
    public int hashCode() {
        return objectID.hashCode();
    }
}
