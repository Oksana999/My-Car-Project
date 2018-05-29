<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/general.css">
<title>Login to Car Store Inc.</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<h1>Login</h1>
	<form action="login" method="post">
		Email:<input type="text" name="email"><br>
	 	<c:if test="${sessionScope.errorMsg != null}">	
			<c:out value="${sessionScope.errorMsg}" />
			<br>
		</c:if>
		Password:<input type="password" name="password"><br> <input
			type="submit" value="login">
	</form>

</body>
</html>