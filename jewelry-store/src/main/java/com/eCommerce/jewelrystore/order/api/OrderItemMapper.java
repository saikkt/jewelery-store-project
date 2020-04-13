package com.eCommerce.jewelrystore.order.api;

import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.domain.OrderItem;
import com.eCommerce.jewelrystore.order.dto.OrderItemModel;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
class OrderItemMapper {

    static OrderItem toEntity(Order order, OrderItemModel orderItemModel){
        OrderItem orderItem = new OrderItem(order,orderItemModel.getProductID());
       // orderItem.setDiscount(orderItemModel.getDiscount());
        orderItem.setQuantity(orderItemModel.getQuantity());
     //   orderItem.setUnitPrice(orderItemModel.getUnitPrice());
     //   orderItem.setTotalPrice(orderItemModel.getTotalPrice());
        return orderItem;
    }

    static OrderItemModel toModel(OrderItem orderItem){
        OrderItemModel orderItemModel = new OrderItemModel();
        orderItemModel.setOrderID(orderItem.getOrder().getOrderID());
        orderItemModel.setOrderItemID(orderItem.getOrderItemID());
        orderItemModel.setDiscount(orderItem.getDiscount());
        orderItemModel.setProductID(orderItem.getProductID());
        orderItemModel.setQuantity(orderItem.getQuantity());
        orderItemModel.setUnitPrice(orderItem.getUnitPrice());
        orderItemModel.setTotalPrice(orderItem.getTotalPrice());
        return orderItemModel;
    }
}
