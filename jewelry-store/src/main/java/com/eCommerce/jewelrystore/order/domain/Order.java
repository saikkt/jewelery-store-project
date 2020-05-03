package com.eCommerce.jewelrystore.order.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "jOrders")
public class Order {

    @Column(name = "OrderID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderID;

    @Column(name = "CustomerID")
    private long customerID;

  //  @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "MM-dd-yyyy hh:mm:ss")
    @Column(name = "OrderDate")
    private LocalDate orderDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "OrderStatus")
    private OrderStatus orderStatus;

    @Column(name = "CheckoutPrice")
    private BigDecimal checkoutPrice;

    @Version
    private long version;

    @Column(name = "ObjectID")
    private UUID objectID;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true,
            fetch = FetchType.EAGER)
    private List<OrderItem> orderItems = new ArrayList<>();

    protected Order(){
    }

    public Order(long customerID) {
        this.customerID = customerID;
        this.orderDate = LocalDate.now();
        this.orderStatus = OrderStatus.CART;
        this.objectID = UUID.randomUUID();
    }

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

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
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
        Order order = (Order) o;
        return orderID == order.orderID;
    }

    @Override
    public int hashCode() {
        return objectID.hashCode();
    }
}
