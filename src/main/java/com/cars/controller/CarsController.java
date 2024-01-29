package com.cars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cars.entity.Cars;
import com.cars.service.impl.CarsServiceImpl;

@RestController
public class CarsController {

	@Autowired
	private CarsServiceImpl carsService;
	
	@PostMapping(value="/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String addCar(@RequestBody Cars cars) {
		String message = "Car Added Successfully";
		return message;
	}
	
	@GetMapping(value="/allcars")
    public List<Cars> getAllCars() {
        return carsService.getAllCars();
    }
	
	@GetMapping("/{id}")
	public Cars getCar(@PathVariable String id) {
        return carsService.getCarById(id);
    }
}
