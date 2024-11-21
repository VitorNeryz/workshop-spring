package com.nery.LearningSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nery.LearningSpringBoot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
