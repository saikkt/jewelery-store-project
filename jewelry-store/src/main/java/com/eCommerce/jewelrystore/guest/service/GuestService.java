package com.eCommerce.jewelrystore.guest.service;

import com.eCommerce.jewelrystore.guest.domain.Guest;
import com.eCommerce.jewelrystore.guest.errorhandler.GuestException;
import com.eCommerce.jewelrystore.guest.model.GuestModel;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface GuestService {
    Optional<Guest> findByGuestID(long guestID);
    Guest save(Guest guest) throws GuestException;
}
