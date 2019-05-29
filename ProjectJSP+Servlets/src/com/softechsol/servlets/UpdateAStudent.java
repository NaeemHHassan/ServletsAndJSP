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
 * Servlet implementation class UpdateAStudent
 */
@WebServlet("/updateAStudent")
public class UpdateAStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer id = Integer.parseInt(request.getParameter("studentId"));
		StudentDAO dao = new StudentDAO();
		Student student = dao.getStudent(id);
		request.setAttribute("student", student);
		RequestDispatcher rd = request.getRequestDispatcher("updateStudentForm.jsp");
		rd.forward(request, response);
		System.out.println("Forwared");
	}

}
