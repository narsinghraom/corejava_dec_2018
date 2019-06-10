package com.vtalent.sukesh;

import java.io.Serializable;

public class Employee implements Serializable {
	private int EmployeeID;
	private String EmployeeName;
	private int MobileNumber;
	private double EmployeePackage;
	private double EmployeeSalary;
	private double EmployeePF;

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public void setMobileNumber(int mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public void setEmployeePackage(double employeePackage) {
		EmployeePackage = employeePackage;
	}

	public void setEmployeeSalary(double employeeSalary) {
		EmployeeSalary = employeeSalary;
	}

	public void setEmployeePF(double employeePF) {
		EmployeePF = employeePF;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public int getMobileNumber() {
		return MobileNumber;
	}

	public double getEmployeePackage() {
		return EmployeePackage;
	}

	public double getEmployeeSalary() {
		return EmployeeSalary;
	}

	public double getEmployeePF() {
		return EmployeePF;
	}

}
