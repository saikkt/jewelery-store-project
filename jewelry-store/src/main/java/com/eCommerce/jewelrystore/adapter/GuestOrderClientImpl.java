package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.guest.domain.Guest;
import com.eCommerce.jewelrystore.guest.domain.GuestOrder;
import com.eCommerce.jewelrystore.guest.errorhandler.GuestException;
import com.eCommerce.jewelrystore.guest.model.GuestModel;
import com.eCommerce.jewelrystore.guest.service.GuestOrderService;
import com.stripe.model.Charge;
import org.springframework.stereotype.Component;

@Component
public class GuestOrderClientImpl implements GuestOrderClient {

    private GuestOrderService guestOrderService;

    public GuestOrderClientImpl(GuestOrderService guestOrderService) {
        this.guestOrderService = guestOrderService;
    }

    @Override
    public GuestOrder getGuestOrderSummary() throws GuestException {
        return guestOrderService.orderSummary();
    }

    @Override
    public GuestOrder placeGuestOrder(GuestModel guestModel, Charge charge) throws GuestException {
        return guestOrderService.saveGuestOrderAndItems(guestModel,charge);
    }

    @Override
    public GuestOrder validateAndSetCoupon(GuestOrder guestOrder,String couponName) throws GuestException {
        return guestOrderService.validateAndSetCoupon(guestOrder,couponName);
    }
}
