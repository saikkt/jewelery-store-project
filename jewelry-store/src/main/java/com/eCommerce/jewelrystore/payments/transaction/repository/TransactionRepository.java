package com.eCommerce.jewelrystore.payments.transaction.repository;

import com.eCommerce.jewelrystore.payments.transaction.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    Optional<Transaction> findByOrderID(long orderID);
    Optional<Transaction> findByGuestOrderID(long guestOrderId);
}
