package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Car;
import com.Customer;
import com.DataStorage;

public class AddCarController extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("views/addCar.jsp");
		dispatcher.forward(request, response);

	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Car car = new Car();
		car.setModel(request.getParameter("model"));
		car.setImageName(request.getParameter("imageName"));
		car.setDiscount(Integer.parseInt(request.getParameter("discount")));
		car.setPrice(Double.parseDouble(request.getParameter("price")));
		DataStorage.carStore.add(car);
		response.sendRedirect("car-store");
	}
}


