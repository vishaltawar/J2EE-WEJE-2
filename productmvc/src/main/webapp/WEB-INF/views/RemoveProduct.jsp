<%@page import="java.util.List"%>
<%@page import="com.jspider.productmvc.pojo.ProductPojo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
List<ProductPojo> allProduct = (List<ProductPojo>) request.getAttribute("allProduct");
String msg = (String) request.getAttribute("msg");
%>
<jsp:include page="Navbar.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Remove</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	background: radial-gradient(rgb(80 123 119/ 50%), rgb(15, 163, 116))
		no-repeat;
	background-size: cover;
	height: 100vh;
}

#main {
	border: 1px solid;
	margin: 50px auto;
	min-width: 250px;
	max-width: 30%;
	padding: 20px;
	border-radius: 10px;
	background-color: rgb(54 43 43 / 72%);
}
#main h3{
color: white;
}

table {
	margin: 0 auto;
}

input {
	width: 100%;
	margin: 5px;
	border-radius: 5px;
	background: white;
	outline: none;
	padding: 8px;
	padding-left: 15px;
}

#remove {
	background-color: rgb(175, 220, 16);
	color: black;
	font-weight: bolder
}

h3 {
	text-align: center;
	padding: 5px 0px 15px 0px;
	color: black;
}

#table2 {
	margin: 0px auto;
	width: 100%;
	padding: 15px;
	text-align: center;
	background-color: yellow;
	border-spacing: 0px;
}

#table2 tr td {
	padding: 8px;
}

#outputData{
margin: 20px 0px;
border: 5px solid;
border-radius: 5px;

}
</style>
</head>
<body>
	<div id="main">
		<h3>Remove Product</h3>
		<form action="./removeProduct" method="post">
			<table>
				<tr>
					<td><input type="text" name="id" required
						placeholder="Enter Product Id"></td>
				</tr>
				<tr>
					<td><input id="remove" type="submit" value="Remove"></td>
				</tr>
			</table>
		</form>
	</div>
	<div>
		<%
		if (msg != null) {
		%>
		<h2 style="text-align: center;"><%=msg%></h2>
		<%
		}
		%>
	</div>
	

	<div id="outputData">
	<h2 style="text-align: center; background-color: #e85a41"> Product Details</h2>
		<%
		if (allProduct != null) {
		%>
		<table id="table2" border="1px solid black">
			<tr>
				<td><h3>SR No</h3></td>
				<td><h3>Product Id</h3></td>
				<td><h3>Product Name</h3></td>
				<td><h3>Price</h3></td>
				<td><h3>Brand</h3></td>
				<td><h3>Color</h3></td>
			</tr>
			<%
			int n=1;
			for (ProductPojo product : allProduct) {
			%>
			<tr>
				<td><%=n++%></td>
				<td><%=product.getId()%></td>
				<td><%=product.getName()%></td>
				<td><%=product.getPrice()%></td>
				<td><%=product.getBrand()%></td>
				<td><%=product.getColor()%></td>
			</tr>
			<%
			}
			}
			%>

		</table>
	</div>

</body>
</html>