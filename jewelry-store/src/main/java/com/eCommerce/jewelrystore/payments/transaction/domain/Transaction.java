package com.eCommerce.jewelrystore.payments.transaction.domain;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "jTransactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TransactionID")
    private long transactionID;

    @Nullable
    @Column(name = "OrderID")
    private Long orderID;

    @Nullable
    @Column(name = "GuestOrderID")
    private Long guestOrderID;

    @Column(name = "ChargeID")
    private String chargeID;

    @Column(name = "ChargeAmount")
    private BigDecimal chargeAmount;

    @Version
    private long version = 1;

    @Column(name = "ObjectID")
    private UUID objectID = UUID.randomUUID();

    public Transaction(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return transactionID == that.transactionID;
    }

    @Override
    public int hashCode() {
        return objectID.hashCode();
    }

    public long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(long transactionID) {
        this.transactionID = transactionID;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public Long getGuestOrderID() {
        return guestOrderID;
    }

    public void setGuestOrderID(Long guestOrderID) {
        this.guestOrderID = guestOrderID;
    }

    public String getChargeID() {
        return chargeID;
    }

    public void setChargeID(String chargeID) {
        this.chargeID = chargeID;
    }

    public BigDecimal getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(BigDecimal chargeAmount) {
        this.chargeAmount = chargeAmount;
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
