package com.jar.springdatajpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "JPA_ADDRESS")
public class Address {
    @Id
    private int id;
    private String addressDetails;
    @ManyToOne
    @JoinColumn(name = "S_ID")
    private Student student;
}
