package com.vtalent.mallikarjun.basics;

public class EmpArrayList {
	int empId;
	String empName;
	double empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "EmpArrayList [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
}
