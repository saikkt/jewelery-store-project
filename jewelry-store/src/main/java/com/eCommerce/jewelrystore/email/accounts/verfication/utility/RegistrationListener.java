package com.eCommerce.jewelrystore.email.accounts.verfication.utility;

import com.eCommerce.jewelrystore.accounts.MyUserDetailsService;
import com.eCommerce.jewelrystore.accounts.models.User;
import com.eCommerce.jewelrystore.customer.repository.CustomerRepository;
import com.eCommerce.jewelrystore.email.util.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.MessageSource;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RegistrationListener implements
        ApplicationListener<OnRegistrationCompleteEvent> {

    @Autowired
    private MyUserDetailsService service;

    @Autowired
    private MessageSource messages;

   @Autowired
   private MailSender mailSender;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void onApplicationEvent(OnRegistrationCompleteEvent event) {
        this.confirmRegistration(event);
    }

    private void confirmRegistration(OnRegistrationCompleteEvent event) {
        User user = event.getUser();
        System.out.println(user.getUserName());
        String token = UUID.randomUUID().toString();
        service.createVerificationToken(user, token);

        String recipientAddress = customerRepository.findById(user.getCustomerId()).get().getEmailAddress();
        String subject = "Registration Confirmation";
        String confirmationUrl
                = event.getAppUrl() + "/regitrationConfirm.html?token=" + token;
        //String message = messages.getMessage("message.regSucc", null, event.getLocale());
        String text = "relink" + "\r\n" + "http://localhost:7009" + confirmationUrl;
        mailSender.sendEmail(recipientAddress,subject,text);
    }
}