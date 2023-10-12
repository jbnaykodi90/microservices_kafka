package com.jar.kafkaconsumer.subscriber;

import com.jar.kafkaconsumer.service.TransactionService;
import com.jar.kafkaproducer.model.SaTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TransactionMessageSubscriber {

    @Value("${topic.name}")
    private String topicName;

    @Autowired
    private TransactionService transactionService;

    @KafkaListener(topics = "${topic.name}",groupId = "${group.id}")
    public void consumeEvents(SaTransaction saTransaction) {
        System.out.println("consumer consume the events = "+ saTransaction.toString());
        transactionService.saveTransaction(saTransaction);
    }

}
