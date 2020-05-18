package com.eCommerce.jewelrystore.shipping.api;

import com.eCommerce.jewelrystore.products.model.Product;
import com.eCommerce.jewelrystore.products.service.ProductService;
import com.eCommerce.jewelrystore.shipping.domain.ShippingDetails;
import com.eCommerce.jewelrystore.shipping.errorhandler.ShippingDetailsException;
import com.eCommerce.jewelrystore.shipping.service.ShippingDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shippingDetails")
public class ShippingDetailsController {

    @Autowired
    ShippingDetailsService shippingDetailsService;

    @GetMapping("/getAll")
    public ResponseEntity<List<ShippingDetails>> getAllShippingDetails(){
        return  ResponseEntity.ok().body(shippingDetailsService.getAllShippingDetails());
    }

     @PostMapping("/postShipping")
    public ResponseEntity<ShippingDetails> postShipping(ShippingDetails shippingDetails) throws ShippingDetailsException {
        return ResponseEntity.ok().body(shippingDetailsService.postShipping(shippingDetails));
     }
}
