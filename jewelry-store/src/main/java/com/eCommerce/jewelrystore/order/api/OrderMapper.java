package com.eCommerce.jewelrystore.order.api;

import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.dto.OrderModel;

class OrderMapper {
    static Order toEntity(OrderModel orderModel){
        Order order = new Order(orderModel.getCustomerID());
        orderModel.getOrderItemModels().stream()
                .forEach(orderItem ->
                        order.addItem(OrderItemMapper.toEntity(orderItem)));
        return order;
    }
}
