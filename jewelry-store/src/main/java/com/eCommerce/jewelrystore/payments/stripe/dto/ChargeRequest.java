package com.eCommerce.jewelrystore.payments.stripe.dto;

import com.eCommerce.jewelrystore.guest.model.GuestModel;

public class ChargeRequest {

    public enum Currency {
        EUR, USD;
    }

    private String description;
    private int amount; // cents
    private Currency currency;
    private String stripeEmail;
    private String stripeToken;
    private String addressID;
    private GuestModel guestModel; // Change to guest model when mapper is ready

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getStripeEmail() {
        return stripeEmail;
    }

    public void setStripeEmail(String stripeEmail) {
        this.stripeEmail = stripeEmail;
    }

    public String getStripeToken() {
        return stripeToken;
    }

    public void setStripeToken(String stripeToken) {
        this.stripeToken = stripeToken;
    }

    public String getAddressID() {
        return addressID;
    }

    public void setAddressID(String addressID) {
        this.addressID = addressID;
    }

    public GuestModel getGuestModel() {
        return guestModel;
    }

    public void setGuestModel(GuestModel guestModel) {
        this.guestModel = guestModel;
    }
}
