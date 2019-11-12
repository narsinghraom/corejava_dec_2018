package com.vtalent.jdbc;

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
	
	public int insertDataWithStatement(EmployeeBean employeeBean) {
		int result = 0;
		String query = "insert into employee values("+employeeBean.getEmployeeId()+",'"+employeeBean.getEmployeeName()+"',"+employeeBean.getEmployeeSalary()+")";
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		EmployeeBean employee = new EmployeeBean();
		System.out.println("Enter the employee Details");
		System.out.println("Enter Employee Id");
		employee.setEmployeeId(input.nextInt());
		System.out.println("Enter employee Name");
		employee.setEmployeeName(input.next());
		System.out.println("enter employee Salary");
		employee.setEmployeeSalary(input.nextDouble());
		
		DBOperations dbOperations = new DBOperations();
		int result = dbOperations.insertDataWithStatement(employee);
		if(result>0) {
			System.out.println("Insert Sucessfully");
		}else {
			System.out.println("Operation failed please try again");
		}

	}

}

















