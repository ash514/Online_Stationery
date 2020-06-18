<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>

  <title>Home Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
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
	<!--<a href="Home">Home</a>
	<a href="<spring:url value='/product/category_list'/>">Category List</a>
	<a href="<spring:url value='/product/product_list'/>">List_of_Products</a>
	<a href="<spring:url value='/product/product_details'/>">Products_Details</a>
	<a href="<spring:url value='/product/cart_items'/>">ViewCart</a>-->

<nav class="navbar navbar-expand-sm bg-light">
  <ul class="navbar-nav">
<li class="nav-item">
<a href="<spring:url value='/product/category_list'/>">Category List</a>&nbsp;&nbsp;&nbsp;
</li>


<li class="nav-item">
<a href="<spring:url value='/product/product_list'/>">Get Products</a>&nbsp;&nbsp;&nbsp;
</li>

<li class="nav-item">
<a href="<spring:url value='/product/product_details'/>">Products_Details</a>&nbsp;&nbsp;&nbsp;
</li>


<li class="nav-item">
<a href="<spring:url value='/product/cart_items'/>">ViewCart</a>&nbsp;&nbsp;&nbsp;
</li>

<li class="nav-item">
 <a href="<spring:url value='/user/logout'/>">Logout</a>&nbsp;
</li>

</ul>
</nav>
<br>

</body>
</html>