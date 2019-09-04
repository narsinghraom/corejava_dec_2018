package com.vtalent.java.mahesh;
public class EmployeeBean {
	private int employeeId;
	private double employeeSalary;
	public void SetEmployeeId(int employeeId){
		this.employeeId=employeeId;
	}
	public void SetEmployeeSalary(double employeeSalary){
		this.employeeSalary=employeeSalary;
	}
	public int getEmployeeId(){
		return this.employeeId;
	}
	public double getEmployeeSalary(){
		return this.employeeSalary;
	}
	}
	class test{
		public static void main(String args[]){
			EmployeeBean empref=new EmployeeBean();
			empref.SetEmployeeId(100);
			empref.SetEmployeeSalary(25000);
			System.out.println("Id="+empref.getEmployeeId());
			System.out.println("Salary="+empref.getEmployeeSalary());
		}
}
