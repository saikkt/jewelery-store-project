package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.products.model.Product;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public interface ProductClient {
    BigDecimal getProductPriceByID(long productID);
    boolean isProductIDExists(long productID);
    List<Product> getAllProducts();
    Product getProductByID(long productID);
    BigDecimal getProductDiscount(long productID);
}
