package com.eCommerce.jewelrystore.email.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailSenderImpl  implements MailSender{

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendEmail(String recipientAddress, String subject, String text) {
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(recipientAddress);
        email.setSubject(subject);
        email.setText(text);
        mailSender.send(email);
    }
}
