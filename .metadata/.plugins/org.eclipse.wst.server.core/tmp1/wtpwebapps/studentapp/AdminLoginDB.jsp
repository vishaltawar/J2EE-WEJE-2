<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.io.IOException"%>
<%@page import="java.sql.SQLException"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%!Connection connection;
	PreparedStatement statement;
	ResultSet resultSet;%>

<%
boolean found = false;
String username = request.getParameter("username");
String password = request.getParameter("password");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login Details</title>
</head>
<body>

	<%
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentapp", "root", "root");
		String query = "select * from admin ";
		statement = connection.prepareStatement(query);
		resultSet = statement.executeQuery();
		while (resultSet.next()) {
			String uname = resultSet.getString(3);
			String pass = resultSet.getString(4);
			if (username.equals(uname) && password.equals(pass)) {
	%>
	<!-- <jsp:forward page="AdminHome.jsp"/>-->
	<%
	found=true;
	response.sendRedirect("AdminHome.jsp");
	}
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
	if (resultSet != null) {
	try {
	resultSet.close();
	} catch (SQLException e) {
	%>
	<%=e%>
	<%
	}
	}
	}
	%>
	<form action="./AdminHome.jsp">
	<%if(found==false){
		
		
		}%>
	}
	</form>

</body>
</html>