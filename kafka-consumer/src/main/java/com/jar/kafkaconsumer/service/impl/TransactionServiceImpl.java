package com.jar.kafkaconsumer.service.impl;


import com.jar.kafkaconsumer.repository.SaTransactionRepository;
import com.jar.kafkaconsumer.service.TransactionService;
import com.jar.kafkaproducer.model.SaTransaction;
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
