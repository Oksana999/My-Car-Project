<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/general.css">
<link rel="stylesheet" type="text/css" href="css/carlist.css">
<link rel="stylesheet" type="text/css" href="css/car.css">

<title>Car Store</title>
</head>
<body>

<div class="header">


<h1><class=logo>It is time to buy your car</h1>
	
	<br>
	<div class="menu">
		<div class="left">
			<div class="menu-item"><a href="home">Home</a></div>
			<div class="menu-item"><a href="car-store">Store</a></div>
			<div class="menu-item"><a href="report">Report</a></div>
		</div>
		
		<div class="right">
			<c:choose>
				<c:when test="${not empty customer}">
					<div class="menu-item"><a href="logout">Logout</a></div>
				</c:when>
				<c:otherwise>
					<div class="menu-item"><a href="login">Login</a></div> |<div class="menu-item"> <a href="register">Register</a></div>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</div>
</body>