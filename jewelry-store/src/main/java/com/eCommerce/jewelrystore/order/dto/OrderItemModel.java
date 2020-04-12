package com.eCommerce.jewelrystore.order.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.math.BigDecimal;
import java.util.UUID;

@JsonSerialize
public class OrderItemModel {
    @JsonProperty
    private long orderDetailsID;
    @JsonProperty
    private long orderID;
    @JsonProperty
    private long productID;
    @JsonProperty
    private BigDecimal unitPrice;
    @JsonProperty
    private int quantity;
    @JsonProperty
    private BigDecimal discount;
    @JsonProperty
    private long version;
    @JsonProperty
    private UUID objectID;

    public long getOrderDetailsID() {
        return orderDetailsID;
    }

    public void setOrderDetailsID(long orderDetailsID) {
        this.orderDetailsID = orderDetailsID;
    }

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
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
