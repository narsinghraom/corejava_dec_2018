package com.vtalent.vinodreddy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DbOperations2 {
	Connection connection;
	PreparedStatement pstatement;
	public DbOperations2() {
		connection=MySQLConnection.getInstance();
	}
	public int insertDataWithPreparedStatement(EmployeeDetails employeedetails) {
		int result=0;
		String query="insert into employeedata values(?,?,?,?)";
		try {
			pstatement=connection.prepareStatement(query);
			pstatement.setInt(1,employeedetails.getEmployeeId());
			pstatement.setString(2,employeedetails.getEmployeeName());
			pstatement.setDouble(3,employeedetails.getEmployeeSalary());
			pstatement.setLong(4,employeedetails.getEmployeeMobileNumber());
			result=pstatement.executeUpdate();
		} catch (SQLException e) {
					e.printStackTrace();
		}
		return result;
	}
	public int deleteDataWithPreparedStatement(EmployeeDetails employeedetails) {
		int result=0;
		String query="delete from employeedata where employeeName='"+employeedetails.getEmployeeName()+"'";
		try {
			pstatement=connection.prepareStatement(query);
			result=pstatement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}
	public int updateDataWithPreparedStatement(EmployeeDetails employeedetails) {
		int result=0;
		String query="update employeedata set employeeName='"+employeedetails.getEmployeeName()+"' where employeeId="+employeedetails.getEmployeeId();
		try {
			pstatement=connection.prepareStatement(query);
			result=pstatement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	}
