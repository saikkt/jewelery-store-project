package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.payments.transaction.domain.Transaction;
import com.eCommerce.jewelrystore.payments.transaction.errorhandler.TransactionException;
import com.eCommerce.jewelrystore.payments.transaction.service.TransactionService;
import com.eCommerce.jewelrystore.payments.transaction.service.builder.TransactionBuilder;
import org.springframework.stereotype.Component;

@Component
public class TransactionClientImpl implements TransactionClient {

    private TransactionService transactionService;

    public TransactionClientImpl(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @Override
    public TransactionBuilder getTransactionBuilder() {
        return new TransactionBuilder();
    }

    @Override
    public Transaction saveTransaction(Transaction transaction) throws TransactionException {
        return transactionService.save(transaction);
    }
}
