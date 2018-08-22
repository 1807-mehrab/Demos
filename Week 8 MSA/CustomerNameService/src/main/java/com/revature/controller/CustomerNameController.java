package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.revature.model.Customer;

@RestController
public class CustomerNameController {

	@Bean
	public RestTemplate rt (RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="getPlaceholderInstead")
	@GetMapping("/getJohn")
	public String getJohn() {
		Customer john = restTemplate.getForObject(
				"http://localhost:8989/customer/1", 
				Customer.class);
		return john.getName();
	}
	
	public String getPlaceholderInstead() {
		return "OOPS";
	}
}
