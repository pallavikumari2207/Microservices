package com.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learning.domain.Product;
import com.learning.repository.ProductRepo;

@Service(value = "productService")
@Scope("singleton")
@Transactional
public class ProductService implements IproductService{
	@Autowired
	@Qualifier("productRepository")
	private ProductRepo productRepository;

	@Override
	public Product addProduct(Product product) {

		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {

		return productRepository.save(product);
	}

	@Override
	public void deleteProductById(Integer id) {

		productRepository.deleteById(id);
	}

	@Override
	public Product getProductById(Integer id) {

		return productRepository.findById(id).get();
	}

	@Override
	public List<Product> getAllProducts() {

		return productRepository.findAll();
	}
}
