package com.eCommerce.jewelrystore.order.dto;

import com.eCommerce.jewelrystore.order.domain.OrderStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@JsonSerialize
public class OrderModel {

    @JsonProperty
    private long orderID;
    @JsonProperty
    private long customerID;
    @JsonProperty
    private Date orderDate;
    @JsonProperty
    private OrderStatus orderStatus;
    @JsonProperty
    private long version;
    @JsonProperty
    private UUID objectID;
    @JsonProperty
    private List<OrderItemModel> orderItemModels;

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<OrderItemModel> getOrderItemModels() {
        return orderItemModels;
    }

    public void setOrderItemModels(List<OrderItemModel> orderItemModels) {
        this.orderItemModels = orderItemModels;
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
