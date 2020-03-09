package com.vtalent.corejava.nageswararao;

import java.util.Scanner;

public class EmployeeBean {
	int i,n;
	Employee[] emp;
	Scanner input=new Scanner(System.in);
	
	public void createEmployee() {
		System.out.println("Enter Number of employees to be Created ");
		n=input.nextInt();
		emp = new Employee[n];
		Employee empBean1 = null;
		for(i=0;i<=emp.length-1;i++) {
			empBean1 = new Employee();
		System.out.println("Enter Employee Id ");
		empBean1.setEmployeeId(input.nextInt());
		System.out.println("Enter Employee Mobile Number ");
		empBean1.setEmployeeMobileNumber(input.nextLong());
		System.out.println("Enter Employee Salary ");
		empBean1.setEmployeeSalary(input.nextDouble());
		emp[i] = empBean1;
		System.out.println("Employee Successfully Created");
		}
	}
		
	
	public void deleteEmployee() {
		System.out.println("Enter Employee Id To Be Deleted ");
		int id2=input.nextInt();
		for(i=0;i<emp.length;i++) {
			Employee empBean2=emp[i];
		if(null!=empBean2&&id2==emp[i].getEmployeeId()) {
			for(int j=i;j<emp.length;j++) {
				emp[j]=emp[j-1];
				System.out.println("Employee Successfully Deleted");
			}
		}
		}
	}
	
	public void updateEmployee() {
		for(i=0;i<=emp.length-1;i++) {
		System.out.println(emp[i].getEmployeeId());
		}
		System.out.println("Enter Employee Id You Want To Update");
		int id=input.nextInt();
		for(i=0;i<=emp.length-1;i++) {
			Employee empBean3=emp[i];
		if(null!=empBean3&&id==emp[i].getEmployeeId()) {
		System.out.println("Enter Employee Mobile Number To Be Updated ");
		empBean3.setEmployeeMobileNumber(input.nextLong());
		System.out.println("Enter Employee Salary To Be Updated");
		empBean3.setEmployeeSalary(input.nextDouble());
		}
		else {
		System.out.println("Entered Employee Id is Incorrect");
	}}
	}
	
	public void searchEmployee() {
		int id1;
		System.out.println("Enter Employee Id You Want To Search");
		id1=input.nextInt();
		
		for(i=0;i<=emp.length-1;i++) {
			Employee empBean=emp[i];
		if(null!=empBean&&id1==emp[i].getEmployeeId()) {
			System.out.println("Employee Mobile Number "+empBean.getEmployeeMobileNumber());
			System.out.println("Employee Salary "+empBean.getEmployeeSalary());
		} 
		while(null!=empBean&&id1!=emp[i].getEmployeeId()) {
			System.out.println("Entered Employee Id is Incorrect");
		}}
	}
	public void selectAllEmployees() {
		for(i=0;i<=emp.length-1;i++) {
			System.out.println("Employee Id is "+emp[i].getEmployeeId());
			System.out.println("Employee Mobile Number is "+emp[i].getEmployeeMobileNumber());
			System.out.println("Employee Salary is "+emp[i].getEmployeeSalary());
		}
	}
}
