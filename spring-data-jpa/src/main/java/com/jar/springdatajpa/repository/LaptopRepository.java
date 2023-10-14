package com.jar.springdatajpa.repository;

import com.jar.springdatajpa.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop,Integer> {
}
