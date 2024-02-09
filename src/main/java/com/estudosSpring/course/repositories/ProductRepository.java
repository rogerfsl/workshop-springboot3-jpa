package com.estudosSpring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosSpring.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
