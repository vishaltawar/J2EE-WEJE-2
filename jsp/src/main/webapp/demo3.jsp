<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Domo 3</title>
</head>
<body style="background-color: #555555">
	<%!
	public static int addition(int num1, int num2) {
		return num1 + num2;
	}
	public static int addition(int num1, int num2,int num3) {
		return num1 + num2 + num3;
	}

	public int multioplication(int num1, int num2) {
		return num1 * num2;
	}
	public int multioplication(int num1, int num2,int num3) {
		return num1 * num2 * num3;
	}
	%>

	<h1 style="background-color: yellow">Multiplication is :<%= multioplication(5,3)%></h1>
	<h3 style="background-color: pink">Addition is :<%= addition(5,3) %></h3>

	<h1 style="background-color: yellow">Multiplication is :<%= multioplication(5,3,2)%></h1>
	<h3 style="background-color: pink">Addition is :<%= addition(5,3,2) %></h3>
	


</body>
</html>