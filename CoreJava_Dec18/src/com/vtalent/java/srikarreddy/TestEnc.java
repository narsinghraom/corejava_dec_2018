package com.vtalent.java.srikarreddy;

class EmployeeBean  {
	private int employeeId; 
	private double employeeSalary;  
 
public void setEmployeeId (int employeeId  )   {
	this.employeeId =employeeId;  
}
public void setEmployeeSalary (double employeeSalary ) {
	this.employeeSalary  =employeeSalary;   
}   
public int getEmployeeId()     {
	return this.employeeId; 
}
public double getEmployeeSalary()     {
	return this.employeeSalary; 
}
}
 class TestEnc{
	 public static void main(String[] args) {
		EmployeeBean r=new EmployeeBean();
		r.setEmployeeId(100);
		r.setEmployeeSalary(25000.00);
		System.out.println("Id="+r.getEmployeeId());
		System.out.println("Salary="+r.getEmployeeSalary());
	}
 }
 
 
		
	 
 
 

 
