package com.eCommerce.jewelrystore.accounts;

import com.eCommerce.jewelrystore.accounts.models.MyUserDetails;
import com.eCommerce.jewelrystore.accounts.models.User;
import com.eCommerce.jewelrystore.customer.dto.CustomerModel;
import com.eCommerce.jewelrystore.email.accounts.verfication.controller.VerificationController;
import com.eCommerce.jewelrystore.email.accounts.verfication.domain.VerificationToken;
import com.eCommerce.jewelrystore.email.accounts.verfication.repository.VerificationTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    VerificationTokenRepository tokenRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        System.out.println("here");

        Optional<User> user = userRepository.findByUserName(userName);

        System.out.println("here");

        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));

        return user.map(MyUserDetails::new).get();
    }

    public User getUser(String verificationToken) {
        User user = tokenRepository.findByToken(verificationToken).getUser();
        return user;
    }

    public VerificationToken getVerificationToken(String VerificationToken) {
        return tokenRepository.findByToken(VerificationToken);
    }

    public void createVerificationToken(User user, String token) {
        VerificationToken myToken = new VerificationToken();
        myToken.setUser(user);
        myToken.setToken(token);
        tokenRepository.save(myToken);
    }

    public User save(User user) {
       return  userRepository.saveAndFlush(user);
    }
}
