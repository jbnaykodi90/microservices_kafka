package com.jar.kafkaproducer.publisher;

import com.jar.kafkaproducer.model.SaTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.concurrent.CompletableFuture;

@Service
public class TransactionMessagePublisher {

    @Value("${topic.name}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public void publishSaTransaction(SaTransaction saTransaction){
        ListenableFuture<SendResult<String,Object>> future = kafkaTemplate.send(topicName,saTransaction);
        future.completable().whenComplete((result,ex) -> {
            if(ex == null){
                System.out.println("Message published successfully");
            }else{
                System.out.println("Failed to publish message");
            }
        });

    }
}
