package com;

import java.time.LocalDate;

public class Car {

	private String model;
	private String manufactureName;
	private String yearBuild;
	private LocalDate dateDilersPurchase;
	private LocalDate datePurchase;
	private double price;
	private int kiloMeters;
	private String description;
	private String type;
	private String imageName;
	private int id;
	private int discount;
	
	public Car() {
	}
	
	public Car(String model, String imageName, int discount, double price) {
		this.model = model;
		this.imageName = imageName;
		this.discount = discount;
	    this.price = price;	
	}

	public String getImageName() {
		return imageName;
	}


	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public Car(String model, String manufactureName, String yearBuild, LocalDate dateDilersPurchase,
			LocalDate datePurchase, double price, int kiloMeters, String description, String type, String imageName,
			int id, int discount) {
		super();
		this.model = model;
		this.manufactureName = manufactureName;
		this.yearBuild = yearBuild;
		this.dateDilersPurchase = dateDilersPurchase;
		this.datePurchase = datePurchase;
		this.price = price;
		this.kiloMeters = kiloMeters;
		this.description = description;
		this.type = type;
		this.imageName = imageName;
		this.id = id;
		this.discount = discount;
	}
	
	public int getDiscount() {
		return discount;
	}


	public void setDiscount(int discount) {
		this.discount = discount;
	}


	public String getModel() {
		return model;
	}


	public String getYearBuild() {
		return yearBuild;
	}

	public void setYearBuild(String yearBuild) {
		this.yearBuild = yearBuild;
	}

	public void setModel(String model) {
		this.model = model;
	}


	public String getManufactureName() {
		return manufactureName;
	}


	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}


	public LocalDate getDateDilersPurchase() {
		return dateDilersPurchase;
	}


	public void setDateDilersPurchase(LocalDate dateDilersPurchase) {
		this.dateDilersPurchase = dateDilersPurchase;
	}


	public LocalDate getDatePurchase() {
		return datePurchase;
	}


	public void setDatePurchase(LocalDate datePurchase) {
		this.datePurchase = datePurchase;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getKiloMeters() {
		return kiloMeters;
	}


	public void setKiloMeters(int kiloMeters) {
		this.kiloMeters = kiloMeters;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	

}
