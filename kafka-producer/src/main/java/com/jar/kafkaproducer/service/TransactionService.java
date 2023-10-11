package com.jar.kafkaproducer.service;

import com.jar.kafkaproducer.model.SaTransaction;

public interface TransactionService {
    public void saveTransaction(SaTransaction saTransaction);
}
