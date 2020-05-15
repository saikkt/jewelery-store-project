package com.eCommerce.jewelrystore.guest.api;

import com.eCommerce.jewelrystore.guest.domain.Guest;
import com.eCommerce.jewelrystore.guest.model.GuestModel;

public class GuestMapper {

    public static Guest toEntity(GuestModel guestModel) {
        Guest guest = new Guest(
                guestModel.getFirstName(),
                guestModel.getLastName(),
                guestModel.getEmailAddress(),
                guestModel.getStreetAddress(),
                guestModel.getCity(),
                guestModel.getState(),
                guestModel.getZipCode()
        );
        guest.setApartmentNumber(guestModel.getApartmentNumber());
        return guest;
    }

   public static GuestModel toModel(Guest guest) {
        GuestModel guestModel = new GuestModel();
        guestModel.setGuestID(guest.getGuestID());
        guestModel.setFirstName(guest.getFirstName());
        guestModel.setLastName(guest.getLastName());
        guestModel.setEmailAddress(guest.getEmailAddress());
        guestModel.setStreetAddress(guest.getStreetAddress());
        guestModel.setApartmentNumber(guest.getApartmentNumber());
        guestModel.setCity(guest.getCity());
        guestModel.setState(guest.getState());
        guestModel.setZipCode(guest.getZipCode());
        guestModel.setVersion(guest.getVersion());

        return guestModel;
    }
}
