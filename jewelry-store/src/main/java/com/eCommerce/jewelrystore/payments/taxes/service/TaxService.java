package com.eCommerce.jewelrystore.payments.taxes.service;

import com.eCommerce.jewelrystore.payments.taxes.domain.Tax;
import com.eCommerce.jewelrystore.payments.taxes.repositories.TaxRepository;
import java.util.List;
import java.util.Optional;

import com.eCommerce.jewelrystore.products.model.Discount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxService {

    @Autowired
    TaxRepository taxRepository;

    public List<Tax> getAll(){
        return taxRepository.findAll();
    }

    public Tax getFederalTax(){
        Optional<Tax> tax = taxRepository.findByTaxType("FEDERAL");
        if(!tax.isPresent())
            throw new RuntimeException();
        return tax.get();
    }

    public Tax getByTaxType(String state){
        Optional<Tax> tax = taxRepository.findByTaxType(state);
        if(!tax.isPresent())
            throw new RuntimeException();
        return tax.get();
    }

    public Tax getNewYorkStateTax(){
        Optional<Tax> tax = taxRepository.findByTaxType("NEWYORK");
        if(!tax.isPresent())
            throw new RuntimeException();
        return tax.get();
    }

    public Tax save(Tax tax){
        return taxRepository.save(tax);
    }

    public void delete (Tax tax){
        taxRepository.delete(tax);
    }

    public Optional<Tax> findByID(long taxID) {
        return taxRepository.findById(taxID);
    }

    public List<Tax> saveAll(List<Tax> taxes) {
        return taxRepository.saveAll(taxes);
    }
}
