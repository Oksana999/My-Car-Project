package com.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.naming.Context;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Car;
import com.DataStorage;

public class CarController extends HttpServlet{
	
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int id = 0;
			if (request.getParameter("id")!=null) {
				id = Integer.parseInt(request.getParameter("id").toString());
			}
			
			Car car = DataStorage.carStore.get(0);
			for (Car current: DataStorage.carStore) {
				if (current.getId()==id) {
					car = current;
				}
			}
			
			request.setAttribute("car", car);
			RequestDispatcher dispatcher = request.getRequestDispatcher("views/car.jsp");
			
			dispatcher.forward(request, response);
		}
}




