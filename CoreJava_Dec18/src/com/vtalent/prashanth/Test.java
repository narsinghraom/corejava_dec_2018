package com.vtalent.prashanth;

class EmployeeBean {
	private int employeeId;
	private double employeeSalary;
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeId() {
		return this.employeeId;
	}
	public double getEmployeeSalary() {
		return this.employeeSalary;
	}
}

public class Test {

	public static void main(String[] args) {
		EmployeeBean empRef = new EmployeeBean();
		empRef.setEmployeeId(100);
		empRef.setEmployeeSalary(25000.00);
		System.out.println("Id = " + empRef.getEmployeeId());
		System.out.println("Salary = " + empRef.getEmployeeSalary());

	}

}
