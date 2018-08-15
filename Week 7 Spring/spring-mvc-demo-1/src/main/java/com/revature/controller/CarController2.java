package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Car;
import com.revature.service.CarService;

@RestController
public class CarController2 {
	@Autowired
	private CarService cs;
	
	public void setCs(CarService cs) {
		this.cs = cs;
	}

	@GetMapping("/example")
	public String example() {
		return "hello world";
	}
	
	@RequestMapping("/carExample")
	public Car carExample() {
		Car c = new Car("Honda", "Civic");
		return c;
	}
	
	@GetMapping("/all")
	public List<Car> getAll() {
		return cs.getAll();
	}
	
	@GetMapping("/{model}")
	public Car getModel(@PathVariable("model") String model) {
		return cs.getByModel(model);
	}
}
