package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.revature.model.Car;

@Repository
public class CarDao {
	List<Car> cars = new ArrayList<>();
	
	public CarDao() {
		cars.add(new Car("Honda", "Civic"));
		cars.add(new Car("Honda", "CR-V"));
		cars.add(new Car("GMC", "Yukon"));
		cars.add(new Car("Ford", "Taurus"));
	}
	
	public Car getCarByModel(String model) {
		Car c = null;
		for(Car car : cars) {
			if (car.getModel().equals(model))
				c = car;
		}
		return c;
	}
	
	public List<Car> getAllCars() {
		return cars;
	}
}
