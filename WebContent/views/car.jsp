<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!--подключение библиотеки тегов -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/general.css">
<link rel="stylesheet" type="text/css" href="css/car.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car page</title>
</head>

<body class="body-color">
<jsp:include page="header.jsp"/>     <!-- add  header -->


<div class="cell">
	<span class="small">model:</span> <c:out value="${car.model}"/>
</div>                               <!--(...request.getParameter("car").getName  --->
<div class="cell">
	<span class="small">manufactureName:</span><c:out value="${car.manufactureName}"/></div>
<div class="cell">
	<span class="small">yearBuild:</span> <c:out value="${car.yearBuild}"/></div>
<div class="cell">
	<span class="small">price:</span> <c:out value="${car.price}"/></div>
<div class="cell">
	<span class="small">kiloMeters:</span> <c:out value="${car.kiloMeters}"/></div>
<div class="cell"><span class="small">description:</span> <c:out value="${car.description}"/></div>
<div class="cell">
	<span class="small">type:</span> <c:out value="${car.type}"/>
</div>
	<div class="cell">
		<img src="img/cars/<c:out value="${car.imageName}"/>" />
	</div>
	
	<c:choose>	
		<c:when test="${not empty customer}"> 
			<div class="buy">      <!--Forming a request from the user through the Buy form to buy a car. Transmitted to BuyCarController -->
				<form action="buy-car" method="post">
						<input type="hidden" name="car-id" value="<c:out value="${car.id}"/>"> 
						<input type="submit" value="Buy">
				</form>
			</div>
		</c:when>
		<c:otherwise>
			<div>Please <a href="login">login</a> or <a href="register">register</a> to buy this car</div>
		</c:otherwise>
	</c:choose>
</body>
</html>