package com.cars.service;

	import java.util.List;

	import org.springframework.stereotype.Service;

	import com.cars.entity.Cars;

	@Service
	public interface CarsService{
		
		public Cars getCarById(String id);
	    public List<Cars> getAllCars();
	    public Cars addCar(Cars cars);

	}

