package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner  {

	
	private CarService carService = new CarService();
	
	public DataLoader(CarService carService) {
        this.carService = carService;
    }
	

	@Override
	public void run(String... args) throws Exception {
		carService.InsertRecords();
		
	}
}
