package com.jar.springdatajpa.repository;

import com.jar.springdatajpa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
