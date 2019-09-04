package com.vtalent.varshini;
class EmpoyeeBean{
	private int employeeId;
	private double employeeSalary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
}

public class Test {

	public static void main(String[] args) {
		EmpoyeeBean empRef=new EmpoyeeBean();
		empRef.setEmployeeId(100);
		empRef.setEmployeeSalary(25000);
		System.out.println("id=" +empRef.getEmployeeId());
		System.out.println("salary=" +empRef.getEmployeeSalary());
		// TODO Auto-generated method stub

	}

}
