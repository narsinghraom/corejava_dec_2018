package com.vtalent.saichand;

@SuppressWarnings("serial")
public class EmployeeCustomException extends Exception {

	public String toString() {
		return "You are Not Eligible for Loans  Because your Salary is low";
	}
}