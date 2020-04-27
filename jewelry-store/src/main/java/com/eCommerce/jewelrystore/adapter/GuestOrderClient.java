package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.guest.domain.Guest;
import com.eCommerce.jewelrystore.guest.domain.GuestOrder;
import com.eCommerce.jewelrystore.guest.errorhandler.GuestException;

public interface GuestOrderClient {
    GuestOrder getGuestOrderSummary() throws GuestException;
    GuestOrder persistOrderSummary(Guest guest) throws GuestException;
}
