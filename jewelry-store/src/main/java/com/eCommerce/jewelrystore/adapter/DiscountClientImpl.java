package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.products.model.Discount;
import com.eCommerce.jewelrystore.products.service.DiscountService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DiscountClientImpl implements DiscountClient {

    private DiscountService discountService;

    public DiscountClientImpl(DiscountService discountService) {
        this.discountService = discountService;
    }

    @Override
    public List<Discount> getAllDiscounts() {
        return discountService.getAll();
    }
}
