package com.softechsol.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softechsol.databases.StudentDAO;
import com.softechsol.student.Student;

/**
 * Servlet implementation class UpdateStudentToDatabase
 */
@WebServlet("/updateStudentToDatabase")
public class UpdateStudentToDatabase extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer id = Integer.parseInt(request.getParameter("id"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		StudentDAO stdDAO = new StudentDAO();
		stdDAO.deleteStudent(id);
		stdDAO.saveStudentToDatabase(new Student(id, firstName, lastName, email, contact));
		stdDAO.close();

		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);

	}

}
