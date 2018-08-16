package com.revature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.revature.repository.CaveDao;

@SpringBootApplication
public class SpringDataDemoApplication {
	@Autowired
	CaveDao caveDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner runner() {
		return args -> {
			System.out.println(caveDao.findByIdBetween(2, 4));
		};
	}
}
