package com.eCommerce.jewelrystore.guest.service;

import com.eCommerce.jewelrystore.guest.domain.Guest;
import com.eCommerce.jewelrystore.guest.errorhandler.GuestException;
import com.eCommerce.jewelrystore.guest.repository.GuestRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@SuppressWarnings("unused")
@Component
public class GuestServiceImpl implements GuestService {

    private final GuestRepository guestRepository;

    public GuestServiceImpl(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @Override
    public Optional<Guest> findByGuestID(long guestID) {
        return guestRepository.findById(guestID);
    }

    @Override
    public Guest save(Guest guest) throws GuestException {
        Guest savedGuest;
        try {
            savedGuest = guestRepository.save(guest);
        } catch (Exception e) {
            throw new GuestException("Unable to save guest", e);
        }
        return savedGuest;
    }
}
