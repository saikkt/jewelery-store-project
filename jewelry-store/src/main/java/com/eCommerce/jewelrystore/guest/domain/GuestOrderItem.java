package com.eCommerce.jewelrystore.guest.domain;

import com.eCommerce.jewelrystore.order.domain.Order;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "jGuestOrderItems")
public class GuestOrderItem {
    @Column(name = "GuestOrderItemID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long guestOrderItemID;

    @Column(name = "GuestOrderID")
    private long guestOrderID;

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

//    @JsonIgnore
//    @ManyToOne(optional = false)
//    @JoinColumn(name = "GuestOrderID")
//    private GuestOrder guestOrder;

    @Version
    private long version = 1;

    @Column(name = "ObjectID")
    private UUID objectID;

    protected GuestOrderItem(){}

    public GuestOrderItem( long productID, int quantity) {
        this.productID = productID;
        this.quantity = quantity;
        this.objectID = UUID.randomUUID();
    }


    public long getOrderItemID() {
        return guestOrderItemID;
    }

    public void setOrderItemID(long orderItemID) {
        this.guestOrderItemID = orderItemID;
    }

    public long getGuestOrderID() {
        return guestOrderID;
    }

    public void setGuestOrderID(long guestOrderID) {
        this.guestOrderID = guestOrderID;
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
        GuestOrderItem that = (GuestOrderItem) o;
        return guestOrderItemID == that.guestOrderItemID;
    }

    @Override
    public int hashCode() {
        return objectID.hashCode();
    }
}
