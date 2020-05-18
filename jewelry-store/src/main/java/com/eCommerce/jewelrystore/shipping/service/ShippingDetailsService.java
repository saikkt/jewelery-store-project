package com.eCommerce.jewelrystore.shipping.service;

import com.eCommerce.jewelrystore.order.service.OrderService;
import com.eCommerce.jewelrystore.shipping.domain.ShippingDetails;
import com.eCommerce.jewelrystore.shipping.errorhandler.ShippingDetailsException;
import com.eCommerce.jewelrystore.shipping.repositories.ShippingDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingDetailsService {

    @Autowired
    ShippingDetailsRepository shippingDetailsRepository;

    @Autowired
    OrderService orderService;

    public List<ShippingDetails> getAllShippingDetails() {
        return  shippingDetailsRepository.findAll();
    }


    public ShippingDetails postShipping(ShippingDetails shippingDetails) throws ShippingDetailsException {
        ShippingDetails savedShippingDetails;
        try {
            savedShippingDetails = shippingDetailsRepository.save(shippingDetails);
        }catch (Exception e){
            throw new ShippingDetailsException("Unable to save shipping details",e);
        }
        return savedShippingDetails;
    }
}
