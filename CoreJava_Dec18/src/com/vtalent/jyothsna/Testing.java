package com.vtalent.jyothsna;





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

public class Testing {

	public static void main(String[] args) {
		EmployeeBean empref=new EmployeeBean();
		empref.setEmployeeId(100);
		empref.setEmployeesalary(25000);
		System.out.println("Id="+empref.getEmployeeId());
		System.out.println("salary="+empref.getEmployeesalary());
	}

}

