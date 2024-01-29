package com.cars.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cars.entity.Cars;
import com.cars.service.CarsService;

@Service
public class CarsServiceImpl implements CarsService {

	//@Autowired
	//private CarsRepository carsRepository; 
	
	@Override
	public Cars addCar(Cars cars) {
		// TODO Auto-generated method stub
		//return carsRepository.save(cars);
		return null;
	}
	
	@Override
	public List<Cars> getAllCars() {
		// TODO Auto-generated method stub
		List<Cars> carList = new ArrayList<Cars>(); 
		Cars car = new Cars();
		car.setId("1");
		car.setName("Mercedes-Benz AMG GT R Coupe");
		car.setModel("ANG GT");
		car.setSteeringType("Right");
		car.setColor("Green");
		car.setEngineType("Petrol");
		carList.add(car);
		
		Cars car2 = new Cars();
		car2.setId("2");
		car2.setName("Mercedes-Benz AMG GT 63 S E");
		car2.setModel("ANG GT");
		car2.setSteeringType("left");
		car2.setColor("Black");
		car2.setEngineType("Petrol");
		carList.add(car2);
		
		Cars car3 = new Cars();
		car3.setId("3");
		car3.setName("Mercedes-Benz AMG GT 63");
		car3.setModel("ANG GT");
		car3.setSteeringType("Right");
		car3.setColor("Red");
		car3.setEngineType("Diesel");
		carList.add(car3);
		//return carsRepository.findAll();
		
		return carList;
	}
	
	@Override
	public Cars getCarById(String id) {
		// TODO Auto-generated method stub
		Cars car = new Cars();
		car.setId("1");
		car.setName("Mercedes-Benz AMG GT R Coupe");
		car.setModel("ANG GT");
		car.setSteeringType("Right");
		car.setColor("Green");
		car.setEngineType("Petrol");

		//return carsRepository.findById(id).orElse(null);
		return car;
	}
}
