package com.eCommerce.jewelrystore.adapter;

import java.math.BigDecimal;

import com.eCommerce.jewelrystore.products.service.ProductService;
import org.springframework.stereotype.Component;

@Component
public class ProductClientImpl implements ProductClient {

    private ProductService productService;

    public ProductClientImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public BigDecimal getProductPriceByID(long productID) {
        return productService.getByProductID(productID).getPrice();
    }

    @Override
    public boolean isProductIDExists(long productID) {
        final boolean isProductExists = productService.getByProductID(productID) != null;
        return isProductExists;
    }
}
