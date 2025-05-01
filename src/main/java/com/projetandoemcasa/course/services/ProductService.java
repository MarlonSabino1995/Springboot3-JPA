package com.projetandoemcasa.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetandoemcasa.course.entities.Product;
import com.projetandoemcasa.course.repositories.ProductRepository;
@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> prod = productRepository.findById(id);
		return prod.get();
	}
}
