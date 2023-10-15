package com.jar.springdatajpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "JPA_EMPLOYEE")
public class Employee {
    @EmbeddedId
    private EmployeeAddress employeeAddress;
    private String name;
}
