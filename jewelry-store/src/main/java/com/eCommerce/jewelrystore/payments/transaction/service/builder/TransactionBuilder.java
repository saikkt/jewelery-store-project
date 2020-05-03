package com.eCommerce.jewelrystore.payments.transaction.service.builder;

import com.eCommerce.jewelrystore.payments.transaction.domain.Transaction;

import java.math.BigDecimal;

public class TransactionBuilder {

    private Long orderID;
    private Long guestOrderID;
    private String chargeID;
    private BigDecimal chargeAmount;
    private Transaction transaction;

    public TransactionBuilder() {
        transaction = new Transaction();
    }

    public TransactionBuilder setOrderID(Long orderID) {
        transaction.setOrderID(orderID);
        return this;
    }

    public TransactionBuilder setGuestOrderID(Long guestOrderID) {
        transaction.setGuestOrderID(guestOrderID);
        return this;
    }

    public TransactionBuilder setChargeID(String chargeID) {
        transaction.setChargeAmount(chargeAmount);
        return this;
    }

    public TransactionBuilder setChargeAmount(BigDecimal chargeAmount){
        transaction.setChargeAmount(chargeAmount);
        return this;
    }

    public Transaction build(){
        return this.transaction;
    }
}
