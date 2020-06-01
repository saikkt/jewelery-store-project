package com.eCommerce.jewelrystore.order.api;

import com.eCommerce.jewelrystore.adapter.ProductClient;
import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.domain.OrderItem;
import com.eCommerce.jewelrystore.order.dto.OrderItemModel;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@JsonSerialize
@Component
class OrderItemMapper {

    @Autowired
    private static ProductClient productClient;

    static OrderItem toEntity(Order order, OrderItemModel orderItemModel){
        OrderItem orderItem = new OrderItem(order,orderItemModel.getProductName());
        orderItem.setDiscount(orderItemModel.getDiscount());
        orderItem.setQuantity(orderItemModel.getQuantity());
        orderItem.setProductName(orderItemModel.getProductName());
        orderItem.setDiscountType(orderItemModel.getDiscountType());
//        System.out.println(productClient.getProductPriceByID(1));
//        BigDecimal big = productClient.getProductPriceByID(orderItem.getProductID());
//        orderItem.setUnitPrice(BigDecimal.ONE);
      //  orderItem.setUnitPrice(orderItemModel.getUnitPrice());
//        orderItem.setTotalPrice(orderItem.getUnitPrice().multiply(new BigDecimal(orderItem.getQuantity())));
        return orderItem;
    }

    static OrderItemModel toModel(OrderItem orderItem){
        OrderItemModel orderItemModel = new OrderItemModel();
        orderItemModel.setOrderID(orderItem.getOrder().getOrderID());
        orderItemModel.setOrderItemID(orderItem.getOrderItemID());
        orderItemModel.setDiscount(orderItem.getDiscount());
        orderItemModel.setDiscountType(orderItem.getDiscountType());
        orderItemModel.setProductName(orderItem.getProductName());
        orderItemModel.setQuantity(orderItem.getQuantity());
        orderItemModel.setUnitPrice(orderItem.getUnitPrice());
        orderItemModel.setTotalPrice(orderItem.getTotalPrice());
        return orderItemModel;
    }
}
