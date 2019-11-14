package com.vtalent.laxmisomi;

import java.util.*;

 class EmployeeTask {
	
private	int employeeId;
private	double employeeSalary;
private long employeeMobileNo;
static EmployeeTask[] empArray = new EmployeeTask[2];
static Scanner sc = new Scanner(System.in);

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
public long getEmployeeMobileNo() {
	return employeeMobileNo;
}
public void setEmployeeMobileNo(long employeeMobileNo) {
	this.employeeMobileNo = employeeMobileNo;
}

 
 
public void insertData() {
	
		System.out.println("Please enter no of employees to insert in to Array: ");
		int z = sc.nextInt();
		
		EmployeeTask employee = null;
		if(null!=employee && empArray !=null) {
		for(int i=0;i<empArray.length;i++) {
			if(empArray[i]== null) {
				empArray[i]=employee;
				
				
			}
		}
		}
}
 }

		class Test{
			public static void main(String [] args) {
				Employee emp=new Employee();
				emp.setEmployeeId(100);
				emp.setEmployeeSalary(2500);
				int k=EmployeeTask.insertData(Employee employee);
				{
				if(k==1) {
					System.out.println("insertion done");
				}
				else {
					System.out.println("Data size full");
				}
			}
		}
}
				
			
				
			
		
		
	
	
	