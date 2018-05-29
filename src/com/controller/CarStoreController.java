package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Car;
import com.DataStorage;

public class CarStoreController extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Car> allCars = DataStorage.carStore;
	
		request.setAttribute("carStore", filterCarsByModel(request, allCars)); // add to request carList so we'll be able to get this list on the jsp page
		
		populateCarModels(allCars, request);
			
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/car-store.jsp");
		dispatcher.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In post");
		doGet(request, response);
	}
	
	private void populateCarModels(List<Car> allCars, HttpServletRequest request) {
		Set<String> models = new HashSet<>(); 
		for (Car car : allCars) {
			models.add(car.getModel()); // add all car-models to new variable models 
		}
		request.setAttribute("models", models);
	}
	
	private List<Car> filterCarsByModel(HttpServletRequest request, List<Car> allCars) {
		List<Car> filteredCars = new ArrayList<>();
		String model = request.getParameter("model"); //Search Model
		if (model == null) {
			filteredCars = allCars;
		} else {
			for (Car car : allCars) {
				if (car.getModel().equalsIgnoreCase(model)) {
					filteredCars.add(car);
				}
			}
		}
		
		return filteredCars;
	}
	
}