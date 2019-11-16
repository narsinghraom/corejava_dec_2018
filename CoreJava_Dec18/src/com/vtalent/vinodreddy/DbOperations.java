package com.vtalent.vinodreddy;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbOperations {
	Connection connection;
	Statement statement;
	public DbOperations() {
		connection = MySQLConnection.getInstance();
	}
	public int insertDataWithStatement(EmployeeDetails employeedetails) {
		int result=0;
		String query="insert into employeedetails values("+employeedetails.getEmployeeId()+",'"+employeedetails.getEmployeeName()+"',"+employeedetails.getEmployeeSalary()+","+employeedetails.getEmployeeMobileNumber()+")";
		try {
			statement=connection.createStatement();
			result=statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	public int deleteDataWithStatement(EmployeeDetails employeedetails) {
		int result1=0;
		String query="delete from employeedetails where employeeName='"+employeedetails.getEmployeeName()+"'";
		try {
			statement=connection.createStatement();
			result1=statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result1;
		
	}
	public int updateDataWithStatement(EmployeeDetails employeedetails) {
		int result2=0;
		String query="update employeedetails set employeeName='"+employeedetails.getEmployeeName()+"' where employeeId="+employeedetails.getEmployeeId();
	    try {
			statement=connection.createStatement();
			result2=statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		return result2;
		
	}
	public int searchDataWithStatement(EmployeeDetails employeedetails) {
		int result3=0;
		String query="select employeeName='"+employeedetails.getEmployeeName()+"' from employee_table where employeeId="+employeedetails.getEmployeeId();
		try {
			statement=connection.createStatement();
			result3=statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result3;
		
	}
   
	}
