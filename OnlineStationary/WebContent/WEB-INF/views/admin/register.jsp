<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

<script>
function Validate()
{
	var password=document.getElementById("password").value;
	var confirmPassword=document.getElementById("confirmPassword").value;
	if(password != confirmPassword)
		{
		alert("Password do NOT MATCH");
		return false;
		}
	return true;
	}
</script>

<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: pink;
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 30%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 20%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<form method="post">
    <h1>Registeration Form</h1>
    <h2>${requestScope.status}</h2> 
    <h2><p>Please Enter the Details</p></h2>
    <hr>
    
    <label for="name"><b>Name:</b></label>
    <input type="text" placeholder="Enter Name" name="User_name" required><br>
 
    
     <label for="phoneNo"><b>Mobile Number:</b></label>
    <input type="text" placeholder="Enter mobile Number" name="mobile_Number" required><br>
    
    <label for="adhar"><b>Aadhar Number:</b></label>
    <input type="text" placeholder="Adhar Number" name="adhar_Number" required><br>
    
    <label for="address"><b>Address:</b></label>
    <input type="text" placeholder="address" name="address" required><br>
    
    <label for="city"><b>City:</b></label>
    <input type="text" placeholder="city" name="city" required><br>
    
    <label for="email"><b>Email:</b></label>
    <input type="text" placeholder="Enter Email" name="email_id" required><br>

    <label for="password"><b>Password:</b></label>
    <input type="password" placeholder="Enter Password" name="password" id="password" required><br>
    
    <label for="confirm"><b>Confirm Password:</b></label>
    <input type="password" placeholder="Confirm Password" name="confirm_password" id="confirmPassword" required><br>

	<label for="role"><b> Choose Role:</b></label><br>
	<input type="radio" name="role" value="admin" />Admin<br>
	<input type="radio" name="role" value="user" />User<br>
	

    <hr>
	<button type="submit" value="SignUp" onclick="return Validate()" class="btn btn-success">Register</button>
	<input class="btn btn-primary" type="reset" value="Reset">
   
  </div>
  
</form>

</body>
</html>
