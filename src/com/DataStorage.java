package com;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class DataStorage {
	
	public static List<Car> carStore = new ArrayList();
	public static List<Customer> customerList = new ArrayList();
	public static List<Transaction> transactionsList = new ArrayList();
	
	static {
		customerList.add(new Customer("Sasha", "sasha@gmail.com", 999, "333"));	
	
	carStore.add(new Car ("BMW", "BMW, Germany", "2018", LocalDate.of(2018, Month.MAY, 9 ), 
			LocalDate.of(2018, Month.MAY, 10), 45000D, 0, "Fuel grade:Gasoline AI-98", "New", "BMV1.jpg", 1,0));
	carStore.add(new Car ("Mazda", "Mazda Motor Corporation, Japan", "2018",LocalDate.of(2019, Month.MARCH, 25), 
            LocalDate.of(2018, Month.MAY, 5), 25000.00, 0, "Fuel grade:Gasoline AI-98", "New", "Mazda.jpg", 2,0));
	carStore.add(new Car ("Fiat", "Fiat Automobiles, Italy", "2018", LocalDate.of(2018, Month.APRIL, 12), 
            LocalDate.of(2016, Month.MAY, 5), 33000.00, 0, "Fuel grade:Gasoline AI-98", "New", "Fiat.jpg",3,0));
	carStore.add(new Car ("Volkswagen", "Volkswagen Group, Germany","2018", LocalDate.of(2018, Month.MAY, 19), 
            LocalDate.of(2018, Month.MAY, 5), 35000.00, 0, "Fuel grade:Gasoline AI-98", "New", "Volkswagen.jpg", 4,0));
	carStore.add(new Car ("Honda", "Honda Motor Company, Japan", "2015", LocalDate.of(2018, Month.MAY, 15), 
            LocalDate.of(2018, Month.MAY, 7), 35000.00, 1000, "Fuel grade:Gasoline AI-98", "Used", "Honda.jpg", 5,0));
	carStore.add(new Car ("Dodge", "Chrysler, USA", "2012",LocalDate.of(2017, Month.APRIL, 1), 
            LocalDate.of(2018, Month.MAY, 7), 20000.00, 2000, "Fuel grade:Gasoline AI-98", "Used", "Dodge.jpg", 6,0));
	carStore.add(new Car ("Subaru", "Sybaru, Japan", "2010", LocalDate.of(2018, Month.FEBRUARY, 1), 
            LocalDate.of(2018, Month.MAY, 7), 15000.00, 2000, "Fuel grade:Gasoline AI-98", "Used", "Subaru.jpg", 7,0));
	carStore.add(new Car ("Mersedes", "Marsedes-Benz", "2015", LocalDate.of(2018, Month.APRIL, 11), 
            LocalDate.of(2018, Month.MAY, 7), 20000.00, 5000, "Fuel grade:Gasoline AI-98", "Used", "Mersedes3.jpg", 8,0));
	carStore.add(new Car ("Toyota", "Toyota, Aichi Prefecture, Japan","2010", LocalDate.of(2018, Month.APRIL, 18), 
            LocalDate.of(2018, Month.MAY, 7), 10000.00, 8000, "Fuel grade:Gasoline AI-98", "Used", "Toyota.jpg", 9,0));
	carStore.add(new Car ("Lexus", "Nagoya, Japan", "2009", LocalDate.of(2018, Month.MAY, 21), 
            LocalDate.of(2018, Month.MAY, 7), 20000.00, 7000, "Fuel grade:Gasoline AI-98", "New", "Lexus.jpg", 10,0));
	carStore.add(new Car ("Acura", "Acura, Japan", "2015",LocalDate.of(2018, Month.JANUARY, 21), 
            LocalDate.of(2018, Month.MAY, 7), 20000.00, 2000, "Fuel grade:Gasoline AI-98", "Used", "Acura.jpg", 11,0));
	
		StoreUtils.updateDiscount(carStore);
	}
	
	
	
	
}
