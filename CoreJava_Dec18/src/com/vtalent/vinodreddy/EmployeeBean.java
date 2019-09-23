package com.vtalent.vinodreddy;

import java.util.*;

import com.vtalent.venkatesh.Employee;

public class EmployeeBean {
	private	int employeeId;
	private	double employeeSalary;
	private long employeeMobileNo;
	static EmployeeBean [] emparray;
	static Scanner s = new Scanner(System.in);
	
 	public void setEmployyeId(int employeeId) {
		this.employeeId=employeeId;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary=employeeSalary;
	}
	public void setEmployyeMobileNo(long employeeMobileNo) {
		this.employeeMobileNo=employeeMobileNo;
	}
	public int getEmployeeId() {
		return this.employeeId;
		
	}
	public double getEmployeeSalary() {
		return this.employeeSalary;
		
	}
	public long getEmployeeMobileNo() {
		return this.employeeMobileNo;
		
	}

	public void insert() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no.of Employees to be stored");
		int size=s.nextInt();
		emparray=new EmployeeBean[size];


		for(int i = 0;i<size;i++) {
			EmployeeBean em =new EmployeeBean();
			
			System.out.println("enter the EmployeeId");
			int id =s.nextInt();
			em.setEmployyeId(id);
			System.out.println("enter the EmployeeSalary");
			double sl =s.nextDouble();
			em.setEmployeeSalary(sl);
			System.out.println("enter the EmployeeMobileNumber");
			long mno =s.nextLong();
			em.setEmployyeMobileNo(mno);
			emparray[i]=em;
			
			
		}
		for(int i =0;i<size;i++) {
			
			  EmployeeBean em1 =emparray[i];
			  System.out.println("id="+em1.getEmployeeId()+"  "+"Salary="+em1.getEmployeeSalary()+"  "+"MobileNumber="+em1.getEmployeeMobileNo());
		}
	}

	public void delete() {
		// TODO Auto-generated method stub
		EmployeeBean em2;
		for(int i =0;i<emparray.length;i++) {
			em2 = emparray[i];
			System.out.println(em2.getEmployeeId());
		}
		System.out.println("enter the id to be deleted");
		int n =s.nextInt();	
		for(int i=0;i<=emparray.length-1;i++) {
			 em2=emparray[i];
			 	if(n==em2.getEmployeeId()) {
			 		emparray[i]=null;
			 		System.out.println("Deleted");
			 	}
		}
	    

		
	}

	
	

	

	public void search() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		EmployeeBean em3;
		System.out.println("enter the id to be search");
		     int n =s.nextInt();
		    
				for(int i=0;i<emparray.length;i++) {
			    em3 =emparray[i];
				if(em3.employeeId==n) {
					System.out.println("id="+em3.getEmployeeId()+" "+"Salary="+em3.getEmployeeSalary()+"  "+"MobileNumber="+em3.getEmployeeMobileNo());
					System.out.println("the employee details successfully found");
					return;
				}
				else {
					System.out.println("the given Id is not matched");
				}
			}
				

	}

	public void pritntAllData() {
		// TODO Auto-generated method stub
		EmployeeBean em4;
		System.out.println("The All the Employee details are");
		for(int i=0;i<emparray.length;i++) {
		 em4=emparray[i];
		
		System.out.println("id="+em4.getEmployeeId()+" "+"Salary="+em4.getEmployeeSalary()+"  "+"MobileNumber="+em4.getEmployeeMobileNo());
		
	}
	}

	
}
