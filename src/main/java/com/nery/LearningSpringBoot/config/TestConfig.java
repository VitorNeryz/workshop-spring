package com.nery.LearningSpringBoot.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.nery.LearningSpringBoot.entities.Order;
import com.nery.LearningSpringBoot.entities.User;
import com.nery.LearningSpringBoot.enums.OrderStatus;
import com.nery.LearningSpringBoot.repositories.OrderRepository;
import com.nery.LearningSpringBoot.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(Instant.parse("2019-06-20T19:53:07Z"), u1,OrderStatus.SHIPPED); 
		Order o2 = new Order(Instant.parse("2019-07-21T03:42:10Z"), u2,OrderStatus.PAID); 
		Order o3 = new Order(Instant.parse("2019-07-22T15:21:22Z"), u1,OrderStatus.DELIVERED);
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
}
