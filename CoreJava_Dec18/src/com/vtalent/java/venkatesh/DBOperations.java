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
		int result=0;
		String query="delete from Employee_table where employeeName='"+employee.getEmployeeName()+"'";
		try {
			statement=connection.createStatement();
			result=statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		EmployeeBean2 employee=new EmployeeBean2();
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
		}
		System.out.println("enter the employee name to be deleted");
		employee.setEmployeeName(s.next());
		DBOperations dboperations1=new DBOperations();
		int result1=dboperations1.deleteDataWithStatement(employee);
		if(result1>0) {
			System.out.println("employee data deleted successfully");
		}else {
			System.out.println("delete was unsuccessfull");
		}
		}
}
