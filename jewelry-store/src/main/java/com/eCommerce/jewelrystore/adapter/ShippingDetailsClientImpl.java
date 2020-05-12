package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.shipping.domain.ShippingDetails;
import com.eCommerce.jewelrystore.shipping.service.ShippingDetailsService;
import org.springframework.stereotype.Component;

@Component
public class ShippingDetailsClientImpl implements ShippingDetailsClient {

    private ShippingDetailsService shippingDetailsService;

    public ShippingDetailsClientImpl(ShippingDetailsService shippingDetailsService) {
        this.shippingDetailsService = shippingDetailsService;
    }

    @Override
    public ShippingDetails postShipping(ShippingDetails shippingDetails) {
        return shippingDetailsService.postShipping(shippingDetails);
    }
}
