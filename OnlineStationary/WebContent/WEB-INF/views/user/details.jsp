<!--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h4>${requestScope.status}</h4>
		<h5>User Details : ${sessionScope.product}</h5>
		
		<table style="background-color: yellow; margon:auto;">
		<c:forEach var="p" items="${requestScope.product}">
		<tr>
				<td>${p.name}</td>
				<td>${p.email}</td>	
				<td>${p.jn_date}</td>
				<td>${p.id}</td>
				<td><a href="<spring:url value='/emp/delete?eid=${p.id}'/>">Delete</a></td>
				
			</tr>
		</c:forEach>
		</table>
		
		<a href="<spring:url value='/user/showcart'/>">Show Cart</a>
		<a href="<spring:url value='/index.jsp'/>">Home Page</a>
<h8> 
<a href="logout">Logout</a>
</h8>
</body>
</html>-->





<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

  <title>Bootstrap Example</title>
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
    
 
  
  
    
  </style>

</head>
<body>

	<h4>${requestScope.status}</h4>
	<h5>User Details : ${sessionScope.user_dtls}</h5>
	
		<table style="background-color: yellow; margin: auto;">
		<c:forEach var="p" items="${requestScope.product}">
		<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">${p.product_name}</div>
        <div class="panel-body"><img src="resources/cake.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">${p.product_price}</div>
        <div class="panel-footer"><a href="<spring:url value='/user/cart?id=${p.product_id}'/>">add to cart</a><div>
      </div>
    <!--</div>

			<tr>
				<td>${p.name}</td>
				<td>${p.price}</td>
				<td>${p.weight}</td>
				<td>${p.quantity}</td>
				<td>${p.stock}</td>
				<td>${p.description}</td>
				<td><a href="<spring:url value='/user/cart?id=${p.id}'/>">add to cart</a></td>
			

			</tr>-->
			</div>
			</div>
			</div>
			
		</c:forEach>
	</table>
	
	<a href="<spring:url value='/index.jsp'/>">Home Page</a>
<h8> 
<a href="logout"> Logout </a>
</h8>
</body>
</html>