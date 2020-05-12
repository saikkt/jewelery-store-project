package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.shipping.domain.ShippingDetails;
import org.springframework.stereotype.Component;

@Component
public interface ShippingDetailsClient {
    ShippingDetails postShipping(ShippingDetails shippingDetails);
}
