<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String massage = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vishal Details</title>
</head>
<body>

	<h1>
		Hello
		<%=massage%>

	</h1>


</body>
</html>