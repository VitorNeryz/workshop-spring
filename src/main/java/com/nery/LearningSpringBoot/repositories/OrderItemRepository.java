package com.nery.LearningSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nery.LearningSpringBoot.entities.OrderItem;
import com.nery.LearningSpringBoot.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
