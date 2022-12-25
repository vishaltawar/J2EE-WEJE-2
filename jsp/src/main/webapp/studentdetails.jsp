<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String firstName = request.getParameter("firstName");
String lastName = request.getParameter("lastName");
String email = request.getParameter("email");
String gender = request.getParameter("gender");
String mobile = request.getParameter("mobile");
String qualification = request.getParameter("qualification");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>

</head>
<body>
	<div style="background-color: yellow">
		<table >
			<tr>
				<td>First Name :</td>
				<td><%=firstName%></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><%=lastName%></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><%=email%></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><%=gender%></td>
			</tr>
			<tr>
				<td>Mobile Number :</td>
				<td><%=mobile%></td>
			</tr>
			<tr>
				<td>Qualification :</td>
				<td><%=qualification%></td>
			</tr>

		</table>
	</div>


</body>
</html>