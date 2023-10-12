package com.jar.kafkaproducer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SA_TRANSACTION_CONSUMER")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class SaTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="SA_SEQUENCE",sequenceName = "SA_SEQUENCE")
    private long id;
    private String merchId;
    private String terminalId;
    private String authCode;
    private String cardNumber;
    private double tranAmount;
    private Date tranDate;
}
