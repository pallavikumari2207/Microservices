package com.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.learning.domain.Product;
import com.learning.repository.ProductRepo;
@EnableEurekaClient
@SpringBootApplication
public class MsStoreappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MsStoreappApplication.class, args);
	}
	
	@Autowired
	@Qualifier("productRepository")
	private ProductRepo productRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		productRepository.save(new Product("LG", 45534.0));
		productRepository.save(new Product("Samung", 34534.0));
		productRepository.save(new Product("Sony", 44534.0));
		productRepository.save(new Product("Dell", 33534.0));
		productRepository.save(new Product("HP", 63534.0));

		System.out.println(productRepository.findAll());
		
	}

}
