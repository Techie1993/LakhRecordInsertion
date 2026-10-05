package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cardetails")
public class DataCar {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer carid;

	@Column(name="comp_name")
    private String companyName;
	
	@Column(name="car_name")
    private String carName;
	
	@Column(name="price")
    private String price;
	
	@Column(name="fuelType")
    private String fuelType;
	
	public DataCar() {
		System.out.println("Default...");
	}

	public DataCar(Integer carid, String companyName, String carName, String price, String fuelType) {
		super();
		this.carid = carid;
		this.companyName = companyName;
		this.carName = carName;
		this.price = price;
		this.fuelType = fuelType;
	}

	public Integer getCarid() {
		return carid;
	}

	public void setCarid(Integer carid) {
		this.carid = carid;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "CarData [carid=" + carid + ", companyName=" + companyName + ", carName=" + carName + ", price=" + price
				+ ", fuelType=" + fuelType + "]";
	}
}
