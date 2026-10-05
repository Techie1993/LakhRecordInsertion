package com.example.demo;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class CarService {

	@PersistenceContext
	private EntityManager entity;
	
	
	@Transactional
	public void InsertRecords() {
		
		
		int totalrec=10000;
		int batchsize=1000;
		
		for(int i=1;i<=totalrec;i++) {
			
			DataCar cars=new DataCar();
			cars.setCarName("Endeavour");
			cars.setCompanyName("Ford");
			cars.setFuelType("Diesel");
			cars.setPrice("5200000");
			
			entity.persist(cars);
			
			if(i% batchsize==0) {
				
				entity.flush();
				entity.clear();	
				
				System.out.println("Inserted Records:");
			}	
			
			entity.flush();
			entity.clear();
				
		}
		
		// For remaining data
		
		entity.flush();
		entity.clear();
	}	
}
