package com.eCommerce.jewelrystore.accounts.exceptions;

public class UserInActiveException extends RuntimeException {

    public UserInActiveException(String msg){
        super(msg);
    }
}
