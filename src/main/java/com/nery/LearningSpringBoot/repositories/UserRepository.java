package com.nery.LearningSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nery.LearningSpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
