package com.jar.springdatajpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "JPA_NATIVE_MODEL")
public class NativeModel {
    @Id
    private int productId;
    private String productName;
    private int categoryId;
    private String categoryName;
    private String defaultCol;
}
