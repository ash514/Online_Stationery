<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Online Stationary</title>
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
    
    GetAllProducts
  </style>
</head>
<h1><center >Online Stationary Portal</center></h1>
<body  background="${pageContext.request.contextPath}/resources/background.jpg" style="background-size:100%">
	<h4>
	<div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
		<li class="active"><a href="#">Home</a></li>
		<li><a href="user/login">User Login</a></li>
		<li><a href="user/login">Admin Login</a></li>
		<li><a href="admin/register">Sign Up</a></li>
		<li><a href="#">Contact Us</a></li>
		 </ul>
		
		 <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
        <li><a href="user/showcart"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
	</h4>
	
	<footer class="container-fluid text-center">
  	<!-- <p>Online Stationary All rights Received</p>  --> 
  	<form class="form-inline">Get deals:
    <input type="email" class="form-control" size="50" placeholder="Email Address">
    <button type="button" class="btn btn-danger">Sign Up</button>
  	</form>
	</footer>
	
	
</body>
</html>