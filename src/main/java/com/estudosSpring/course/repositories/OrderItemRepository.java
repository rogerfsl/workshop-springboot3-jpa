package com.estudosSpring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosSpring.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
