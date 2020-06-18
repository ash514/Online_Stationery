<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>    



<!DOCTYPE html>
<html lang="en">
<head>
  <title>Online Stationary</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  
  
  <script>
// Add the following code if you want the name of the file appear on select
	$(".custom-file-input").on("change", function() {
  	var fileName = $(this).val().split("\\").pop();
 	 $(this).siblings(".custom-file-label").addClass("selected").html(fileName);
	});
</script>
  
</head>
<body>
<div class="container mt-3">
	<form  method="post">
	<div>		
	<label for="name"><b>Enter product Stock:</b></label>
    <input type="text" placeholder="Enter Name" name="stock" required><br>
 	</div>
 	
    <div>
     <label for="phoneNo"><b>Enter product name:</b></label>
    <input type="text" placeholder="Enter mobile Number" name="product_name" required><br>
    </div>
    
    <div>
    <label for="adhar"><b>Enter product price:</b></label>
    <input type="text" placeholder="Adhar Number" name="product_price" required><br>
    </div>
    
    <div>
    <label for="address"><b>Enter product Quantity:</b></label>
    <input type="text" placeholder="address" name="quantity" required><br>
    </div>
    
    <div>
    <label for="city"><b>Enter product description:</b></label>
    <input type="text" placeholder="city" name="description" required><br>
    </div>
    
    <!-- <div>
    <label for="email"><b>Enter product Image:</b></label>
    <input type="text" placeholder="Enter Email" name="email_id" required><br>
	</div>-->

	<!-- <p>Enter product Image::</p>
    <div class="custom-file mb-3">
      <input type="file" class="custom-file-input" id="customFile" name="image">
      <label class="custom-file-label" for="customFile">Choose file</label>
    </div>-->
    
   	<div>
    <label for="city"><b>Enter product Image:</b></label>
    <input type="file" id="myFile" name="image">
    <div class="mt-3">
    <button type="submit" class="btn btn-primary">Submit</button>
    </div>
  	</form>
	</div>

</body>
</html>


<!--<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post">
		<table style="background-color: yellow; margin: auto;">
			
			<!--<tr>
				<td>Enter Category Id</td>
				<td><input type="text" name="category_id" value="${requestScope.cat }"/></td>
			</tr>
			<tr>
				<td>Enter product Stock</td>
				<td><input type="number" name="stock" /></td>
			</tr>
			
			<tr>
				<td>Enter product name</td>
				<td><input type="text" name="product_name" /></td>
			</tr>
			<tr>
				<td>Enter product price</td>
				<td><input type="number" name="product_price" /></td>
			</tr>
			
			<tr>
				<td>Enter product Quantity</td>
				<td><input type="number"  name="quantity" /></td>
			</tr>
			
			<tr>
				<td>Enter product description</td>
				<td><input type="text"  name="description" /></td>
			</tr>
			
			<tr>
				<td>Enter product Image</td>
				<td><input type="text"  name="image" /></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Add Products" /></td>
			</tr>
			
		</table>
	</form>

</body>
</html>-->