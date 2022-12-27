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

<%
try {
%>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentapp", "root", "root");
String query = "insert into admin values(?,?,?,?)";
statement = connection.prepareStatement(query);
statement.setString(1, request.getParameter("id"));
statement.setString(2, request.getParameter("name"));
statement.setString(3, request.getParameter("username"));
statement.setString(4, request.getParameter("password"));
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

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Registration Details</title>
<style>
table{
border: 2px solid;
background-color: yellow;
padding: 5px;
}
tr{
border: 1px solid
}

</style>
</head>
<body>
	<table >
		<tr>
			<td>Admin Id</td>
			<td>: <%=request.getParameter("id")%></td>
		</tr>
		<tr>
			<td>Admin Name</td>
			<td>: <%=request.getParameter("name")%></td>
		</tr>
		<tr>
			<td>Username</td>
			<td>: <%=request.getParameter("username")%></td>
		</tr>
		<tr>
			<td>Password</td>
			<td>: <%=request.getParameter("password")%></td>
		</tr>
	</table>

</body>
</html>