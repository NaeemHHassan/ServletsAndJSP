<%@page import="com.softechsol.student.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
	<form action="updateStudentToDatabase" method="post">
		<%
			Student st = (Student) request.getAttribute("student");
		%>
		<table>

			<tr>
				<td>Enter ID</td>
				<td><input type="text" name="id" value=<%=st.getStudentId()%> /></td>
			</tr>
			<tr>
				<td>Enter FirstName</td>
				<td><input type="text" name="firstName"
					value=<%=st.getFirstName()%> /></td>
			</tr>
			<tr>
				<td>Enter Last Name</td>
				<td><input type="text" name="lastName"
					value=<%=st.getLastName()%> /></td>
			</tr>
			<tr>
				<td>Enter Email</td>
				<td><input type="text" name="email" value=<%=st.getEmail()%> /></td>
			</tr>
			<tr>
				<td>Enter Contact</td>
				<td><input type="text" name="contact"
					value=<%=st.getContact()%> /></td>
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