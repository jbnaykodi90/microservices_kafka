package com.jar.springdatajpa.service.impl;

import com.jar.springdatajpa.model.*;
import com.jar.springdatajpa.repository.*;
import com.jar.springdatajpa.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JpaServiceImpl implements JpaService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private LaptopRepository laptopRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void processOneToOne() {
        saveStudentOneToOne();
        fetchStudentOneToOne();
        fetchLaptopOneToOne();
    }

    private void fetchLaptopOneToOne(){
        System.out.println("Laptop present = " + laptopRepository.findById(101).isPresent());

    }

    private void fetchStudentOneToOne(){
        System.out.println("Student present = " + studentRepository.findById(1).isPresent());
    }

    private void saveStudentOneToOne(){
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Name1");

        Laptop laptop1 = new Laptop();
        laptop1.setId(101);
        laptop1.setBrand("Brand101");
        laptop1.setStudent(student1);
        student1.setLaptop(laptop1);

        studentRepository.save(student1);
    }

    @Override
    public void processOneToMany() {
        saveStudentOneToMany();
        fetchStudentOneToMany();
        fetchAddressOneToMany();
    }

    private void fetchAddressOneToMany(){
        System.out.println("Address present = " + addressRepository.findById(1001).isPresent());

    }

    private void fetchStudentOneToMany(){
        System.out.println("Student present = " + studentRepository.findById(1).isPresent());
    }

    private void saveStudentOneToMany(){
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Name1");

        Address address1 = new Address();
        address1.setId(1001);
        address1.setAddressDetails("Address details 1001");
        address1.setStudent(student1);

        Address address2 = new Address();
        address2.setId(1002);
        address2.setAddressDetails("Address details 1002");
        address2.setStudent(student1);

        List<Address> addressList = new ArrayList<>();
        addressList.add(address1);
        addressList.add(address2);

        student1.setAddressList(addressList);

        studentRepository.save(student1);
    }

    @Override
    public void processManyToOne() {

    }

    @Override
    public void processManyToMany() {
        saveCategoryManyToMany();
        fetchCategoryManyToMany();
        fetchProductManyToMany();
    }

    private void fetchProductManyToMany(){
        System.out.println("Product present = " + productRepository.findById(1001).isPresent());

    }

    private void fetchCategoryManyToMany(){
        System.out.println("Category present = " + categoryRepository.findById(1).isPresent());
    }

    private void saveCategoryManyToMany(){
        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Category 1");
        Category category2 = new Category();
        category2.setId(2);
        category2.setName("Category 2");

        Product product1 = new Product();
        product1.setId(1001);
        product1.setName("Product 1001");
        Product product2 = new Product();
        product2.setId(1002);
        product2.setName("Product 1002");

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(category1);
        categoryList.add(category2);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);

        category1.setProductList(productList);
        category2.setProductList(productList);

        product1.setCategoryList(categoryList);
        product2.setCategoryList(categoryList);

        categoryRepository.save(category1);
        categoryRepository.save(category2);
    }
}
