package com.vtalent.prashanth;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBOperations {
	Connection connection;
	Statement statement;
	
	public DBOperations() {
		connection = MySQLConnection.getInstance();
	}
	
	public int insertDataWithStatement(EmployeeBean2 employee) {
		int result = 0;
		String query = "insert into Employee_table values("+employee.getEmployeeId()+",'"+employee.getEmployeeName()+"',"+employee.getEmployeeSalary()+","+employee.getEmployeeMobileNo()+")";
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int deleteDataWithStatement(EmployeeBean2 employee) {
		int result1 = 0;
		String query = "delete from Employee_table where employeeName='"+employee.getEmployeeName()+"'";
		try {
			statement = connection.createStatement();
			result1 = statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeBean2 employee = new EmployeeBean2();
		System.out.println("Enter the Employee Details: ");
		System.out.println("Enter Employee Id: ");
		employee.setEmployeeId(sc.nextInt());
		System.out.println("Enter Employee Name: ");
		employee.setEmployeeName(sc.next());
		System.out.println("Enter Employee Salary: ");
		employee.setEmployeeSalary(sc.nextDouble());
		System.out.println("Enter Mobile Number: ");
		employee.setEmployeeMobileNo(sc.nextLong());
		
		DBOperations dbOperations = new DBOperations();
		int result = dbOperations.insertDataWithStatement(employee);
		if(result > 0) {
			System.out.println("Employee Data Inserted Successfully.");
		}else {
			System.out.println("Operation Failed, Please Try Again.");
		}
		
		System.out.println("Enter Employee Name to Delete: ");
		employee.setEmployeeName(sc.next());
		DBOperations dbOperations1 = new DBOperations();
		int result1 = dbOperations1.deleteDataWithStatement(employee);
		if(result1>0) {
			System.out.println("Employee Data Deleted successfully.");
		}else {
			System.out.println("Operation Failed, Please Try Again.");
		}
	}
}
