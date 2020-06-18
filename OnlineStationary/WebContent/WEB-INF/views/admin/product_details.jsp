
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
<!--  <h3>Last Action Status : ${requestScope.product_list}</h3>-->
	<table style="background-color: cyan; margin: auto;" border="1">
	<form action="<spring:url value='/cart/add'/>" method="post">
	
	<caption><h2>Product_Details</h2></caption>
	<tr>
	<td>Product Id</td>
	<td>Product Name:: </td>
	<td>Product Price:: </td>
	<td>Product Stock:: </td>
	<td>Product Quantity:: </td>
	<td>Product Description:: </td>
	<td>Product Image:: </td>
	<td>Product Update:: </td>
	<td>Product Delete:: </td>
	</tr>
	<c:forEach var="p" items="${requestScope.product_list }">
	
		<tr>
		<th>${p.product_id}</th>
		
		
		<th>${p.product_name}</th>
		
		
		<th>${p.stock}</th>
		
	
		<th>${p.product_price}</th>
		
		
		<th>${p.quantity}</th>
		
		
		<th>${p.description}</th>
		
		
		<th>${p.image}</th>
		
		<th><a href="<spring:url value='/product/update?product_id=${p.product_id}'/>">Update</a></th>
		
		<th><a href="<spring:url value='/admin/delete_product?product_id=${p.product_id}'/>">Delete</a></th>
		 
		</tr>
		
	</c:forEach>
</table>
</form>

	
</body>
</html>



