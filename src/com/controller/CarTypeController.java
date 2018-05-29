package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Car;
import com.Customer;
import com.DataStorage;

public class CarTypeController extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Car> allCars = DataStorage.carStore;
				
		List<Car> newCarsList = searchNewCars(request, allCars);
		request.setAttribute("carStore", newCarsList);

		RequestDispatcher dispatcher = request.getRequestDispatcher("views/car-store.jsp");
		dispatcher.forward(request, response);	
	}
	
	private List<Car> searchNewCars(HttpServletRequest request, List<Car> allCars) {
		List<Car> newc = new ArrayList<>();
		String type = request.getParameter("type"); //Search type
		if (type == null) {
			newc = allCars;
		} else {
			for (Car car : allCars) {
				if (car.getType().equalsIgnoreCase(type)) {
					newc.add(car);
				}
			}
		}
		return newc;
	}

}
