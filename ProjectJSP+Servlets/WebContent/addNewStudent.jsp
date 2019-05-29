<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Student</title>
</head>
<body>
	<form action="saveStudentToDatabase" method="post">
		<table>
			<tr>
				<td>Enter ID</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>Enter FirstName</td>
				<td><input type="text" name="firstName" /></td>
			</tr>
			<tr>
				<td>Enter Last Name</td>
				<td><input type="text" name="lastName" /></td>
			</tr>
			<tr>
				<td>Enter Email</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Enter Contact</td>
				<td><input type="text" name="contact" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save" /></td>
				<td><input type="button" value="Home"
					onclick="window.location.href='home.jsp'; return false;" /></td>
			</tr>
			<tr>
			</tr>
		</table>
	</form>
</body>
</html>