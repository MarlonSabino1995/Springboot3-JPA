package com.projetandoemcasa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetandoemcasa.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
 