<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Management</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}
/*
body {
	width: 100%;
	height: 100vh;
	background:
		url(https://images.pexels.com/photos/267586/pexels-photo-267586.jpeg)
		no-repeat center center/cover;;
}
*/
nav {
	border: 1px solid;
	padding: 10px;
	min-width: 700px;
	box-shadow: 12px 10px 15px;
	height: auto;
	    background: linear-gradient(rgb(14 21 11), rgb(84 225 240 / 41%));
	display: flex;
	justify-content: space-between;
}

.logo {
	/*border: 1px solid;*/
	padding: 5px 0px 0px 35px;
	min-width: 250px;
	color: white;
	cursor: pointer;
}

.logo:hover {
	color: #00ff56;
	transform:scale(1.1,1.5);
}

ul {
	/*border: 1px solid;*/
	display: flex;
	padding: 10px;
}

ul li {
	/*border: 1px solid  red;*/
	margin: 0 5px;
	list-style: none;
}

ul li:hover {
	transform:scale(1.1,1.5);
	box-shadow:5px 5px 5px black;
	border-radius: 50%;
}

ul li a:hover {
	
	border-radius: 5px;
}

ul li a {
	/* border: 1px solid;*/
	color: white;
	text-decoration: none;
	padding: 5px 10px;
	font-size: 25px;
}

#logout {
	background-color: red;
	font-size: 25px;
	font-weight: bolder;
	height: 35px;
	border-radius: 5px;
}
</style>
</head>
<body>
	<nav>
		<div class="logo">
			<h2>Product Management</h2>
		</div>
		<ul>
			<li><a href="./home">Home</a></li>
			<li><a href="./add">Add</a></li>
			<li><a href="./search">Search</a></li>
			<li><a href="./remove">Remove</a></li>
			<li><a href="./update">Update</a></li>
			<li id="logout"><a href="./logout">Logout</a></li>
		</ul>
	</nav>
</body>
</html>