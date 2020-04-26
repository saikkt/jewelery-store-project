package com.eCommerce.jewelrystore.payments.stripe;

import com.eCommerce.jewelrystore.payments.stripe.dto.ChargeRequest;
import com.eCommerce.jewelrystore.payments.stripe.service.StripeService;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import org.springframework.beans.factory.annotation.Autowired;

public class StripeUtilImpl implements StripeUtil {

    @Autowired
    StripeService stripeService;

    @Override
    public Charge sendPayment(ChargeRequest charge) throws StripeException{
       return stripeService.charge(charge);
    }
}
