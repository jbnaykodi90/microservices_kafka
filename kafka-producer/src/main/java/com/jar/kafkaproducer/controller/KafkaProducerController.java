package com.jar.kafkaproducer.controller;

import com.jar.kafkaproducer.model.SaTransaction;
import com.jar.kafkaproducer.publisher.TransactionMessagePublisher;
import com.jar.kafkaproducer.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class KafkaProducerController {

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private TransactionMessagePublisher transactionMessagePublisher;

    @PostMapping("/transactions")
    public ResponseEntity<?> publishTransactions(@RequestBody SaTransaction saTransaction){
        //transactionService.saveTransaction(new SaTransaction(0,"123","1234","2345","5555",123.45,new Date()));
        transactionMessagePublisher.publishSaTransaction(saTransaction);
        return new ResponseEntity<>("Response from server",HttpStatus.ACCEPTED);
    }

    @GetMapping("/transactions")
    public ResponseEntity<?> getTransactions(){
        SaTransaction saTransaction = new SaTransaction(0,"123","1234","2345","5555",123.45,new Date());
        return new ResponseEntity<>(saTransaction,HttpStatus.OK);
    }
}
