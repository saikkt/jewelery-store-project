package com.eCommerce.jewelrystore.guest.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "jGuest")
public class Guest {

    @Column (name = "GuestID", length = 11)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long guestID;

    @NotNull
    @Column (name = "FirstName", length = 120)
    private String firstName;

    @NotNull
    @Column (name = "lastName", length = 120)
    private String lastName;

    @Email
    @NotNull
    @Column (name = "EmailAddress", length = 255)
    private String emailAddress;

    @NotNull
    @Column (name = "StreetAddress", length = 255)
    private String streetAddress;

    @Column (name = "ApartmentNumber", length = 10)
    private String apartmentNumber;

    @NotNull
    @Column (name = "City", length = 25)
    private String city;

    @NotNull
    @Column (name = "State", length = 30)
    private String state;

    @NotNull
    @Column (name = "ZipCode", length = 5)
    private long zipCode;

    protected Guest(){}


}
