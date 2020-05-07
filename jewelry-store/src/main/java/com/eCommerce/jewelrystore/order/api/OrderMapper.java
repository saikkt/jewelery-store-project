package com.eCommerce.jewelrystore.order.api;

import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.domain.OrderItem;
import com.eCommerce.jewelrystore.order.dto.OrderItemModel;
import com.eCommerce.jewelrystore.order.dto.OrderModel;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class OrderMapper {
    static Order toEntity(OrderModel orderModel) {
        Order order = new Order(orderModel.getCustomerID());
        order.setOrderItems(
                orderModel.getOrderItems()
                        .stream()
                        .map(orderItemModel -> OrderItemMapper.toEntity(order, orderItemModel))
                        .collect(Collectors.toList())
        );
        return order;
    }

    static OrderModel toModel(Order order) {
        OrderModel orderModel = new OrderModel();
        orderModel.setOrderID(order.getOrderID());
        orderModel.setCustomerID(order.getCustomerID());
        orderModel.setOrderDate(order.getOrderDate());
        orderModel.setOrderStatus(order.getOrderStatus());
        orderModel.setCheckoutPrice(order.getCheckoutPrice());
        orderModel.setOrderItems(
                order.getOrderItems().stream().map(OrderItemMapper::toModel).collect(Collectors.toList())
        );
        return orderModel;
    }

    static Order merge(Order entity, OrderModel orderModel) {
        //entity

        entity.getOrderItems().addAll(orderModel
                        .getOrderItems()
                        .stream()
                        .map(orderItemModel -> OrderItemMapper.toEntity(entity, orderItemModel))
                        .collect(Collectors.toList()));
//        entity.setOrderItems(
//                orderModel
//                        .getOrderItems()
//                        .stream()
//                        .map(orderItemModel -> OrderItemMapper.toEntity(entity, orderItemModel))
//                        .collect(Collectors.toList())
//        );
        return entity;
    }
}
