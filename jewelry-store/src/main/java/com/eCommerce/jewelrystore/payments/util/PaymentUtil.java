package com.eCommerce.jewelrystore.payments.util;

import com.eCommerce.jewelrystore.payments.stripe.dto.ChargeRequest;
import com.stripe.model.Charge;
import org.springframework.stereotype.Component;

@Component
public interface PaymentUtil{
    Charge sendPayment(ChargeRequest charge) throws Exception;
}
