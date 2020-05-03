package com.eCommerce.jewelrystore.payments.transaction.service;

import com.eCommerce.jewelrystore.payments.transaction.domain.Transaction;
import com.eCommerce.jewelrystore.payments.transaction.errorhandler.TransactionException;

import java.util.List;
import java.util.Optional;

public interface TransactionService {
    List<Transaction> getAllTransactions(int page, int size) throws TransactionException;

    Optional<Transaction> getByTransactionID(long transactionID) throws TransactionException;

    Optional<Transaction> getTransactionByOrderID(long orderID) throws TransactionException;

    Optional<Transaction> getTransactionByGuestOrderID(long guestOrderID) throws TransactionException;

    Transaction save(Transaction transaction) throws TransactionException;
}
