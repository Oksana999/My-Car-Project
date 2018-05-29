package com;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class StoreUtils {
	
	public static int DISCOUNT_VALUE = 10;
	
	public static void updateDiscount(List<Car> cars) {
		long discTime = ((System.currentTimeMillis() / (3600000*24))-120);
		System.out.println("discTime= "+discTime);
	
		for (int i = 0; i < cars.size(); i++) {
			long newDillerDate = (cars.get(i).getDateDilersPurchase().toEpochDay());
			System.out.println(" newDillerDate= "+ newDillerDate);		
			if (newDillerDate < discTime) {
				cars.get(i).setDiscount(DISCOUNT_VALUE);
				cars.get(i).setType("Bid");
			}
		}
	}

}
