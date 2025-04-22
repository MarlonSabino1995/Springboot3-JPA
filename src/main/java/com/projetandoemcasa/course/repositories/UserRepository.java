package com.projetandoemcasa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetandoemcasa.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
 