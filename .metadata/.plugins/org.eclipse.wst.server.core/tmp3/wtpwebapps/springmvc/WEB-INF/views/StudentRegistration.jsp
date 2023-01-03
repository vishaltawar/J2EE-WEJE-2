<%@page import="com.jspider.springmvc.pojo.StudentPojo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="Navbar.jsp"></jsp:include>
<%
StudentPojo student = (StudentPojo) request.getAttribute("student");
String masage = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	background: linear-gradient(rgba(11, 232, 99, 0.966),
		rgba(163, 55, 141, 0.913)) no-repeat;
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
	background-color: rgba(11, 102, 248, 0.705);
	margin-top: 30px;
	width: 100%;
}

#main #reset {
	border: none;
	background-color: rgba(200, 222, 34, 0.907);
	width: 100%;
	float: left;
}

#headtext {
	color: white;
	padding: 10px 0 20px 0;
	text-align: center;
	font-size: 20px;
	font-family: Verdana, Geneva, Tahoma, sans-serif;
}

.responce {
	color: white;
	text-align: center;
}
</style>
</head>
<body>
	<div id="main">
		<h3 id="headtext">Student Registration</h3>
		<form action="./add" method="post">

			<table>
				<!-- 	<tr>
					<td><input type="text" placeholder="Enter ID" required name="id"></td>
				</tr> -->
				<tr>
					<td><input type="text" placeholder="Enter the Name"
						name="name"></td>
				</tr>
				<tr>
					<td><input type="text" placeholder="Enter Email Id "
						name="email"></td>
				</tr>
				<tr>
					<td><input type="text" placeholder="Enter Mobile Number"
						name="mobile"></td>
				</tr>
				<tr>
					<td><input type="text" placeholder="Enter City Name"
						name="city"></td>
				</tr>
				<tr>
					<td><input type="text" required
						placeholder="Enter the Username" name="username"></td>
				</tr>
				<tr>
					<td><input type="password" required
						placeholder="Enter the Password" name="password"></td>
				</tr>
				<tr>
					<td><input id="login" type="submit" value="Submit "></td>

				</tr>
				<tr>
					<td><input id="reset" type="reset" value="Reset "></td>
				</tr>
			</table>
		</form>
	</div>
	<%
	if (student != null) {
	%>
	<h3 class="responce">
		<%=student.getName() + " Data Added Successfully"%></h3>
	<%
	} else if (masage != null) {
	%>
	<h3 class="responce"><%=masage%></h3S>
	<%
	}
	%>
</body>
</html>