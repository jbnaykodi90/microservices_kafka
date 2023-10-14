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
@Table(name = "JPA_CATEGORY")
public class Category {
    @Id
    private int id;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "categoryList")
    private List<Product> productList;
}
