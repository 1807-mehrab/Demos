package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Car;
import com.revature.repository.CarDao;

@Service
public class CarService {
	CarDao dao;

	public CarDao getDao() {
		return dao;
	}

	@Autowired
	public void setDao(CarDao dao) {
		this.dao = dao;
	}
	
	public Car getByModel(String model) {
		return dao.getCarByModel(model);
	}
	
	public List<Car> getAll() {
		return dao.getAllCars();
	}

}
