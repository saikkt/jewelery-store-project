package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.shipping.domain.ShippingDetails;
import com.eCommerce.jewelrystore.shipping.errorhandler.ShippingDetailsException;
import org.springframework.stereotype.Component;

@Component
public interface ShippingDetailsClient {
    ShippingDetails postShipping(ShippingDetails shippingDetails) throws ShippingDetailsException;
}
