<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/general.css">
<link rel="stylesheet" type="text/css" href="css/index.css">

<title>It is time to buy your car</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<h1>Welcome to the car store !</h1>
	<form id="cartypeform" action="choseType" method="POST">
		<select name="type">
		<option value="Type of car">Type of car</option>
		<option value="New">New</option>
		<option value="Used">Used</option>
		<option value="Bid">Bid</option>
			<c:forEach var="typ" items="${types}">			
				<option value="<c:out value="${typ}"/>"><c:out value="${typ}"/></option>
			</c:forEach>
			
		</select>
		<input type="submit" value="Search"/>
	</form>
	<table>
		<c:forEach var="car" items="${carStore}">
			<a href="car?type=<c:out value="${car.type}"/>">   
			
				<tr>
					<td class="cell">
						<c:out value="${car.model}" />
					</td>
					<td class="cell">
					<br><br>
						<img src="img/cars/<c:out value="${car.imageName}"/>" width="100px" height="50px"/>
					</td>
					<td class="cell">
						<c:out value="${car.type}" /> - <c:out value="${car.discount}" />%
					</td>
					<td class="cell">
						<fmt:setLocale value="en_US"/>
						<fmt:formatNumber value="${car.price}" type="currency"/>
					</td>
				</tr>
			</a>
		</c:forEach>
					</table>
		
	
	<div class="main-img">
		<img alt="Camaro 2018" src="img/cars/Img1.jpg">
	</div>

</body>
</html>