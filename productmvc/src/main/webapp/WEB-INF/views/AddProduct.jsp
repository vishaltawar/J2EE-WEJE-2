<%@page import="com.jspider.productmvc.pojo.ProductPojo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<jsp:include page="Navbar.jsp"/>
<%
ProductPojo product = (ProductPojo) request.getAttribute("product");
String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<style>
body {
	background: linear-gradient(rgb(246, 220, 71), rgb(62, 237, 214));
	height: 100vh;
}

#d1 {
	margin: 40px auto;
	border: 1px solid;
	min-width: 450px;
	max-width: 550px;
	height: 400px;
	border-radius: 5px;
	background: rgba(0, 0, 0, 0.196);
	padding: 10px;
}

#d1 h3 {
	text-align: center;
	color: white;
	font-size:28px;
	font-weight: bold;
}

table {
	margin: 0px auto;
	border-spacing: 0px;
}

table td {
	margin: 15px;
	padding: 10px;
}

label {
	color: white;
	font-size: 25px;
}

input {
	padding: 3px 5px;
	width: 87%;
	outline: none;
	
	background: rgba(255, 249, 249, 0.565);
	border-radius: 5px;
}

#submit {
	background-color: rgba(105, 140, 255, 0.926);
	color: white;
	height:50px;
	font-weight: bolder;
	cursor: pointer;
	padding: 3px 10px;
	font-size: 20px;
	margin-left: 15px;
	border: none;
	border: 0.5px solid black;
	box-shadow: 5px 5px 5px black;
	
	
}

#reset {
	background-color: rgba(214, 225, 53, 0.998);
	color: white;
	font-weight: bolder;
	height:50px;
	cursor: pointer;
	padding: 3px 10px;
	font-size: 20px;
	border: 0.5px solid black;
	box-shadow: 5px 5px 5px black;
	
	
}
#outputHead{
	color: green;
}
</style>
</head>


<body>
	<div id="d1">
		<%
		if (product != null) {
		%>
		<h2 id="outputHead"><%=product.getName() + " Data added Successfully"%></h2>
		<%
		} else if (msg != null) {
		%>
		<h2><%=msg%></h2>
		<%
		}
		%>

		<h3>Add Product</h3>
		<form action="./addProduct" method="post">
			<table>
				<tr>
					<td><label for="">Product Name </label></td>
					<td>:- <input type="text" name="name"></td>
				</tr>
				<tr>
					<td><label for=""> Price </label></td>
					<td>:- <input type="text" name="price"><br></td>
				</tr>
				<tr>
					<td><label for="">Brand Name </label></td>
					<td>:- <input type="text" name="brand"></td>
				</tr>
				<tr>
					<td><label for=""> Color </label></td>
					<td>:- <input type="text" name="color"></td>
				</tr>

				<tr>
					<td><input type="reset" value="Reset" id="reset"></td>
					<td><input type="submit" name="" value="Add Product"
						id="submit"></td>
				</tr>
			</table>


		</form>
	</div>

</body>
</html>