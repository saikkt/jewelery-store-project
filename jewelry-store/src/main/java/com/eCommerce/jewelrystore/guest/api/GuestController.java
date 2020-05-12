package com.eCommerce.jewelrystore.guest.api;

import com.eCommerce.jewelrystore.guest.domain.Guest;
import com.eCommerce.jewelrystore.guest.errorhandler.GuestException;
import com.eCommerce.jewelrystore.guest.model.GuestModel;
import com.eCommerce.jewelrystore.guest.service.GuestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@RestController
@RequestMapping("/guests")
public class GuestController {

    private GuestService guestService;
    private HttpSession httpSession;

    public GuestController(GuestService guestService, HttpSession httpSession) {
        this.guestService = guestService;
        this.httpSession = httpSession;
    }

    //Admin Access Only
    @GetMapping("/{guestID}")
    public ResponseEntity<GuestModel> getByGuestID(@PathVariable(name = "guestID") long guestID){
        Optional<Guest> optionalGuest = guestService.findByGuestID(guestID);
        return optionalGuest.map(guest -> ResponseEntity.ok(GuestMapper.toModel(guest)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Admin or restricted Access
    //Guest is already created in guest order. Delete this if no longer needed
    @Deprecated
    @PostMapping
    public ResponseEntity<GuestModel> create(@RequestBody GuestModel guestModel) throws GuestException {
       Guest savedGuest =  guestService.save(GuestMapper.toEntity(guestModel));
       if(savedGuest == null){
           return ResponseEntity.unprocessableEntity().build();
       }

       return new ResponseEntity<>(GuestMapper.toModel(savedGuest), HttpStatus.CREATED);
    }
}
