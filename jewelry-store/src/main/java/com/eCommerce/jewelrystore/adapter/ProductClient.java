package com.eCommerce.jewelrystore.adapter;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public interface ProductClient {
    BigDecimal getProductPriceByID(long productID);
    boolean isProductIDExists(long productID);
}
