<%@page import="com.jspider.springmvc.pojo.StudentPojo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
StudentPojo student = (StudentPojo) request.getAttribute("student");
String massage = (String) request.getAttribute("msg");

int id=student.getId();
String name=student.getName();
String email=student.getEmail();
long contact=student.getContact();
String city=student.getCity();
String username=student.getUsername();
String password=student.getPassword();
%>
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
	background: linear-gradient(rgba(11, 232, 99, 0.966),
		rgba(55, 87, 163, 0.913)) no-repeat;
	background-size: 100% 100%;
	width: 100%;
}

#main {
	background: linear-gradient(rgba(15, 16, 16, 0.655),
		rgba(15, 16, 16, 0.455));
	margin: 25px auto;
	min-width: 250px;
	max-width: 35%;
	height: auto;
	padding: 30px;
	border-radius: 10px;
}

table {
	margin: 0 auto;
}

table tr td input {
	color: white;
	height: 40px;
	width: 100%;
	margin: 5px;
	border-radius: 5px;
	padding: 10px;
	background: none;
	outline: none;
	border: none;
	border-bottom: 2px solid rgb(198, 242, 0);
}

#main #login {
	border: none;
	background-color: rgba(11, 248, 23, 0.705);
	margin-top: 30px;
	width: 100%;
}

#headtext {
	color: white;
	padding: 10px 0 20px 0;
	text-align: center;
	font-size: 20px;
	font-family: Verdana, Geneva, Tahoma, sans-serif;
}
</style>
</head>
<body>
	<div id="main">
		<h3 id="headtext">Update Student Detail's</h3>
		<form action="./updatedetails" method="post">

			<table>
			 <tr>
					<td><input type="text" name="id" placeholder="Enter ID" disabled="disabled" value="<%=id %>" ></td>
				</tr>
			
				<tr>
					<td><input type="text" placeholder="Enter the Name" value="<%=name %>"
						name="name"></td>
				</tr>
				<tr>
					<td><input type="text" placeholder="Enter Mobile Number" value="<%=contact %>"
						name="mobile"></td>
				</tr>
				<tr>
					<td><input type="text" placeholder="Enter Email Id" value="<%=email %>"
						name="email"></td>
				</tr>
				<tr>
					<td><input type="text" placeholder="Enter City Name" value="<%=city %>"
						name="city"></td>
				</tr>
				<tr>
					<td><input type="text" placeholder="Enter the Username" value="<%=username %>"
						name="username"></td>
				</tr>
				<tr>
					<td><input type="password" placeholder="Enter the Password" value="<%=password %>"
						name="password"></td>
				</tr>
				<tr>
					<td><input id="login" type="submit" value="Update"></td>

				</tr>

			</table>
		</form>
	</div>
</body>
</html>