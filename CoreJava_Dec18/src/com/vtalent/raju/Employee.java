package com.vtalent.raju;

public class Employee {
	private int employeeID;
	private String employname;

	private double employeeSalary;
	private double employpackage;
	private double employsalary;
	private double employpf;
	

	public void setEmployeeId(int employeeId) {
		this.employeeID = employeeId;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	public int getEmployeeId() {
		return employeeID;
	}
	
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployname(String employname) {
		this.employname=employname;
	}
	
	public void setEmployPackage(double employpackage) {
		this.employpackage=employpackage;
		
	}
	public double getEmployPackage() {
		return employpackage;
	}
	
	public String getEmployname() {
		return employname;
	}
	
	public double employSalary() {
		double a=employpackage/12;	//calculating monthly salary
		employpf =(a*2)/100;	// calculating pf
		employsalary=a-employpf;
		return employsalary;
		//System.out.print("Monthly Salary- "+employsalary+"  "+" Provident Fund(2%)- "+employpf);
	}
	public double employpf() {
		return employpf;
	}
}
	




