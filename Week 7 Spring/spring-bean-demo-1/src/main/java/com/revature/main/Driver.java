package com.revature.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.revature.beans.Person;
import com.revature.util.Config;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Person p = (Person) context.getBean("person");
		//p.setName("Mehrab");
		System.out.println(p.getName());
		System.out.println(p.getP().getName());
		p.setName("Harry");
		
		Person p2 = (Person) context.getBean("person");
		System.out.println(p2.getName());
		System.out.println(p2.getP().getName());
		((AbstractApplicationContext) context).close();
	}

}
