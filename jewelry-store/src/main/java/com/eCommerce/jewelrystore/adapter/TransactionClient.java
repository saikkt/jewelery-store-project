package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.payments.transaction.domain.Transaction;
import com.eCommerce.jewelrystore.payments.transaction.errorhandler.TransactionException;
import com.eCommerce.jewelrystore.payments.transaction.service.builder.TransactionBuilder;

public interface TransactionClient {
    TransactionBuilder getTransactionBuilder();
    Transaction saveTransaction(Transaction transaction) throws TransactionException;
}
