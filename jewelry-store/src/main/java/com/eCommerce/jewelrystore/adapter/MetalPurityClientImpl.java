package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.products.model.MetalPurity;
import com.eCommerce.jewelrystore.products.service.MetalPurityService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MetalPurityClientImpl implements MetalPurityClient {

    private MetalPurityService metalPurityService;

    public MetalPurityClientImpl(MetalPurityService metalPurityService) {
        this.metalPurityService = metalPurityService;
    }

    @Override
    public List<MetalPurity> getAllMetalPurities() {
        return metalPurityService.getAll();
    }
}
