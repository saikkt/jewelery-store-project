package com.eCommerce.jewelrystore.order.adapter;

import java.math.BigDecimal;

public interface ProductClient {
    BigDecimal getProductPriceByID(long productID);
}
