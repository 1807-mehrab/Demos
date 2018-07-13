package com.revature.beans;

public class Bear {
	private int id;
	private String name;
	private int age;
	private int weight;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Bear [id=" + id + ", name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

	public Bear() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bear(int id, String name, int age, int weight) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	

}
