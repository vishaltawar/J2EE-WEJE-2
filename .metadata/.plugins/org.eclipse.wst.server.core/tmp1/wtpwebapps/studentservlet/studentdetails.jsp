<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.io.IOException"%>
<%@page import="java.sql.SQLException"%>
<%@page import="javax.servlet.ServletException"%>
<%@page import="javax.servlet.annotation.WebServlet"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.ServletException"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%!Connection connection;
	PreparedStatement statement;
	int result = 0;%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	try {
	%>
	<%
	Class.forName("com.mysql.cj.jdbc.Driver");
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2", "root", "root");
	String query = "insert into student_form values(?,?,?,?,?,?)";
	statement = connection.prepareStatement(query);
	statement.setString(1, request.getParameter("firstName"));
	statement.setString(2, request.getParameter("lastName"));
	statement.setString(3, request.getParameter("email"));
	statement.setString(4, request.getParameter("gender"));
	statement.setString(5, request.getParameter("mobile"));
	statement.setString(6, request.getParameter("qualification"));
	int result = statement.executeUpdate();
	%>

	<%
	if (result != 0) {
	%>
	<h1><%=result + " Record Successfully Saved In Database."%></h1>
	<%
	}
	%>
	<%
	} catch (ClassNotFoundException e) {
	%>
	<%=e%>
	<%
	} catch (SQLException e) {
	%>
	<%=e%>
	<%
	} finally {
	if (connection != null) {
		try {
			connection.close();
		} catch (SQLException e) {
	%>
	<%=e%>
	<%
	}
	}
	if (statement != null) {
	try {
	statement.close();
	} catch (SQLException e) {
	%>
	<%=e%>
	<%
	}
	}
	}
	%>

	<div style="background-color: yellow">
		<table>
			<tr>
				<td>First Name</td>
				<td>: <%=request.getParameter("firstName")%></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td>: <%=request.getParameter("lastName")%></td>
			</tr>
			<tr>
				<td>Email</td>
				<td>: <%=request.getParameter("email")%></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>: <%=request.getParameter("email")%></td>
			</tr>
			<tr>
				<td>Mobile Number</td>
				<td>: <%=request.getParameter("mobile")%></td>
			</tr>
			<tr>
				<td>Qualification</td>
				<td>: <%=request.getParameter("qualification")%></td>
			</tr>

		</table>
	</div>


	</div>


</body>
</html>