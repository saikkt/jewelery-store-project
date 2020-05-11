package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.products.model.Discount;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DiscountClient {
    List<Discount> getAllDiscounts();
}