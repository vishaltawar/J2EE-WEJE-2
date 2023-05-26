<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="Navbar.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Home Page</title>
</head>
<style>
body {
	text-align: center;
	min-width: 700px;
	height: 100vh;
	background: linear-gradient(rgba(0, 2, 11, 0.75), rgb(27 220 211/ 26%)),
		url(https://www.edesk.com/wp-content/uploads/2021/03/find-trending-products-sell-ecommerce.png)
		no-repeat;
	background-size: 100% 100%;
}

#home {
	margin-top: 150px;
	font-size: 70px;
	color: white;
	background: linear-gradient(#2cebe5, #3aeb2c, rgb(255 235 0));
	background-clip: text;
	-webkit-background-clip: text;
	color: transparent;
}

#span-text {
	text-align: center;
	color: #b8ffd1;
	font-style: italic;
}
</style>
<body>
	<h2 id="home">Welcome to Product Management</h2>
	<span id="span-text">Keep Your Product here in Shorted Manner.</span>
</body>
</html>