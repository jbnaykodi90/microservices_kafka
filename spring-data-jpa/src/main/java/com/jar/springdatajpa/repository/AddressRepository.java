package com.jar.springdatajpa.repository;

import com.jar.springdatajpa.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
