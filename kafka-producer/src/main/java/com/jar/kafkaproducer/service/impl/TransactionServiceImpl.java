package com.jar.kafkaproducer.service.impl;

import com.jar.kafkaproducer.model.SaTransaction;
import com.jar.kafkaproducer.repository.SaTransactionRepository;
import com.jar.kafkaproducer.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private SaTransactionRepository saTransactionRepository;

    @Override
    public void saveTransaction(SaTransaction saTransaction) {
        saTransactionRepository.save(saTransaction);
    }
}
