package com.eCommerce.jewelrystore.guest.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Table(name = "jGuest")
public class Guest {

    @Column(name = "GuestID", length = 11)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long guestID;

    @NotNull
    @Column(name = "FirstName", length = 120)
    private String firstName;

    @NotNull
    @Column(name = "LastName", length = 120)
    private String lastName;

    @Email
    @NotNull
    @Column(name = "EmailAddress", length = 255)
    private String emailAddress;

    @NotNull
    @Column(name = "StreetAddress", length = 255)
    private String streetAddress;

    @Column(name = "ApartmentNumber", length = 10)
    private String apartmentNumber;

    @NotNull
    @Column(name = "City", length = 25)
    private String city;

    @NotNull
    @Column(name = "State", length = 30)
    private String state;


    @NotNull
    @Column (name = "Country", length = 30)
    private String country;

    @NotNull
    @Column(name = "ZipCode", length = 5)
    private long zipCode;

    @Version
    private long version = 1;

    @Column(name = "ObjectID")
    private UUID objectID;

    protected Guest() {
    }

    public Guest(@NotNull String firstName,
                 @NotNull String lastName,
                 @Email @NotNull String emailAddress,
                 @NotNull String streetAddress,
                 @NotNull String city,
                 @NotNull String state,
                 @NotNull long zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.objectID = UUID.randomUUID();
    }

    public long getGuestID() {
        return guestID;
    }

    public void setGuestID(long guestID) {
        this.guestID = guestID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
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

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
        Guest guest = (Guest) o;
        return guestID == guest.guestID;
    }

    @Override
    public int hashCode() {
        return objectID.hashCode();
    }


}
