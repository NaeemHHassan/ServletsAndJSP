package com.softechsol.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softechsol.databases.StudentDAO;

/**
 * Servlet implementation class DeleteAStudent
 */
@WebServlet("/deleteAStudent")
public class DeleteAStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig conf) throws ServletException {
		super.init();
		System.out.println("initialized");
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		StudentDAO dao = new StudentDAO();
		dao.deleteStudent(Integer.parseInt(req.getParameter("studentId")));
		dao.close();
		RequestDispatcher rd = req.getRequestDispatcher("/home.jsp");
		try {
			rd.forward(req, res);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
