package com.revature.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.revature.config.HibernateConfig;
import com.revature.service.CaveService;

public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		
		CaveService caveService = context.getBean("caveService", CaveService.class);
		System.out.println(caveService.getAll());
		
		context.close();
	}

}
