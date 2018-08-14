package com.revature.beans;

public class BeanASetter {
	private BeanB b;
	
	public void setB(BeanB b) {
		this.b = b;
	}
	
	public void getBMessage() {
		System.out.println("BeanASetter calls " + b.getMessage());
	}
}
