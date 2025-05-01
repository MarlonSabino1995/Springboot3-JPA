package com.projetandoemcasa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetandoemcasa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
