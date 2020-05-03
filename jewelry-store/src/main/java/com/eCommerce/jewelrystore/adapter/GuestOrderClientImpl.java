package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.guest.domain.Guest;
import com.eCommerce.jewelrystore.guest.domain.GuestOrder;
import com.eCommerce.jewelrystore.guest.errorhandler.GuestException;
import com.eCommerce.jewelrystore.guest.service.GuestOrderService;
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
    public GuestOrder placeGuestOrder(Guest guest) throws GuestException {
        return guestOrderService.saveGuestOrderAndItems(guest);
    }
}