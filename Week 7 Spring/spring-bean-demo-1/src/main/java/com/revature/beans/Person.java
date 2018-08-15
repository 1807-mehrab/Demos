package com.revature.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person implements InitializingBean, DisposableBean{
	private String name;
	private Pet p;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pet getP() {
		return p;
	}

	@Autowired
	public void setP(Pet p) {
		this.p = p;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Person is destroyed");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Person is initialized");
		setName("Tom");
	}
	
	@PostConstruct
	public void defaultInit() {
		System.out.println("Default init");
	}
	
	@PreDestroy
	public void defaultDestroy() {
		System.out.println("Default destroy");
	}

}
