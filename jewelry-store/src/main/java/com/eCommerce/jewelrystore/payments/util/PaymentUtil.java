package com.eCommerce.jewelrystore.payments.util;

import com.eCommerce.jewelrystore.payments.stripe.dto.ChargeRequest;
import com.stripe.model.Charge;

public interface PaymentUtil{
    Charge sendPayment(ChargeRequest charge) throws Exception;
}
