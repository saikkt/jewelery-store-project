package com.eCommerce.jewelrystore.email.util;

import org.springframework.stereotype.Component;

@Component
public interface MailSender {

    public void sendEmail(String recipientAddress,String subject,String text);
}
