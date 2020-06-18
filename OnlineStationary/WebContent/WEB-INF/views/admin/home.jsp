<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>    
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default rounded borders and increase the bottom margin */ 
    .navbar {
      margin-bottom: 100px;
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
<body style="background-color:pink"; color:black">
<marquee scrollment="20" ><h3 Style="color:black; font-style:italic; ;">Online Stationary Portal</h3></marquee></marquee>
	<!-- <a href="Home">Home</a>
	<a href="<spring:url value='/product/add'/>">Add Products</a>
	<a href="<spring:url value='/admin/user_list'/>">Registered Users Details</a>
	<a href="<spring:url value='/product/product_details'/>">Products_Details</a>
	<a href="<spring:url value='/product/update'/>">Products_Updation</a>-->
	
	
	<!--  <h1><center >Online Stationary Portal</center></h1>-->
	<h4>
	<div class="collapse navbar-collapse" id="myNavbar">
 <ul class="nav navbar-nav">
	<a href="../index.jsp">Home</a>&nbsp;&nbsp;
	<a href="<spring:url value='/product/add'/>">Add_Products</a>&nbsp;&nbsp;
	<a href="<spring:url value='/admin/user_list'/>">Registered_User_Details</a>&nbsp;&nbsp;
	<a href="<spring:url value='/product/product_details'/>">Products_Details</a>&nbsp;&nbsp;
	<a href="<spring:url value='/product/update'/>">Products_Updation</a>&nbsp;&nbsp;
		
</ul>
    </div>
	</h4>
	

</body>
</html>
