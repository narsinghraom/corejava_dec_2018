package com.vtalent.java.venkatesh;
 class EmployeeBean {
private int employeeId;
private double employeeSalary;
public void setEmployeeId(int employeeId) {
	this.employeeId=employeeId;
}
public void setEmployeeSalary(double employeeSalary) {
	this.employeeSalary=employeeSalary;
}
public int getEmployeeId() {
	return this.employeeId;
}
public double getEmployeeSalary() {
	return this.employeeSalary;
}
}
class Test1{
	public static void main(String[] args) {
		EmployeeBean empref=new EmployeeBean();
		empref.setEmployeeId(100);
		empref.setEmployeeSalary(25000);
		System.out.println("Id="+empref.getEmployeeId());
		System.out.println("salary="+empref.getEmployeeSalary());
	}
}


