<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>User Login</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

  
</head>
<body>
<center>
<h2>Login Form</h2>
<h4 style="color: red;">${requestScope.mesg}</h4>
	<form  method="post">
	
			
	<div class="form-group">
	<label for="name"><b>User Email:</b></label>
    <input type="text"  name="email_id" placeholder="Enter email" required><br>
    <small name="email_id" class="form-text text-muted">We'll never share your email with anyone else.</small>
  	</div><br>
  	<br>
  	
  	<div class="form-group">
	<label for="name"><b>Enter Password:</b></label>
    <input type="password"  name="password" placeholder="Enter Password" required><br>
    <small name="password" class="form-text text-muted">We'll never share your Password with anyone else.</small>
  	</div><br>
  	
  	
  	<div class="form-group form-check">
    <label class="form-check-label">
     <input class="form-check-input" type="checkbox"> Remember me
    </label>
  	</div>
			
			
			<tr>
				<td>Select Role</td>
				<td><input type="radio" name="role" value="admin" />Admin</td>
				<td><input type="radio" name="role" value="user" />User</td>
			</tr>
				
				
			<tr>
				<td><input type="submit" value="Login" /></td>
			</tr>
			
		
	</form>
	</center>
</body>
</html>