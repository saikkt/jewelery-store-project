package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.products.model.MetalPurity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MetalPurityClient {
    List<MetalPurity> getAllMetalPurities();
}
