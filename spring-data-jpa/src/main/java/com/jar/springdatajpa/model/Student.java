package com.jar.springdatajpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "JPA_STUDENT")
public class Student {
    @Id
    private int id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "student")
    private Laptop laptop;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "student")
    private List<Address> addressList;

}
