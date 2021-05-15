package com.learning.service;

import java.util.List;

import com.learning.domain.Product;

public interface IproductService {
	
Product addProduct(Product product);
	
	Product updateProduct(Product product);
	
	void deleteProductById(Integer id);
	
	Product getProductById(Integer id);
	
	List<Product> getAllProducts();

}
