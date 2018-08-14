package com.revature.services;

import org.springframework.stereotype.Component;

@Component
public class MovieService {
	private boolean isOpen = false;
	
	public void setIsOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	
	public boolean getIsOpen() {
		return isOpen;
	}
	
	public void watchMovie() {
		System.out.println("You watch the movie");
	}
	
	public void applaud() {
		System.out.println("You liked the movie");
	}
	
	public void boo() throws Exception{
		System.out.println("You walk out");
		throw new Exception();
	}
}
