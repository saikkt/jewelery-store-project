package com.eCommerce.jewelrystore.guest.api;

import com.eCommerce.jewelrystore.guest.domain.GuestOrder;
import com.eCommerce.jewelrystore.guest.errorhandler.GuestException;
import com.eCommerce.jewelrystore.guest.model.GuestModel;
import com.eCommerce.jewelrystore.guest.model.GuestOrderModel;
import com.eCommerce.jewelrystore.guest.service.GuestOrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/guest-orders")
public class GuestOrderController {
    private GuestOrderService guestOrderService;

    public GuestOrderController(GuestOrderService guestOrderService) {
        this.guestOrderService = guestOrderService;
    }

    @GetMapping("/order-summary")
    public ResponseEntity<GuestOrderModel> orderSummary() throws GuestException {
       return ResponseEntity.ok(GuestOrderMapper.toModel(guestOrderService.orderSummary()));
    }

//    @PostMapping("/place-order")
//    public ResponseEntity<GuestOrderModel> placeOrder(@RequestBody @NotNull GuestModel guestModel) throws GuestException {
//        GuestOrder placedOrder = guestOrderService.saveGuestOrderAndItems(GuestMapper.toEntity(guestModel));
//        return new ResponseEntity<>(GuestOrderMapper.toModel(placedOrder),HttpStatus.CREATED);
//    }
}
