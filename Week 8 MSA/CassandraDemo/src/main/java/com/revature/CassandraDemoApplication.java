package com.revature;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revature.model.Person;
import com.revature.repository.PersonRepository;

@SpringBootApplication
public class CassandraDemoApplication implements CommandLineRunner{
	
	@Autowired
	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(CassandraDemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		personRepository.deleteAll();
		Person p1 = new Person(1, "Bill", "Paxton", 100);
		Person p2 = new Person(2, "Jill", "Jones", 10);
		personRepository.save(p1);
		personRepository.save(p2);
		List<Person> people = personRepository.findByAgeGreaterThan(18);
		people.forEach(System.out::println);
	}
}
