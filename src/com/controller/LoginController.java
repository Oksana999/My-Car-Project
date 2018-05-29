package com.controller;

import java.io.IOException;
import java.util.List;

import javax.naming.Context;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Customer;
import com.DataStorage;

public class LoginController extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().removeAttribute("errorMsg");
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/login.jsp");
		dispatcher.forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In login controller");
		HttpSession session = request.getSession();
		Customer currentCustomer = null;
		for (Customer customer : DataStorage.customerList) {
			if (customer.getEmail().equals(request.getParameter("email"))
					&& customer.getPassword().equals(request.getParameter("password"))) {
				currentCustomer = customer;
				session.setAttribute("customer", currentCustomer);
				response.sendRedirect("car-store");
				break;
			}
		}
				
		if (currentCustomer == null) {
			request.getSession().setAttribute("errorMsg", "Wrong password");
			RequestDispatcher dispatcher = request.getRequestDispatcher("views/login.jsp");
			dispatcher.forward(request, response);
		}
		

	}
}
