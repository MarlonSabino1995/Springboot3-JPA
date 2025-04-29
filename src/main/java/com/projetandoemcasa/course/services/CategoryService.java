package com.projetandoemcasa.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.projetandoemcasa.course.entities.Category;
import com.projetandoemcasa.course.repositories.CategoryRepository;

public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> category = categoryRepository.findById(id);
		return category.get();
	}
}
