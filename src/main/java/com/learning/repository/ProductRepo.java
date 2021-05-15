package com.learning.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.domain.Product;



@Repository(value = "productRepository")
@Scope("singleton")
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
