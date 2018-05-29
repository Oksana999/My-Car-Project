package com;

import java.awt.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestClass {

	public static void main(String[] args) {
	
		ArrayList<Car> cars = new ArrayList<Car>();
		Date dt = new Date();
		
		Calendar cal = Calendar.getInstance();
		
		cal.add(Calendar.DATE ,- 120);
		
		System.out.println((cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.DATE)+"/"+cal.get(Calendar.YEAR));
		
	
	
	   
	}
		
	}
