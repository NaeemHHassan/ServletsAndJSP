<%@page import="com.softechsol.databases.StudentDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.softechsol.student.Student"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type="text/css" rel="stylesheet" href="css/style.css">
<title>Students</title>
<script type="text/javascript">
	function deleteStudent(studentId) {
<%%>
	}
</script>
</head>
<body>
	<h1 name="h1" value="!">Showing all Students in Database</h1>

	<%
		StudentDAO stdDAO = new StudentDAO();
		ArrayList<Student> students = stdDAO.getAllStudents();
	%>

	<%
		// 		stdDAO.close();
	%>
	<table style="border-width: 5px;">
		<tr>
			<th>Student ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Contact</th>
			<th>Action</th>
		</tr>
		<%
			for (Student s : students) {
		%>
		<c:url var="tempLink" value="deleteAStudent">
			<c:param name="studentId"
				value="<%=Integer.toString(s.getStudentId())%>" />
		</c:url>
		<c:url var="updateLink" value="updateAStudent">
			<c:param name="studentId"
				value="<%=Integer.toString(s.getStudentId())%>" />
		</c:url>
		<tr>
			<td><%=s.getStudentId()%></td>
			<td><%=s.getFirstName()%></td>
			<td><%=s.getLastName()%></td>
			<td><%=s.getEmail()%></td>
			<td><%=s.getContact()%></td>
			<td><a href="${updateLink}">Update</a>|<a href="${tempLink}"
				onclick="if (!(confirm('Are you sure you want to delete this student?'))) return false">Delete</a></td>
		</tr>
		<%
			}
		%>
	</table>
	<br />
	<%
		
	%>
	<input type="button" value="Add Student"
		onclick="window.location.href='addNewStudent.jsp'; return false;"
		class="add-student-button" />

</body>
</html>