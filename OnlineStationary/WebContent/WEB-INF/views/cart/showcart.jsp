<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<!-- <html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">Products in the Cart</h3>
<table style="background-color:white; margin: auto;">

 				<c:forEach  var="c" items="${sessionScope.cart}">  
               	<tr><td>Product_Name:: </td>
				<th>${c.product.product_name}</th></tr>
				
				
				<tr><td>Product_Price::</td>
				<th>${c.product.product_price}</th></tr>
				<tr>
				<td>${c.toatalprice}</td>
				<td>${c.quantity}</td>
				</tr>
			
</c:forEach> 
</table>
	<h4>
		<a href="<spring:url value='/user/logout'/>">Log Me Out</a>
	</h4>
   
</body>
</html>-->





<div class="container" >
      
            <div>
                <a href="<c:url value="/Admin/deleteProduct/${product.product_id}" />">
                            <span class="glyphicon glyphicon-remove-sign"></span>delete
                        </a>
                <a href="<c:url value="/cart/add/${product.product_id }/${cartId}" />" class="btn btn-info pull-right">
                    <span class="glyphicon glyphicon-shopping-cart"></span>Check out!
                </a>
            </div>
            <table class="table table-hover">
                <tr>
                  <th>Product_Name</th>
                    <th>Product_Price</th>
                    <th>Quantity</th>
                    <th>Totalprice</th>
                  <!--  <th>Action</th>  -->
                </tr>
                
          
		 <c:forEach items="${sessionScope.cart}" var="c">  
               <tr >
               <td>${c.product.product_name}</td>
               <td>${c.product.product_price}</td>
             	<td>${c.quantity}</td>
                <td>${c.toatalprice}</td>
				
                <td>
                        <a href="<c:url value="/cart/remove?cartitem_id=${c.cartitem_id}" />" class="label label-danger" >
                         <span class="glyphicon glyphicon-remove"></span>Remove
                        </a>
           
                </td> 
                 </tr>
               </c:forEach>
                 
                   
        
                <tr>
                    <th></th>
                    <th></th>
                    <th>Grand Total</th>
                    <th><h1>Total Products are: ${sessionScope.count}</h1></th>
                    <a href="<spring:url value='/cart/grandtotal?cart_id=${sessionScope.catid}'/>"> See GrandTotal</a>
                    <th></th>
                </tr>
            </table>

            <a href="<c:url value="/product/product_list" />" class="btn btn-info">Continue Shopping</a>
        </div>
    </div>
