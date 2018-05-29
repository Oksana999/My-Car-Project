package com.controller;

import java.io.IOException;

import javax.naming.Context;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Customer;
import com.DataStorage;

public class RegisterController extends HttpServlet{
	

		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			RequestDispatcher dispatcher = request.getRequestDispatcher("views/register.jsp");
			dispatcher.forward(request, response);

		}
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Customer customer = new Customer(request.getParameter("name"), request.getParameter("email"), 0, request.getParameter("password"));
			DataStorage.customerList.add(customer);
			request.getSession().setAttribute("customer", customer);
			response.sendRedirect("car-store");
		}
}