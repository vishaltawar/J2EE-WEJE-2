<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<jsp:include page="Navbar.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Login</title>

<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	background: linear-gradient(rgba(62, 58, 57, 0.5), rgba(27, 29, 29, 0.5)),
		url(https://images.unsplash.com/photo-1432821596592-e2c18b78144f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8bG9naW58ZW58MHx8MHx8&w=1000&q=80)
		no-repeat;
	background-size: 100% 100%;
	width: 100%;
	height: 75vh;
}

#main {
	background: linear-gradient(rgba(15, 16, 16, 0.655),
		rgba(15, 16, 16, 0.455));
	margin: 150px auto;
	width: 30%;
	height: auto;
	padding: 50px;
	border-radius: 10px;
}

#headtext {
	color: white;
	padding: 10px 0 20px 0;
	text-align: center;
	font-size: 25px;
	font-family: Verdana, Geneva, Tahoma, sans-serif;
}

table {
	margin: 0 auto;
}

table tr td input {
	color: white;
	height: 40px;
	width: 100%;
	margin: 5px;
	border-radius: 5px;
	padding: 10px;
	background: none;
	outline: none;
	border: none;
	border-bottom: 2px solid rgb(198, 242, 0);
}

#main #login {
	border: none;
	background-color: rgba(11, 102, 248, 0.705);
	margin-top: 30px;
}
#main #reset {
	border: none;
	background-color: rgb(151 213 21 / 93%);
	margin-top: 30px;
}
</style>
</head>

<body>
	<div id="main">
		<h3 id="headtext">Student Login</h3>
		<form action="./AdminLoginDB.jsp" method="post">
			<table>
				<tr>
					<td><input type="text" placeholder="Enter the Username"
						name="username"></td>
				</tr>
				<tr>
					<td><input type="password" placeholder="Enter the Password"
						name="password"></td>
				</tr>
				<tr>
					<td><input id="login" type="submit" value="Login "></td>
					<!-- <td><input id="reset" type="reset" value="Reset "></td> -->
				</tr>
			</table>
		</form>
	</div>

</body>
</html>