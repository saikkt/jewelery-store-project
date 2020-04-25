package com.eCommerce.jewelrystore.guest.domain;

import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.domain.OrderItem;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table (name = "jGuestOrders")
public class GuestOrder {

    //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GuestOrderID")
    private long guestOrderID;

    @Column(name = "GuestID")
    private long guestID;

    @Column(name = "GuestOrderNumber")
    private UUID guestOrderNumber;

    @Column(name = "OrderDate")
    private LocalDate orderDate;

    @Column (name = "OrderStatus")
    private OrderStatus orderStatus;

    @Column (name = "CheckoutPrice")
    private BigDecimal checkoutPrice;

    @Transient
    List<GuestOrderItem> guestOrderItems;
    @Version
    private long version;

    @Column(name = "ObjectID")
    private UUID objectID;


    public GuestOrder() {

    }



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

    public List<GuestOrderItem> getGuestOrderItems() {
        return guestOrderItems;
    }

    public void setGuestOrderItems(List<GuestOrderItem> guestOrderItems) {
        this.guestOrderItems = guestOrderItems;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuestOrder guestOrder = (GuestOrder) o;
        return guestOrderID == guestOrder.guestOrderID;
    }

    @Override
    public int hashCode() {
        return objectID.hashCode();
    }
}
