package com.vtalent.shiva;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBOperation {
	Connection connection;
	Statement statement;
	
	public DBOperation() {
		connection = MySQLConnection.getInstance();
	}
	
	public int insertDataWithStatement(EmployeeBean2 employee) {
		int result = 0;
		String query = "insert into Employee_table values("+employee.getEmployeeId()+",'"+employee.getEmployeeName()+"',"+employee.getEmployeeSalary()+","+employee.getEmployeeMobileNo()+")";
		try {
			statement = connection.createStatement();
			result =statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;		
	}
	
	public int deleteDataWithStatement(EmployeeBean2 employee) {
		int result1=0;
		String query = "delete from employee_table where employeeName='"+employee.getEmployeeName()+"'";
		try {
			statement = connection.createStatement();
			result1=statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		EmployeeBean2 employee = new EmployeeBean2();
		System.out.println("Enter the employee details: ");
		System.out.println("Enter Employee Id: ");
		employee.setEmployeeId(sc.nextInt());
		System.out.println("Enter Employee Name: ");
		employee.setEmployeeName(sc.next());
		System.out.println("Enter Employee Salary: ");
		employee.setEmployeeSalary(sc.nextDouble());
		System.out.println("Enter Employee MobileNo: ");
		employee.setEmployeeMobileNo(sc.nextLong());
		
		DBOperation dbOperation=new DBOperation();
		int result = dbOperation.insertDataWithStatement(employee);
		if(result>0) {
			System.out.println("Employee data has been inserted successfully");
			
		}else {
			System.out.println("Employee data insertion unsuccessfull");
			
		}
		
		System.out.println("Enter the Employee Name to be Delete: ");
		employee.setEmployeeName(sc.next());
		DBOperation dbOperation1 = new DBOperation();
		int result1 = dbOperation1.deleteDataWithStatement(employee);
		if(result>0) {
			System.out.println("Employee data has been Deleted successfully");
			
		}else {
			System.out.println("Employee data Deletion unsuccessfull");
			
		}
		
		
	}

}
