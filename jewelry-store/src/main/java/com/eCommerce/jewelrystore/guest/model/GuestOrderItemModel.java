package com.eCommerce.jewelrystore.guest.model;

import com.eCommerce.jewelrystore.guest.domain.GuestOrder;
import com.eCommerce.jewelrystore.guest.domain.GuestOrderItem;
import com.eCommerce.jewelrystore.guest.domain.OrderStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@JsonSerialize
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GuestOrderItemModel {
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty
    private long guestOrderItemID;

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty
    private long guestOrderID;

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty
    private UUID guestOrderNumber;

    @JsonProperty
    private long productID;

    @JsonProperty
    private BigDecimal unitPrice;

    @JsonProperty
    private int quantity;

    @JsonProperty
    private BigDecimal discount;

    @JsonProperty
    private BigDecimal totalPrice;

    @JsonProperty
    private long version = 1;

    public long getGuestOrderItemID() {
        return guestOrderItemID;
    }

    public void setGuestOrderItemID(long guestOrderItemID) {
        this.guestOrderItemID = guestOrderItemID;
    }

    public long getGuestOrderID() {
        return guestOrderID;
    }

    public void setGuestOrderID(long guestOrderID) {
        this.guestOrderID = guestOrderID;
    }

    public UUID getGuestOrderNumber() {
        return guestOrderNumber;
    }

    public void setGuestOrderNumber(UUID guestOrderNumber) {
        this.guestOrderNumber = guestOrderNumber;
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

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}
