<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
	<jsp:include page="header.jsp" />
	<h1>Car Store</h1>
	<form id="carmodelform" action="car-store">
		<select name="model">
		<option value="сhoice of models">Choice of models</option>
			<c:forEach var="mdl" items="${models}">			
				<option value="<c:out value="${mdl}"/>"><c:out value="${mdl}"/></option>
			</c:forEach>
		</select>
		<input type="submit" value="Search"/>
	</form>
	
	<div class="table">
		<div class="row">
		<div class="cell">Model</div>
		<div class="cell">Photo</div>
		<div class="cell">Discount</div>
		<div class="cell">Price</div>
		</div>
		</div>
		<c:forEach var="car" items="${carStore}">
			<a href="car?id=<c:out value="${car.id}"/>">    <!--для перехода на страницу машины с заданным id --->
				<div class="row">
					<div class="cell">
						<c:out value="${car.model}" />
					</div>
					<div class="cell">
						<img src="img/cars/<c:out value="${car.imageName}"/>" width="100px" height="60px"/>
					</div>
					<div class="cell">
						<c:out value="${car.type}" /> - <c:out value="${car.discount}" />%
					</div>
					<div class="cell">
						<fmt:setLocale value="en_US"/>
						<fmt:formatNumber value="${car.price}" type="currency"/>
					</div>
				</div>
			</a>
		</c:forEach>
	</div>
	
	<div class="menu-item"><a href="addCar">addCar</a></div>
</body>
</html>