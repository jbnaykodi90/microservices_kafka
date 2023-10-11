package com.jar.kafkaproducer.repository;

import com.jar.kafkaproducer.model.SaTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaTransactionRepository extends JpaRepository<SaTransaction,Long> {
}
