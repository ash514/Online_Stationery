<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
 <h3>Your Grand Total is::${sessionScope.gtotal}</h3>
 
 			<h4>
			<a href="<spring:url value='/product/product_list'/>">Continue Shopping</a>
			</h4>
			
 			<h4>
			<a href="<spring:url value='/cart/showcart'/>">View Cart</a>
			</h4>
			<h4>
			<a href="<spring:url value='/user/logout'/>">Log Me Out</a>
			</h4>
			
			<h4>
			<a href=#>Order Now</a>
			</h4>
			
  
  
  
</body>
</html>