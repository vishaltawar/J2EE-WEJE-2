<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo 2</title>
</head>
<body>
<h1>This Demo Page 2</h1>
<%List list=new ArrayList(); %>
	<%
	list.add(1); 
	list.add(2); 
	list.add(3); 
	list.add(4); 
	list.add(5); 
	%>
	
	<%for(int i=0;i<list.size();i++){ %>
		<h1><%=list.get(i) %></h1>
<%} %>

</body>
</html>