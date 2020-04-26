package com.eCommerce.jewelrystore.adapter;

import java.math.BigDecimal;

public interface ProductClient {
    BigDecimal getProductPriceByID(long productID);
    boolean isProductIDExists(long productID);
}
