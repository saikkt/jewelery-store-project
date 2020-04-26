package com.eCommerce.jewelrystore.email.util;

public interface MailSender {

    public void sendEmail(String recipientAddress,String subject,String text);
}
