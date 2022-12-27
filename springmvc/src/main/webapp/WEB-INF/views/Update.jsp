<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<jsp:include page="Navbar.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Student Details</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	background: radial-gradient(rgb(101, 234, 30), rgb(15, 163, 116))
		no-repeat;
	background-size: cover;
	height: 100vh;
}

#main {
	border: 1px solid;
	margin: 150px auto;
	min-width: 250px;
	max-width: 30%;
	padding: 20px;
	border-radius: 10px;
	background-color: rgba(244, 235, 235, 0.52);
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
	padding-left: 15px;
}

#update {
	background-color: rgb(175, 220, 16);
	color: black;
	font-weight: bolder
}

h3 {
	text-align: center;
	padding: 5px 0px 15px 0px;
	color: black;
}
</style>
</head>
<body>
	<div id="main">
		<h3>Update Student Details</h3>
		<form action="">
			<table>
				<tr>
					<td><input type="text" required placeholder="Enter Student Id"></td>
				</tr>
				<tr>
					<td><input id="update" type="submit" value="Update"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>