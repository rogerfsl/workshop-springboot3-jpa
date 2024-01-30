package com.estudosSpring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosSpring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
