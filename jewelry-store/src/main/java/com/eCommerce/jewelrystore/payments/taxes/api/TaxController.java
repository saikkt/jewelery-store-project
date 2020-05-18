package com.eCommerce.jewelrystore.payments.taxes.api;

import com.eCommerce.jewelrystore.payments.taxes.domain.Tax;
import com.eCommerce.jewelrystore.payments.taxes.service.TaxService;
import com.eCommerce.jewelrystore.products.model.Discount;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/taxes")
public class TaxController {

    private TaxService taxService;

    public TaxController(TaxService taxService) {
        this.taxService = taxService;
    }

    @GetMapping
    public ResponseEntity<List<Tax>> getAll() {
        return ResponseEntity.ok(taxService.getAll());
    }

    @GetMapping("/{taxID}")
    public ResponseEntity<Tax> findByID(@PathVariable(name = "taxID") long taxID) {
        Optional<Tax> discountOptional = taxService.findByID(taxID);
        if (!discountOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(discountOptional.get());
    }

    @GetMapping("/find-by-tax-type")
    public ResponseEntity<Tax> findByTaxType(@RequestParam(name = "tax-type") String taxType) {
        Tax tax = taxService.getByTaxType(taxType);
        if (tax == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(tax);
    }

    @GetMapping("/find-federal-tax")
    public ResponseEntity<Tax> findFederalTax() {
        Tax tax = taxService.getFederalTax();
        if (tax == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(tax);
    }

    @PostMapping
    public ResponseEntity<Tax> save(@RequestBody Tax tax) {
        return new ResponseEntity<>(taxService.save(tax), HttpStatus.CREATED);
    }

    @PostMapping("/postTaxList")
    public ResponseEntity<List<Tax>> save(@RequestBody List<Tax> taxes) {
        return new ResponseEntity<>(taxService.saveAll(taxes), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Tax> update(@RequestBody Tax tax) {
        Optional<Tax> taxOptional = taxService.findByID(tax.getTaxID());
        if (!taxOptional.isPresent()) return ResponseEntity.unprocessableEntity().build();
        return ResponseEntity.ok(taxOptional.get());
    }

    @DeleteMapping("/{taxID}")
    public ResponseEntity<Tax> delete(@PathVariable(name = "taxID") long taxID) {
        Optional<Tax> tax = taxService.findByID(taxID);
        taxService.delete(tax.get());
        return ResponseEntity.ok().build();
    }
}
