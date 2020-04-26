package com.eCommerce.jewelrystore.accounts.utilities;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptGenerator {
    public static String getEncodedString(String password) {

            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String hashedPassword = passwordEncoder.encode(password);
            return hashedPassword;
        }

    }

