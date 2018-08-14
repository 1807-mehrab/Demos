package com.revature.beans;

public class BeanAConstructor {
	private BeanB b;

	public BeanAConstructor(BeanB b) {
		super();
		this.b = b;
	}

	public BeanAConstructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void getBMessage() {
		System.out.println("BeanAConstructor prints " + b.getMessage());
	}
}
