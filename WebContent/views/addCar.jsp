<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/general.css">
<title>Add Car</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<h1>Add new car</h1>
	<form action="addCar" method="post">
		Photo:<input type="text"  name="imageName"><br>
		Discount:<input type="text" name="discount"><br>
		Model:<input type="text" name="model"><br>
		Price:<input type="text" name="price"><br>
		<input type="submit" value="addCar">
	</form>
</body>
</html>