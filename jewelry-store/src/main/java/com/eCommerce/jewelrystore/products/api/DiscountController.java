package com.eCommerce.jewelrystore.products.api;

import com.eCommerce.jewelrystore.products.model.Discount;
import com.eCommerce.jewelrystore.products.service.DiscountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/discounts")
public class DiscountController {

    private DiscountService discountService;

    public DiscountController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @GetMapping
    public ResponseEntity<List<Discount>> getAll(){
        return ResponseEntity.ok(discountService.getAll());
    }

    @GetMapping("/{discountID}")
    public ResponseEntity<Discount> findByID(@PathVariable (name = "discountID") long discountID){
        Optional<Discount> discountOptional = discountService.findByID(discountID);
        if(!discountOptional.isPresent()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(discountOptional.get());
    }

    @GetMapping("/find-by-discount-type")
    public ResponseEntity<Discount> findByDiscountType(@RequestParam(name = "discount-type") String discountType ){
        Discount discount = discountService.findByDiscountType(discountType);
        if(discount == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(discount);
    }

    @PostMapping
    public ResponseEntity<Discount> save(@RequestBody Discount discount){
        return new ResponseEntity<>(discountService.save(discount), HttpStatus.CREATED);
    }

    @PostMapping("/postDiscountList")
    public ResponseEntity<List<Discount>> save(@RequestBody List<Discount> discounts){
        return new ResponseEntity<>(discountService.saveAll(discounts), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Discount> update(@RequestBody Discount discount){
        Optional<Discount> discountOptional = discountService.findByID(discount.getDiscountID());
        if(!discountOptional.isPresent()) return ResponseEntity.unprocessableEntity().build();
        return ResponseEntity.ok(discountOptional.get());
    }

    @DeleteMapping("/{discountID}")
    public ResponseEntity<Discount> delete(@PathVariable (name = "discountID") long discountID){
        discountService.delete(discountID);
        return ResponseEntity.ok().build();
    }

 }
