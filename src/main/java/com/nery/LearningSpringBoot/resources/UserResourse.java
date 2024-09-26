package com.nery.LearningSpringBoot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nery.LearningSpringBoot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L,"Vitor nery","vitor@test.com","111111111","1234");
		return ResponseEntity.ok().body(u);
	}
}
