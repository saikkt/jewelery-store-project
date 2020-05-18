package com.eCommerce.jewelrystore.aws.secrets.stripe;

//Simple Entity to create a bean and access in payments
public class StripeSecret {

    private String stripePublicKey;

    public String getStripePublicKey() {
        return stripePublicKey;
    }

    public void setStripePublicKey(String stripePublicKey) {
        this.stripePublicKey = stripePublicKey;
    }
}
