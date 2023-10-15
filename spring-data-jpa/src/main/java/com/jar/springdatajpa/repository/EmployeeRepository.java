package com.jar.springdatajpa.repository;

import com.jar.springdatajpa.model.Address;
import com.jar.springdatajpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Address> {
}
