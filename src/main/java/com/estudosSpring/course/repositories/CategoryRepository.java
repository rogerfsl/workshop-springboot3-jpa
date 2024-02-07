package com.estudosSpring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosSpring.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
