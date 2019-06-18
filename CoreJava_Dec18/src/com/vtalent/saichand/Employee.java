package com.vtalent.saichand;

public class Employee {
	private int EmployeeID;
	private double EmployeeSalary;
	private char EmployeeName;

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public void setEmployeeSalary(double employeeSalary) {
		EmployeeSalary = employeeSalary;
	}

	public void setEmployeeName(char employeeName) {
		EmployeeName = employeeName;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public double getEmployeeSalary() {
		return EmployeeSalary;
	}

	public int getEmployeeName() {
		return EmployeeID;
	}
}
