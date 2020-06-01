package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.guest.domain.Guest;
import com.eCommerce.jewelrystore.guest.domain.GuestOrder;
import com.eCommerce.jewelrystore.guest.errorhandler.GuestException;
import com.eCommerce.jewelrystore.guest.model.GuestModel;
import com.stripe.model.Charge;

public interface GuestOrderClient {
    GuestOrder getGuestOrderSummary() throws GuestException;
    GuestOrder placeGuestOrder(GuestModel guestModel, Charge charge) throws GuestException;
    GuestOrder validateAndSetCoupon(GuestOrder guestOrder,String couponName) throws GuestException;
}
