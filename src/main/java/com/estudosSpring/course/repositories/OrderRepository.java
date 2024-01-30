package com.estudosSpring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosSpring.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
