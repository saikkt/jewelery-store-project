package com.eCommerce.jewelrystore.guest.api;

import com.eCommerce.jewelrystore.guest.domain.GuestOrder;
import com.eCommerce.jewelrystore.guest.model.GuestOrderModel;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.stream.Collectors;

class GuestOrderMapper {

    //Order Placed Date Format Style
   final static FormatStyle formatStyle = FormatStyle.FULL;

    static GuestOrder toEntity(GuestOrderModel guestOrderModel) {
        GuestOrder guestOrder = new GuestOrder();
        guestOrder.setGuestOrderItems(
                guestOrderModel.getGuestOrderItems()
                        .stream()
                        .map(guestOrderItem -> GuestOrderItemMapper.toEntity(guestOrderItem))
                        .collect(Collectors.toList())
        );
        return guestOrder;
    }

    static GuestOrderModel toModel(GuestOrder guestOrder) {
        GuestOrderModel guestOrderModel = new GuestOrderModel();
        guestOrderModel.setGuestID(guestOrder.getGuestID());
        guestOrderModel.setGuestOrderID(guestOrder.getGuestOrderID());
        guestOrderModel.setGuestOrderNumber(guestOrder.getGuestOrderNumber());
        guestOrderModel.setCheckoutPrice(guestOrder.getCheckoutPrice());
        //guestOrderModel.setOrderDate(guestOrder.getOrderDate());
        if (guestOrder.getOrderDate() != null) {
            guestOrderModel.setOrderPlacedDate(
                    guestOrder.getOrderDate()
                            .format(DateTimeFormatter.ofLocalizedDate(formatStyle)));
        }
        guestOrderModel.setOrderStatus(guestOrder.getOrderStatus());
        guestOrderModel.setGuestOrderNumber(guestOrder.getGuestOrderNumber());
        guestOrderModel.setGuestOrderItems(
                guestOrder.getGuestOrderItems().stream()
                        .map(guestOrderItem -> GuestOrderItemMapper.toModel(guestOrder, guestOrderItem))
                        .collect(Collectors.toList())
        );
        return guestOrderModel;
    }
}
