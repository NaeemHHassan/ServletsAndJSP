package com.softechsol.student;

import org.apache.taglibs.standard.lang.jstl.test.StaticFunctionTests;

public class Student {
	public Integer studentId;
	public String firstName;
	public String lastName;
	public String email;
	public String contact;

	public Student(Integer studentId, String firstName, String lastName, String email, String contact) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "" + studentId + ",'" + firstName + "','" + lastName + "','" + email + "','" + contact + "'";
	}

}
