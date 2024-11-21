package com.nery.LearningSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nery.LearningSpringBoot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
