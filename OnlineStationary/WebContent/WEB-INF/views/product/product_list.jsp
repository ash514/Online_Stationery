
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<title>Product List</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default rounded borders and increase the bottom margin */ 
    .navbar {
      margin-bottom: 50px;
      border-radius: 0;
    }
    
    /* Remove the jumbotron's default bottom margin */ 
     .jumbotron {
      margin-bottom: 0;
    }
   
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
    
    
    @import url('https://fonts.googleapis.com/css?family=Numans');

html,body{
background-image: url('https://images.all-free-download.com/images/graphiclarge/office_stationary_184523.jpg');
background-size: cover;
background-repeat: no-repeat;
height: 100%;
font-family: 'Numans', sans-serif;
}
    
   
  </style>
</head>
<body>
<!--   <h3>Last Action Status : ${requestScope.product_list}</h3>-->
<form action="<spring:url value='/cart/add'/>" method="post">
	<table style="background-color: white; margin: auto;" border="2">
	
	<caption><h1>Product_List</h1></caption>
	<tr>
	<td><h4>Product Id</h4></td>
	<td><h4>Product Name</h4></td>
	<td><h4>Product Price</h4></td>
	<td><h4>Product Description</h4></td>
	
	</tr>
	<c:forEach var="p" items="${requestScope.product_list }">
	
	<tr>
		<th>${p.product_id}</th>
		
		
		<th>${p.product_name}</th>
		
		
		<th>${p.product_price}</th>
		
		
		
		<th>${p.description}</th>
		<th><td>
			Quantity::<input type ="number" name ="quantity"></td></th>
			
				<th><td>
			Product Id<input type ="number" value="${p.product_id}" name="product_id" readonly></td></th>
	
			
		
		<th>
		<input type="submit" value="Add To Cart"></th>	
	</tr>
	</c:forEach>

</table>
</form>	

</body>
</html>








<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Last Action Status : ${requestScope.product_list}</h3>
	<table style="background-color: cyan; margin: auto;" border="1">
	
	<h2><caption>Product_List</caption></h2>
	<c:forEach var="p" items="${requestScope.product_list }">

		<tr>
		<td>Product Name:: </td><th>${p.product_name}</th></tr>
		
		<tr>
		<td>Product Price:: </td><th>${p.product_price}</th></tr>
		
		<tr>
		<td>Product Description:: </td><th>${p.description}</th></tr>
	
		<tr>
		<td>Product Image:: </td><th>${p.image}</th></tr>
				
	
	</c:forEach>
</table>
</body>
</html>-->







