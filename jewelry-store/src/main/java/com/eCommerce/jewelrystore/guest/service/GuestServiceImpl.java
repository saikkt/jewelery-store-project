package com.eCommerce.jewelrystore.guest.service;

import com.eCommerce.jewelrystore.guest.domain.Guest;
import com.eCommerce.jewelrystore.guest.repository.GuestRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GuestServiceImpl implements GuestService {

    private GuestRepository guestRepository;

    public GuestServiceImpl(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @Override
    public Optional<Guest> findByGuestID(long guestID) {
       return guestRepository.findById(guestID);
    }

    @Override
    public Guest save(Guest guest){

        //to do : handle exception if saving failed
        return guestRepository.save(guest);
    }
}
