package com.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Car;
import com.Customer;
import com.DataStorage;
import com.Transaction;

public class BuyCarController extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long id = Long.parseLong(request.getParameter("car-id"));
		Car car = null;
		for (int i = 0; i < DataStorage.carStore.size(); i++) {
			if (DataStorage.carStore.get(i).getId() == id) {
				car = DataStorage.carStore.get(i);  // find chosen car
			}
		}
		Customer customer = (Customer) request.getSession().getAttribute("customer");

		Transaction t = new Transaction(car, customer, LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
		DataStorage.transactionsList.add(t);
		DataStorage.carStore.remove(car);

		request.setAttribute("car", car);
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/thank-you.jsp");
		dispatcher.forward(request, response);

	}

}
