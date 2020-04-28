package com.eCommerce.jewelrystore.products.api;

import com.eCommerce.jewelrystore.products.model.MetalPurity;
import com.eCommerce.jewelrystore.products.service.MetalPurityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/metalpurities")
public class MetalPurityController {

    private MetalPurityService metalPurityService;

    public MetalPurityController(MetalPurityService metalPurityService) {
        this.metalPurityService = metalPurityService;
    }

    @GetMapping
    public ResponseEntity<List<MetalPurity>> getAll(){
        return ResponseEntity.ok(metalPurityService.getAll());
    }

    @GetMapping("/{metalPurityID}")
    public ResponseEntity<MetalPurity> getByID(@PathVariable(name = "metalPurityID") long metalPurityID){
        final Optional<MetalPurity> metalPurityOptional = metalPurityService.findByID(metalPurityID);
        if(!metalPurityOptional.isPresent()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(metalPurityOptional.get());
    }

    @PostMapping
    public ResponseEntity<MetalPurity> save(@RequestBody MetalPurity metalPurity){
        return new ResponseEntity<>(metalPurityService.save(metalPurity), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<MetalPurity> update(@RequestBody MetalPurity metalPurity){
        Optional<MetalPurity> metalPurityOptional = metalPurityService.findByID(metalPurity.getMetalPurityID());
        if(!metalPurityOptional.isPresent()){
            return ResponseEntity.unprocessableEntity().build();
        }
        return ResponseEntity.ok(metalPurityService.save(metalPurity));
    }

    @DeleteMapping("/{metalPurityID}")
    public ResponseEntity<MetalPurity> delete(@PathVariable (name = "metalPurityID") long metalPurityID){
        metalPurityService.deleteByID(metalPurityID);
        return ResponseEntity.ok().build();
    }

}
