package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DataStorage;

public class ReportController extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("transactions", DataStorage.transactionsList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/report.jsp");
		dispatcher.forward(request, response);

	}
	
}
