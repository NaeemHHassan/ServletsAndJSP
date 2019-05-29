package com.softechsol.databases;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.softechsol.student.Student;

public class StudentDAO {

	private Connection con;
	private Statement st;

	public StudentDAO() {
		connectToDb();
	}

	private void connectToDb() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "admin");
			st = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			if (con != null)
				con.close();
			if (st != null)
				st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Student> getAllStudents() {
		ArrayList<Student> students = null;
		try (ResultSet rs = st.executeQuery("select * from student_tb");) {
			students = new ArrayList<Student>();
			while (rs.next()) {
				students.add(
						new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}

	public void deleteStudent(Integer id) {
		try {
			st.executeUpdate("delete from student_tb where studentid=" + id);
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Student getStudent(Integer id) {
		String sql = "select * from student_tb where studentid=" + id;
		ResultSet rs = null;
		try {
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String firstName = null;
		String lastName = null;
		String email = null;
		String contact = null;
		try {
			while (rs.next()) {
				firstName = rs.getString(2);
				lastName = rs.getString(3);
				email = rs.getString(4);
				contact = rs.getString(5);
			}
			Student st = new Student(id, firstName, lastName, email, contact);
			return st;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void saveStudentToDatabase(Student std) {
		try {
			String sql = "insert into student_tb values (" + std + ");";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
