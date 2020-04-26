package com.eCommerce.jewelrystore.email.accounts.verfication.repository;

import com.eCommerce.jewelrystore.accounts.models.User;
import com.eCommerce.jewelrystore.email.accounts.verfication.domain.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationTokenRepository
        extends JpaRepository<VerificationToken, Long> {

    VerificationToken findByToken(String token);

    VerificationToken findByUser(User user);
}
