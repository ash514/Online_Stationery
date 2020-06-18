<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registeres User Details</title>
</head>
<body>
<!-- <h3>Last Action Status : ${requestScope.user_list}</h3> -->
	<table style="background-color: #4CAF50; margin: auto;" border="1">
	
	<caption><h1>User List</h1></caption>
	<c:forEach var="u" items="${requestScope.user_list }">
	<tr>
		
		<td>${u.user_name}</td>
		<td>${u.mobile_Number}</td>
		<td>${u.adhar_Number}</td>
		<td>${u.address}</td>
		<td>${u.city}</td>
		<td>${u.email_id}</td>
		
		<td><a href="<spring:url value='/admin/update?User_id=${u.user_id}'/>">Update</a></td>
		<td><a href="<spring:url value='/admin/delete?User_id=${u.user_id}'/>">Delete</a></td>
		
	
		
	</tr>
	</c:forEach>
</table>

	<!-- <a href="<spring:url value='/admin/register'/>">Register</a> -->
	<h2>
		<a href="<spring:url value='/user/logout'/>">Log Me Out</a>
	</h2>
	
</body>
</html>