package com.eCommerce.jewelrystore.payments.transaction.errorhandler;

public class TransactionException extends Exception {
    public TransactionException(String message, Throwable cause) {
        super(message, cause);
    }
}
