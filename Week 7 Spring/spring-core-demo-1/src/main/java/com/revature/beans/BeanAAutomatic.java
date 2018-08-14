package com.revature.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanAAutomatic {
	@Autowired
	private BeanB b;
	
	public void getMessage() {
		System.out.println("BeanAAutomatic using Constructor" + b.getMessage());
	}
}
