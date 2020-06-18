<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<sf:form method="post" modelAttribute="product">
		<table style="background-color: cyan; margin: auto;">
			<tr>
				<td>Your Assigned Ref ID (R)</td>
				<td><sf:input  path="product_id" readonly="true"/></td>
			</tr>
			<tr>
				<td>Enter product name</td>
				<td><sf:input path="product_name" /></td>
			</tr>
				<tr>
				<td>Enter product price</td>
				<td><sf:input path="product_price" /></td>
			</tr>
			
			<tr>
				<td>Enter product quantity</td>
				<td><sf:input path="quantity" /></td>
			</tr>
			
			<tr>
				<td>Enter product stock</td>
				<td><sf:input path="stock" /></td>
			</tr>
			<tr>
				<td>Enter product description</td>
				<td><sf:input path="description" /></td>
			</tr>
			
			<tr>
				<td>Enter product description</td>
				<td><sf:input path="image" /></td>
			</tr>
			<tr>
				<td>
				<input type="submit" value="Update Details" />
				</td>
				</tr>
		</table>
	</sf:form>

</body>
</html>