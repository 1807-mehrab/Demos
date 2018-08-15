package com.revature.model;

public class Car {
	private String make;
	private String model;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Car(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + "]";
	}

}
