package com.vtalent.mohammad;

class EmployeeBean{
	private int employeeId;
	private double employeesalary;
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
	
}

public class Encapsulation {

	public static void main(String[] args) {
		EmployeeBean emp=new EmployeeBean();
		emp.setEmployeeId(100);
		emp.setEmployeesalary(25000);
		System.out.println("Id : "+emp.getEmployeeId());
		System.out.println("salary: "+emp.getEmployeesalary());
	}

}
