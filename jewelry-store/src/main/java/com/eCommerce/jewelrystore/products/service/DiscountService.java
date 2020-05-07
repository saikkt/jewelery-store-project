package com.eCommerce.jewelrystore.products.service;

import com.eCommerce.jewelrystore.products.model.Discount;
import com.eCommerce.jewelrystore.products.repositories.DiscountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiscountService {

    private DiscountRepository discountRepository;

    public DiscountService(DiscountRepository discountRepository) {
        this.discountRepository = discountRepository;
    }

    public List<Discount>  getAll(){
        return discountRepository.findAll();
    }

    public Optional<Discount> findByID(long discountID){
        return discountRepository.findById(discountID);
    }

    public Discount findByDiscountType(String discountType){
        return discountRepository.findByDiscountType(discountType);
    }

    public Discount save(Discount discount){
        return discountRepository.save(discount);
    }

    public void delete(long discountID){
        discountRepository.deleteById(discountID);
    }

    public Discount getByDiscountType(String discountType){return discountRepository.findByDiscountType(discountType);}

    public List<Discount> saveAll(List<Discount> discounts) {
		return discountRepository.saveAll(discounts);
	}
}
