package com.nery.LearningSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nery.LearningSpringBoot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
