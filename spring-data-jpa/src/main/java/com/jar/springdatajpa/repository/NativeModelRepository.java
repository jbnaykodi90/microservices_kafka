package com.jar.springdatajpa.repository;

import com.jar.springdatajpa.model.NativeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface NativeModelRepository extends JpaRepository<NativeModel,Integer> {
    @Query(value = "SELECT P.ID PRODUCT_ID,P.NAME PRODUCT_NAME,C.ID CATEGORY_ID,C.NAME CATEGORY_NAME,'DEFAULT' DEFAULT_COL FROM JPA_PRODUCT P,JPA_CATEGORY C WHERE ROWNUM = 1",nativeQuery = true)
    Optional<NativeModel> findNativeModel();
}
