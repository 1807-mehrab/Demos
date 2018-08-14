package com.revature.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import com.revature.services.MovieService;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MovieService ms = (MovieService) context.getBean("movieService");
		ms.watchMovie();
		
		((AbstractApplicationContext) context).close();
	}
}
