<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/general.css">
<link rel="stylesheet" type="text/css" href="css/report.css">
<title>Purchase reports</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<h1>Transaction Report</h1>
	<div class="table">
	<div class="row">
		<div class="cell">Customer</div>
		<div class="cell">Car</div>
		<div class="cell">Date</div>
	
	</div>
		<c:forEach var="transaction" items="${transactions}">
			<div class="row">
				<div class="cell"><c:out value="${transaction.customer.name}" /></div>
				<div class="cell"><c:out value="${transaction.car.model}" /></div>
				<jsp:useBean id="dateValue" class="java.util.Date"/>
				<jsp:setProperty name="dateValue" property="time" value="${transaction.date * 1000}"/>
				<div class="cell"><fmt:formatDate value="${dateValue}" pattern="MM/dd/yyyy"/></div>
			</div>
		</c:forEach>
	</div>
	<div class="main-img">
		<img alt="Camaro 2018" src="img/cars/Mersedes3.jpg">
	</div>
</body>
</html>