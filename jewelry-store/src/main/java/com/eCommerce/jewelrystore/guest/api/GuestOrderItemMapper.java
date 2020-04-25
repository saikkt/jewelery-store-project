package com.eCommerce.jewelrystore.guest.api;

import com.eCommerce.jewelrystore.guest.domain.GuestOrder;
import com.eCommerce.jewelrystore.guest.domain.GuestOrderItem;
import com.eCommerce.jewelrystore.guest.model.GuestOrderItemModel;

class GuestOrderItemMapper {

    static GuestOrderItem toEntity(GuestOrderItemModel guestOrderItemModel){
        return new GuestOrderItem(
                guestOrderItemModel.getProductID(),
                guestOrderItemModel.getQuantity());
    }

    static GuestOrderItemModel toModel(GuestOrder guestOrder, GuestOrderItem guestOrderItem){
        GuestOrderItemModel guestOrderItemModel = new GuestOrderItemModel();
        guestOrderItemModel.setGuestOrderItemID(guestOrderItem.getOrderItemID());
        guestOrderItemModel.setGuestOrderID(guestOrder.getGuestOrderID());
        guestOrderItemModel.setProductID(guestOrderItem.getProductID());
        guestOrderItemModel.setDiscount(guestOrderItem.getDiscount());
        guestOrderItemModel.setQuantity(guestOrderItem.getQuantity());
        guestOrderItemModel.setUnitPrice(guestOrderItem.getUnitPrice());
        guestOrderItemModel.setTotalPrice(guestOrderItem.getTotalPrice());
        guestOrderItemModel.setVersion(guestOrderItem.getVersion());
        return guestOrderItemModel;
    }
}
