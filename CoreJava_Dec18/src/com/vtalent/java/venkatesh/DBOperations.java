package com.vtalent.java.venkatesh;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBOperations {
	Connection connection;
	Statement statement;
	public DBOperations() {
		connection = MySQLConnections.getInstance();
	}
	public int insertDataWithStatement(EmployeeBean2 employee) {
		int result=0;
		String query="insert into Employee_table values("+employee.getEmployeeId()+",'"+employee.getEmployeeName()+"',"+employee.getEmployeeSalary()+","+employee.getEmployeeMobileno()+")";
		try {
			statement=connection.createStatement();
			result=statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	public int deleteDataWithStatement(EmployeeBean2 employee) {
		int result1=0;
		String query="delete from Employee_table where employeeName='"+employee.getEmployeeName()+"'";
		try {
			statement=connection.createStatement();
			result1=statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result1;
		
	}
	public int updateDataWithStatement(EmployeeBean2 employee) {
		int result2=0;
		String query="update employee_table set employeeName='"+employee.getEmployeeName()+"' where employeeId="+employee.getEmployeeId();
	    try {
			statement=connection.createStatement();
			result2=statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		return result2;
		
	}
	public int searchDataWithStatement(EmployeeBean2 employee) {
		int result3=0;
		String query="select employeeName='"+employee.getEmployeeName()+"' from employee_table where employeeId="+employee.getEmployeeId();
		try {
			statement=connection.createStatement();
			result3=statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result3;
		
	}
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
		EmployeeBean2 employee=new EmployeeBean2();
		switch(n) {
		case 1:
			System.out.println("enter employee details");
			System.out.println("enter employeeid");
			employee.setEmployeeId(s.nextInt());
			System.out.println("enter employee name");
			employee.setEmployeeName(s.next());
			System.out.println("enter employee salary");
			employee.setEmployeeSalary(s.nextDouble());
			System.out.println("enter employee mobileno");
		    employee.setEmployeeMobileno(s.nextLong());
		    DBOperations dboperations=new DBOperations();
		    int result=dboperations.insertDataWithStatement(employee);
		    if(result>0) {
		    	System.out.println("employee data inserted successfully");
		    	}else {
		    		System.out.println("operation failed please try again");
		    		}break;
		case 2:
			System.out.println("enter the employee name to be deleted");
			employee.setEmployeeName(s.next());
			DBOperations dboperations1=new DBOperations();
			int result1=dboperations1.deleteDataWithStatement(employee);
			if(result1>0) {
				System.out.println("employee data deleted successfully");
				}else {
					System.out.println("delete was unsuccessfull");
					}break;
		case 3:
			System.out.println("enter the name to be updated");
			employee.setEmployeeName(s.next());
			System.out.println("enter specific id to update name");
			employee.setEmployeeId(s.nextInt());
			DBOperations dboperations2=new DBOperations();
			int result2=dboperations2.updateDataWithStatement(employee);
			if(result2>0) {
				System.out.println("employee data updated successfully");
			}else {
				System.out.println("update was unsuccessfull");
			}break;
		case 4:
			System.out.println("enter value to be searched");
			employee.setEmployeeId(s.nextInt());
			employee.setEmployeeName(s.next());
			employee.setEmployeeSalary(s.nextDouble());
			employee.setEmployeeMobileno(s.nextLong());
			DBOperations dboperations3=new DBOperations();
			int result3=dboperations3.searchDataWithStatement(employee);
			if(result3>0) {
				System.out.println("value found");
			}else {
				System.out.println("value not found");
			}break;
			
			
		}
}
	}
}
