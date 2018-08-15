package com.revature.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revature.beans.Person;
import com.revature.beans.Pet;

@Configuration
//@ComponentScan("com.revature.beans")
public class Config {

	@Bean(name="person")
	public Person getPerson() {
		Person n = new Person();
		n.setName("Jim");
		return n;
	}
	
	@Bean(name="pet")
	public Pet getPet() {
		Pet n = new Pet();
		n.setName("Sparky");
		return n;
	}
	
}
