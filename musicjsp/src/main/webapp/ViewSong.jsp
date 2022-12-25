<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.io.IOException"%>
<%@page import="java.sql.SQLException"%>
<%@page import="javax.servlet.ServletException"%>
<%@page import="javax.servlet.annotation.WebServlet"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.ServletException"%>

<%!Connection connection;%>
<%!PreparedStatement statement;%>
<%!ResultSet resultSet;%>
<%!String id;
String name;
String movie;
float length;
String singer;
String composer;
String lyrics;%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Songs</title>
<style>
table {
	border: 1px solid yellow;
	padding: 5px;
}

tr {
	border: 1px solid;
	color: orangered;
}
</style>
</head>
<body>
	<%
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2", "root", "root");
		statement = connection.prepareStatement("select * from song");
		resultSet = statement.executeQuery();
	%>


	<%
	while (resultSet.next()) {
	%>
	<h4><%="Id : " + resultSet.getString(1) + " | S Name : " + resultSet.getString(2) + " | Movie : "
		+ resultSet.getString(3) + " | length : " + resultSet.getFloat(4) + " | Singer : " + resultSet.getString(5)
		+ " |  Composer : " + resultSet.getString(6) + " | Lyrics : " + resultSet.getString(7)%></h4>


	<%
	}
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



</body>
</html>