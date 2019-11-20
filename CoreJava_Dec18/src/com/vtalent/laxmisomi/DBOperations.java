package com.vtalent.laxmisomi;

import java.sql.*;
import java.sql.Statement;
import java.util.Scanner;


public class DBOperations {
   Connection connection;
   Statement statement;
	public DBOperations() {
		
	connection=MySQLConnection.getInstance();

	}
	public int insertDataWithStatement(EmployeeSQL employeesql) {
		int result=0;
		String query = "insert into employee values("+employeesql.getEmployeeId1()+",'"+employeesql.getEmployeeName1()+"',"+employeesql.getEmployeeSalary1()+")";

		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public int deleteDataWithStatement(EmployeeSQL employeesql) {
		int result1=0;
		String query = "delete from employee where EmployeeId1="+employeesql.getEmployeeId1();
		try {
			statement = connection.createStatement();
			result1 = statement.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result1;
	}

	public int updateDataWithStatement(EmployeeSQL employeesql) {
		int result2=0;
		String query = "update employee set EmployeeName='"+employeesql.getEmployeeName1()+"' where EmployeeId1="+employeesql.getEmployeeId1();
		try {
			statement = connection.createStatement();
			result2 = statement.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result2;
	}



}



	
		