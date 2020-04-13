package com.eCommerce.jewelrystore.order.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "jOrderItems")
public class OrderItem {
    @Column(name = "OrderItemID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderItemID;

    @Column(name = "ProductID")
    private long productID;

    @Column(name = "UnitPrice")
    private BigDecimal unitPrice;

    @Column(name = "Quantity")
    private int quantity;

    @Column(name = "Discount")
    private BigDecimal discount;

    @Column(name = "TotalPrice")
    private BigDecimal totalPrice;

    @JsonIgnore
    @ManyToOne(optional = false)
    @JoinColumn(name = "OrderID")
    private Order order;


    @Version
    private long version;

    @Column(name = "ObjectID")
    private UUID objectID;

    protected OrderItem(){}

    public OrderItem(Order order, long productID) {
        this.order = order;
        this.productID = productID;
        this.objectID = UUID.randomUUID();
    }

    public long getOrderItemID() {
        return orderItemID;
    }

    public void setOrderItemID(long orderItemID) {
        this.orderItemID = orderItemID;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
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

    public UUID getObjectID() {
        return objectID;
    }

    public void setObjectID(UUID objectID) {
        this.objectID = UUID.randomUUID();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem that = (OrderItem) o;
        return orderItemID == that.orderItemID;
    }

    @Override
    public int hashCode() {
        return objectID.hashCode();
    }
}
