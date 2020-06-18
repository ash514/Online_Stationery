<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body onclick="myFunction()">
<c:forEach var="book" items="${requestScope.cart}">
<h3><a href="getproduct?id=${products.product_id}">${productsproduct_name}</a> &nbsp; &nbsp; ${products.product_price} &nbsp; &nbsp; <a href="removeFrom?id=${book.id}">remove from cart</a></h3>
</c:forEach>
<h2>sub_total=${sessionScope.sum}</h2>
<h2>delivaryCharge=40</h2>

<h2>total=<span id="demo"></span></h2>

<script>
function myfunction()
{
	var p=${sessionScope.sum}+40;
	return p;
	
}
document.getElementById("demo").innerHTML = myfunction();
</script>
<div class="text-right">
     
  <a href="/secondHandBookPro/product/show" type="button" class=" btn btn-info text-left ">Continue Shopping</a>
  <a href="checkout" type="button" class=" btn btn-success text-right ">Checkout</a>
  
               
  </div>

</body>
</html>