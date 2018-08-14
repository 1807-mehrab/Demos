package com.revature.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.BeanAAutomatic;
import com.revature.beans.BeanAConstructor;
import com.revature.beans.BeanASetter;
import com.revature.beans.Customer;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Customer js = (Customer) context.getBean("customer");
		System.out.println(js.toString());
		
		
		//BeanASetter
		//BeanASetter bas = (BeanASetter) context.getBean("BeanBySetter");
		//bas.getBMessage();
		
		//BeanAConstructor
		//BeanAConstructor bac = (BeanAConstructor) context.getBean("BeanByConstructor");
		//bac.getBMessage();
		
		//Automagic
		BeanAAutomatic baa = (BeanAAutomatic) context.getBean("beanAAutomatic");
		baa.getMessage();
		
		((AbstractApplicationContext) context).close();
	}

}
