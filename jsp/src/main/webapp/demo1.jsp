<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%response.sendRedirect("https://www.google.co.in"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo 1</title>
</head>
<body>
<h1>This is Demo Page 1</h1>
	<%!int a = 15;%>
	<%!int b = 5;%>
	<%!int c = 0;%>
	<%c = a + b;%>
	<h1><%= c %></h1>

</body>
</html>