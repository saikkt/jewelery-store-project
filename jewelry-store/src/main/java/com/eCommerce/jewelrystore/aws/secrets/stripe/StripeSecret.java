package com.eCommerce.jewelrystore.aws.secrets.stripe;

//Simple POJO to create a bean
public class StripeSecret {

    private String stripePublicKey;

    public String getStripePublicKey() {
        return stripePublicKey;
    }

    public void setStripePublicKey(String stripePublicKey) {
        this.stripePublicKey = stripePublicKey;
    }
}
