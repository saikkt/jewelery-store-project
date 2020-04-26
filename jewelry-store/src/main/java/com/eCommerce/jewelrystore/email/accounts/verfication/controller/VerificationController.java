package com.eCommerce.jewelrystore.email.accounts.verfication.controller;

import com.eCommerce.jewelrystore.accounts.MyUserDetailsService;
import com.eCommerce.jewelrystore.accounts.UserRepository;
import com.eCommerce.jewelrystore.accounts.models.User;
import com.eCommerce.jewelrystore.email.accounts.verfication.domain.VerificationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.Calendar;
import java.util.Locale;

@RestController
@RequestMapping("/regitrationConfirm")
public class VerificationController {

    @Autowired
    private MyUserDetailsService service;

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String confirmRegistration
            (WebRequest request, Model model, @RequestParam("token") String token) {

        Locale locale = request.getLocale();


        VerificationToken verificationToken = service.getVerificationToken(token);
      //  System.out.println(verificationToken.getUserId());
        if (verificationToken == null) {
           // String message = messages.getMessage("auth.message.invalidToken", null, locale);
          //  model.addAttribute("message", message);
            return "redirect:/badUser.html?lang=" + locale.getLanguage();
        }

        User user = verificationToken.getUser();
      //  User savedUser = userRepository.findById(verificationToken.getUserId()).get();
        User savedUser = verificationToken.getUser();
        Calendar cal = Calendar.getInstance();
//        if ((verificationToken.getExpiryDate().getTime() - cal.getTime().getTime()) <= 0) {
//           // String messageValue = messages.getMessage("auth.message.expired", null, locale)
//          //  model.addAttribute("message", messageValue);
//            return "redirect:/badUser.html?lang=" + locale.getLanguage();
//        }
       System.out.println(savedUser.getUserName());
        System.out.println(savedUser.getPassword());
        savedUser.setActive(true);
        userRepository.save(savedUser);
        System.out.println(userRepository.findById(user.getId()).get().isActive());
        return "redirect:/login.html?lang=" + request.getLocale().getLanguage();
    }
}
