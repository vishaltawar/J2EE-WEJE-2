<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Songs Insert</title>
</head>
<body>
	<form action="./SongInsertDetails.jsp">
		<table>
			<tr>
				<td>Id</td>
				<td>: <input type="text" name="id"></td>
			</tr>
			<tr>
				<td>Song Name</td>
				<td>: <input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Movie Name</td>
				<td>: <input type="text" name="movie"></td>
			</tr>
			<tr>
				<td>Length fo song</td>
				<td>: <input type="text" name="length">
				</td>
			</tr>
			<tr>
				<td>Singer Name</td>
				<td>: <input type="text" name="singer"></td>
			</tr>
			<tr>
				<td>Composer Name</td>
				<td>: <input type="text" name="composer">
				</td>
			</tr>
			<tr>
				<td>Lyrics Creater</td>
				<td>: <input type="text" name="lyrics"></td>
			</tr>

			<tr>

				<td>: <input type="submit" value="SUBMIT SONG"></td>
			</tr>

		</table>

	</form>

</body>
</html>