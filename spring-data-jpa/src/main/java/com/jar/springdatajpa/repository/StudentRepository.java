package com.jar.springdatajpa.repository;

import com.jar.springdatajpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
