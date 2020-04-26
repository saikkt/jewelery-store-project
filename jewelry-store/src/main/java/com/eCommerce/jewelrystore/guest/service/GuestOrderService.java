package com.eCommerce.jewelrystore.guest.service;

import com.eCommerce.jewelrystore.guest.domain.Guest;
import com.eCommerce.jewelrystore.guest.domain.GuestOrder;
import com.eCommerce.jewelrystore.guest.errorhandler.GuestException;
import com.eCommerce.jewelrystore.guest.model.GuestModel;
import org.springframework.stereotype.Service;

@Service
public interface GuestOrderService {
    GuestOrder orderSummary() throws GuestException;
    GuestOrder saveGuestOrderAndItems(Guest guest) throws GuestException;
}
