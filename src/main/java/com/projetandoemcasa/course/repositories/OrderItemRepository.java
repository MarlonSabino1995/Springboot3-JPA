package com.projetandoemcasa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetandoemcasa.course.entities.OrderItem;
import com.projetandoemcasa.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
