package com.vtalent.java.naveen;

import java.io.Serializable;

public class EmployeeBeanP implements Serializable{
	private String  employeeename;
	private int employeeId;
	private double employeesalary;
	private long employeemobileno;

	public String getEmployeeename() {
	return employeeename;
}

public void setEmployeeename(String employeeename) {
	this.employeeename = employeeename;
}
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getEmployeesalary() {
		return employeesalary;
	}

	public void setEmployeesalary(double employeesalary) {
		this.employeesalary = employeesalary;
	}

	public long getEmployeemobileno() {
		return employeemobileno;
	}

	public void setEmployeemobileno(long employeemobileno) {
		this.employeemobileno = employeemobileno;
	}

	@Override
	public String toString() {
		return "EmployeeBeanP [employeeename=" + employeeename + ", employeeId=" + employeeId + ", employeesalary="
				+ employeesalary + ", employeemobileno=" + employeemobileno + "]";
	}

	



}
