<%@page import="com.jspider.productmvc.pojo.ProductPojo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="Navbar.jsp" />
<%
ProductPojo product = (ProductPojo) request.getAttribute("product");
String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	background: radial-gradient(rgba(6, 239, 111, 0.618),
		rgba(59, 101, 13, 0.812)) no-repeat;
	background-size: cover;
}

#maindiv {
	display: flex;
	justify-content: space-evenly;
	flex-wrap: wrap;
}

#main {
	box-shadow: 10px 10px 8px rgb(0, 0, 0);
	margin: 70px 20px;
	min-width: 350px;
	max-width: 30%;
	height: 350px;
	padding: 15px;
	border-radius: 2px;
	background-color: rgba(47, 44, 44, 0.697);
}

table {
	margin: 0 auto;
}

input {
	width: 100%;
	margin: 5px;
	border-radius: 5px;
	background: none;
	outline: none;
	padding: 8px;
	color: white;
	padding-left: 15px;
}

#search {
	background-color: rgb(21, 252, 63);
	color: black;
	font-weight: bolder
}

h2 {
	text-align: center;
	padding: 5px 0px 15px 0px;
	color: white;
}

#outputTableDiv {
	background-color: #95ff00;
	width: 550px;
	height: 350px;
	box-shadow: 10px 10px 5px black;
	border-radius: 2px;
	margin: 70px auto;
	padding: 20px 10px;
	transform: rotate(7deg);
}

#ot {
	padding: 5px;
	width: 500px;
	border-spacing: 0px;
}

#ot td {
	padding: 5px 10px;
	width: 100px;
	border: 1px solid black;
}

#dot{
	
	width: 19px;
	height: 19px;
	border-radius:50%; 
	background: radial-gradient(rgba(6, 239, 111, 0.618),
		rgba(59, 101, 13, 0.912)) no-repeat;
		margin-top: -5px
	}
	#msg h2{
	
	text-align: center;
	margin-top: 150px;
	background-color: red;
	color: white;
	padding: 0 15px;
	box-shadow: 5px 5px 5px black;
	
	}
</style>
</head>
<body>
	<div id="maindiv">
		<div id="main">
			<h2>Search Product</h2>
			<form action="./searchProduct" method="post">
				<table>
					<tr>
						<td><input type="text" name="id"
							placeholder="Enter Product Id"></td>
					</tr>
					<tr>
						<td><input id="search" type="submit" value="Search"></td>
					</tr>
				</table>
			</form>
		</div>
		<div id="msg">
			<%
			if (msg != null) {
			%>
			<h2><%=msg%></h2>
			<%
			}
			%>
		</div>

		<%
		if (product != null) {
		%>
		<div id="outputTableDiv">
			<div id="dot"></div>

			<table id="ot">
				<tr>
					<td><h3>Product Id</h3></td>
					<td><h3><%=product.getId()%></h3> <br></td>
				</tr>
				<tr>
					<td><h3>Product Name</h3></td>
					<td><h3><%=product.getName()%></h3></td>
				</tr>
				<tr>
					<td><h3>Price</h3></td>
					<td><h3><%=product.getPrice()%></h3> <br></td>
				</tr>
				<tr>
					<td><h3>Brand Name</h3></td>
					<td><h3><%=product.getBrand()%></h3></td>
				</tr>
				<tr>
					<td><h3>Color</h3></td>
					<td><h3><%=product.getColor()%></h3></td>
				</tr>

			</table>
		</div>
	</div>
	<%
	}
	%>

</body>
</html>