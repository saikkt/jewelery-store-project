package com.eCommerce.jewelrystore.payments.transaction.api;

import com.eCommerce.jewelrystore.payments.transaction.domain.Transaction;
import com.eCommerce.jewelrystore.payments.transaction.errorhandler.TransactionException;
import com.eCommerce.jewelrystore.payments.transaction.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    //Admin Access Only
    @GetMapping
    public ResponseEntity<List<Transaction>> getAllTransactions(@PathVariable Optional<Integer> page,
                                                                @PathVariable Optional<Integer> size)
            throws TransactionException {
        List<Transaction> transactionList = transactionService.getAllTransactions(page.orElse(0),
                size.orElse(10));
        return ResponseEntity.ok().body(transactionList);
    }

    //Admin Access only
    @GetMapping("/{transactionID}")
    public ResponseEntity<Transaction> getByTransactionID(@PathVariable(name = "transactionID")
                                                                  long transactionID) throws TransactionException {
        Optional<Transaction> optionalTransaction =
                transactionService.getByTransactionID(transactionID);
        if (!optionalTransaction.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optionalTransaction.get());
    }

    //Admin Access Only
    @GetMapping("/get-by-orderID/{orderID}")
    public ResponseEntity<Transaction> getTransactionByOrderID(@PathVariable(name = "orderID")
                                                                       long orderID) throws TransactionException {
        Optional<Transaction> optionalTransaction =
                transactionService.getTransactionByOrderID(orderID);
        if (!optionalTransaction.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optionalTransaction.get());
    }

    //Admin Access Only
    @GetMapping("/get-by-guestOrderID/{guestOrderID}")
    public ResponseEntity<Transaction> getTransactionByGuestOrderID(
            @PathVariable(name = "guestOrderID") long guestOrderID) throws TransactionException {

        Optional<Transaction> optionalTransaction =
                transactionService.getTransactionByGuestOrderID(guestOrderID);
        if (!optionalTransaction.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optionalTransaction.get());
    }

}
