package com.projetandoemcasa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetandoemcasa.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
