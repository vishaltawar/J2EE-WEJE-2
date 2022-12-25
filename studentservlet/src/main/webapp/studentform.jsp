<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student JSP</title>
</head>
<body>

	<form action="./studentdetails.jsp" method="post">
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

</body>
</html>