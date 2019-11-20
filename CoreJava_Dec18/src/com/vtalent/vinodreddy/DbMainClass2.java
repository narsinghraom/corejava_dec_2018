package com.vtalent.vinodreddy;

import java.util.Scanner;

public class DbMainClass2 {
	static EmployeeDetails employeedetails=new EmployeeDetails();
	static DbOperations2 dbOperation2 =new DbOperations2();
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
		
		switch(n) {
		case 1:
		System.out.println("enter employee details");
		System.out.println("enter employee id");
		employeedetails.setEmployeeId(s.nextInt());
		System.out.println("enter employee name");
		employeedetails.setEmployeeName(s.next());
		System.out.println("enter employee salary");
		employeedetails.setEmployeeSalary(s.nextDouble());
		System.out.println("enter employee mobileno");
		employeedetails.setEmployeeMobileNumber(s.nextLong());
		int result=dbOperation2.insertDataWithPreparedStatement(employeedetails);
		if(result>0) {
			System.out.println("data inserted successfully");
		}else {
			System.out.println("try again");
		}break;
		case 2:
		System.out.println("enter the name to be deleted");
		employeedetails.setEmployeeName(s.next());
		
		int result1=dbOperation2.deleteDataWithPreparedStatement(employeedetails);
		if(result1>0) {
			System.out.println("employee data deleted successfully");
		}else {
			System.out.println("delete operation was unsuccessfull");
		}break;
		case 3:
			System.out.println("enter the name to be updated");
			employeedetails.setEmployeeName(s.next());
			System.out.println("enter specific id to update name");
			employeedetails.setEmployeeId(s.nextInt());
			
			int result2=dbOperation2.updateDataWithPreparedStatement(employeedetails);
			if(result2>0) {
				System.out.println("data updated successfully");
			}else {
				System.out.println("update operation was unsuccessfull");
			}break;
			}
		}
	}
}