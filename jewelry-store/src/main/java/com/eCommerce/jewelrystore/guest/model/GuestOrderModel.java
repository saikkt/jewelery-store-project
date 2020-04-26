package com.eCommerce.jewelrystore.guest.model;

import com.eCommerce.jewelrystore.guest.domain.GuestOrderItem;
import com.eCommerce.jewelrystore.guest.domain.OrderStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@JsonSerialize
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GuestOrderModel {

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty
    private long guestOrderID;

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty
    private long guestID;

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty
    private UUID guestOrderNumber;

    @JsonIgnore
    private LocalDate orderDate;

    @JsonProperty
    private String orderPlacedDate;

    @JsonProperty
    private OrderStatus orderStatus;

    @JsonProperty
    private BigDecimal checkoutPrice;

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty
    private long version = 1;

    @JsonProperty
    private List<GuestOrderItemModel> guestOrderItems = new ArrayList<>();



    public long getGuestOrderID() {
        return guestOrderID;
    }

    public void setGuestOrderID(long guestOrderID) {
        this.guestOrderID = guestOrderID;
    }

    public long getGuestID() {
        return guestID;
    }

    public void setGuestID(long guestID) {
        this.guestID = guestID;
    }

    public UUID getGuestOrderNumber() {
        return guestOrderNumber;
    }

    public void setGuestOrderNumber(UUID guestOrderNumber) {
        this.guestOrderNumber = guestOrderNumber;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderPlacedDate() {
        return orderPlacedDate;
    }

    public void setOrderPlacedDate(String orderPlacedDate) {
        this.orderPlacedDate = orderPlacedDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getCheckoutPrice() {
        return checkoutPrice;
    }

    public void setCheckoutPrice(BigDecimal checkoutPrice) {
        this.checkoutPrice = checkoutPrice;
    }

    public List<GuestOrderItemModel> getGuestOrderItems() {
        return guestOrderItems;
    }

    public void setGuestOrderItems(List<GuestOrderItemModel> guestOrderItems) {
        this.guestOrderItems = guestOrderItems;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}
