<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<jsp:include page="Navbar.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}
body {
	min-width: 700px;
	height: 100vh;
	background: linear-gradient(rgba(0, 2, 11, 0.6), rgba(0, 2, 11, 0.6)),
		url(https://images.pexels.com/photos/1205651/pexels-photo-1205651.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1)
		no-repeat;
	background-size: 100% 100%;
}
marquee {
	margin-top: 150px;
	font-size: 100px;
	color: white;
	text-shadow: 5px 5px 5px black;
}
</style>
</head>
<body>
	<marquee behavior="" direction="left">Welcome To Home Page</marquee>

</body>
</html>