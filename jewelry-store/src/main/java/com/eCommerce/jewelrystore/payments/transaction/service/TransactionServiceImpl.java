package com.eCommerce.jewelrystore.payments.transaction.service;

import com.eCommerce.jewelrystore.payments.transaction.domain.Transaction;
import com.eCommerce.jewelrystore.payments.transaction.errorhandler.TransactionException;
import com.eCommerce.jewelrystore.payments.transaction.repository.TransactionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TransactionServiceImpl implements TransactionService {

    private TransactionRepository transactionRepository;
    Logger logger = LoggerFactory.getLogger(TransactionServiceImpl.class);

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<Transaction> getAllTransactions(int page, int size) throws TransactionException {
        List<Transaction> transactionList;
        try {
            transactionList = transactionRepository.findAll(PageRequest.of(page,size)).toList();
        }catch (Exception e){
            logger.info("Unable fetch transactions: "+ e.getLocalizedMessage());
            throw new TransactionException("Unable to fetch transactions", e);
        }
        return transactionList;
    }

    @Override
    public Optional<Transaction> getByTransactionID(long transactionID) throws TransactionException {
        return transactionRepository.findById(transactionID);
    }

    @Override
    public Optional<Transaction> getTransactionByOrderID(long orderID) throws TransactionException {
        return transactionRepository.findByOrderID(orderID);
    }

    @Override
    public Optional<Transaction> getTransactionByGuestOrderID(long guestOrderID) throws TransactionException {
        return transactionRepository.findByGuestOrderID(guestOrderID);
    }

    @Override
    public Transaction save(Transaction transaction) throws TransactionException {
        Transaction savedTransaction;
        try {
            savedTransaction = transactionRepository.save(transaction);
        }catch (Exception e){
            logger.info("Unable to save transaction: "+e.getLocalizedMessage());
            throw new TransactionException("Unable to save transaction",e);
        }
        return savedTransaction;
    }
}
