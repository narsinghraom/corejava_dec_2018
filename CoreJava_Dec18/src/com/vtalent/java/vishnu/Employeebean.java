package com.vtalent.java.vishnu;
/*Encapsulation method..
 binding the private variables in public  sectors and setters and getter method.
 */


public class Employeebean {
	public static void main(String[] args) {
		test t=new test();
		t.setEmployeeId(102);
		t.setEmployeeSalary(230000);
		System.out.println(t.getEmployeeId());
		System.out.println(t.getEmployeeSalary());
	}
}
class test{
	private int employeeId;
	private double employeeSalary;
	
public void setEmployeeId(int employeeId){
		this.employeeId=employeeId;
	}
public void setEmployeeSalary(double employeeSalary){
	this.employeeSalary=employeeSalary;
    }
	public int getEmployeeId(){
	return this.employeeId;
}
	public double getEmployeeSalary(){
	return this.employeeSalary;
}	
	
		
}

