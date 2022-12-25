<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	background: linear-gradient(rgb(29, 138, 50), rgb(28, 29, 146));
	background-repeat: no-repeat;
	background-size: cover;
	height: 100vh;
}

table tr td input {
	height: 50px;
	margin: 5px;
	width: 300px;
	border-radius: 10px;
	padding: 8px;
	background-color: white;
}

table {
	border-spacing: 0;
	margin: 20px auto;
	height: 400px;
}

#submit {
	padding: 5px;
	width: 300px;
	height: 50px;
	background-color: #0d6efd;
	color: white;
	font-size: 25px;
	font-weight: bolder;
}

div {
	background: linear-gradient(rgb(51, 48, 46), rgb(164, 28, 249));
	margin: 35px auto;
	border-radius: 15px;
	width: 500px;
	text-align: center;
	padding: 10px 0px;
}

form h2 {
	padding-top: 50px;
	color: white;
}
</style>
</head>
<body>

	<div>

		<form action="./studentdetails.jsp" method="get">
			<h2>Student Registration form</h2>
			<table>
				<tr>
					<td><input type="text" placeholder="Enter First Name"
						name="firstName"></td>
				</tr>
				<tr>
					<td><input type="text" placeholder="Enter Last Name"
						name="lastName"></td>
				</tr>
				<tr>
					<td><input type="email" placeholder="Enter Email" name="email"></td>
				</tr>
				<tr>
					<td><input type="text" placeholder=" Enter Gender"
						name="gender"></td>
				</tr>
				<tr>
					<td><input type="tel" placeholder="Enter Mobile Number"
						name="mobile"></td>
				</tr>
				<tr>
					<td><input type="text"
						placeholder="Enter Highest Qualification" name="qualification"></td>
				</tr>
				<tr>
					<td><input id="submit" type="submit" value="Submit"></td>
				</tr>
			</table>

		</form>

	</div>

</body>
</html>