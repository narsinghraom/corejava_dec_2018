package com.vtalent.vinodreddy;

import java.util.Scanner;

public class DbMainClass {
	static DbOperations dboperations=new DbOperations();

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(;;){
			System.out.println("please select your choice:\n"+
		            "1.insert employee data.\n"+
					"2.delete employee data.\n"+
		            "3.update employee data.\n"+
					"4.search.\n"+
		            "5.exit.");
		int n=s.nextInt();
		EmployeeDetails employeedetails=new EmployeeDetails();
		switch(n) {
		case 1:
			System.out.println("enter employee details");
			System.out.println("enter employeeid");
			employeedetails.setEmployeeId(s.nextInt());
			System.out.println("enter employee name");
			employeedetails.setEmployeeName(s.next());
			System.out.println("enter employee salary");
			employeedetails.setEmployeeSalary(s.nextDouble());
			System.out.println("enter employee mobileno");
		    employeedetails.setEmployeeMobileNumber(s.nextLong());
		    int result=dboperations.insertDataWithStatement(employeedetails);
		    if(result>0) {
		    	System.out.println("employee data inserted successfully");
		    	}else {
		    		System.out.println("operation failed please try again");
		    		}break;
		case 2:
			System.out.println("enter the employee name to be deleted");
			employeedetails.setEmployeeName(s.next());
		
			int result1=dboperations.deleteDataWithStatement(employeedetails);
			if(result1>0) {
				System.out.println("employee data deleted successfully");
				}else {
					System.out.println("delete was unsuccessfull");
					}break;
		case 3:
			System.out.println("enter the name to be updated");
			employeedetails.setEmployeeName(s.next());
			System.out.println("enter specific id to update name");
			employeedetails.setEmployeeId(s.nextInt());
		
			int result2=dboperations.updateDataWithStatement(employeedetails);
			if(result2>0) {
				System.out.println("employee data updated successfully");
			}else {
				System.out.println("update was unsuccessfull");
			}break;
		case 4:
			System.out.println("enter value to be searched");
			employeedetails.setEmployeeId(s.nextInt());
			employeedetails.setEmployeeName(s.next());
			employeedetails.setEmployeeSalary(s.nextDouble());
			employeedetails.setEmployeeMobileNumber(s.nextLong());
	
			int result3=dboperations.searchDataWithStatement(employeedetails);
			if(result3>0) {
				System.out.println("value found");
			}else {
				System.out.println("value not found");
			}break;
			
			
		}
}
	}
}
