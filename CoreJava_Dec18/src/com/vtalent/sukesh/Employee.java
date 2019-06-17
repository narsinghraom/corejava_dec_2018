package com.vtalent.sukesh;

import java.io.Serializable;

public class Employee implements Serializable {
	private int EmployeeID;
	private String EmployeeName;
	private String MobileNumber;
	private double EmployeePackage;
	private double EmployeeSalary;
	private double EmployeePF;
	private float LoanAmount;
	private float EMI;
	private float Year;
	private float Interest;
	private String StartingDate;
	private String EndDate;

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public void setMobileNumber(String mobileNumber) {
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

	public void setLoanAmount(float loanAmount) {
		LoanAmount = loanAmount;
	}

	public void setEMI(float eMI) {
		EMI = eMI;
	}

	public void setYear(float t) {
		Year = t;
	}

	public void setInterest(float interest) {
		Interest = interest;
	}

	public void setStartingDate(String startingDate) {
		StartingDate = startingDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public String getMobileNumber() {
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

	public float getLoanAmount() {
		return LoanAmount;
	}

	public float getEMI() {
		return EMI;
	}

	public float getYear() {
		return Year;
	}

	public float getInterest() {
		return Interest;
	}

	public String getStartingDate() {
		return StartingDate;
	}

	public String getEndDate() {
		return EndDate;
	}

}
