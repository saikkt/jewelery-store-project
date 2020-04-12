package com.eCommerce.jewelrystore.order.api;

import com.eCommerce.jewelrystore.order.domain.OrderItem;
import com.eCommerce.jewelrystore.order.dto.OrderItemModel;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
class OrderItemMapper {

    static OrderItem toEntity(OrderItemModel orderItemModel){
        OrderItem orderItem = new OrderItem(orderItemModel.getOrderID(),orderItemModel.getProductID());
        orderItem.setDiscount(orderItemModel.getDiscount());
        orderItem.setQuantity(orderItemModel.getQuantity());
        orderItem.setUnitPrice(orderItemModel.getUnitPrice());
        return orderItem;
    }
}
