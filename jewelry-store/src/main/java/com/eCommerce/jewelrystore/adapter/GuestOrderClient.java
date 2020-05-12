package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.guest.domain.Guest;
import com.eCommerce.jewelrystore.guest.domain.GuestOrder;
import com.eCommerce.jewelrystore.guest.errorhandler.GuestException;
import com.stripe.model.Charge;

public interface GuestOrderClient {
    GuestOrder getGuestOrderSummary() throws GuestException;
    GuestOrder placeGuestOrder(Guest guest, Charge charge) throws GuestException;
}
