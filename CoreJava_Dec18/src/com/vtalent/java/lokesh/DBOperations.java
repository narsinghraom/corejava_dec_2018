package com.vtalent.java.lokesh;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBOperations {
	Connection connection;
	Statement statement;
	
public DBOperations() {
		connection =MySQLConnections.getInstance();
		
	}
	public int insertDataWithStatement(employeeBean employeeBean) {
		int result=0;
		String query ="insert into employee_table values("+employeeBean.getEmployeeId()+",'"+employeeBean.getEmployeeName()+"',"+employeeBean.getEmployeeSalary()+","+employeeBean.getEmployeeMobileno()+")";
	try {
		statement= connection.createStatement();
		result=statement.executeUpdate(query);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return result;
	

	}
	public int deleteDataWithStatement(employeeBean employeeBean) {
		int result =0;
		String query = "delete from employee_table where employeeName='"+employeeBean.getEmployeeName()+"'";
		try {
			statement = connection.createStatement();
			result=statement.executeUpdate(query);
		}catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return result;
	}
		public int updateDataWithStatement(employeeBean employeeBean) {
			int result =0;
			String query = "update exemployee_table where employeeName='"+employeeBean.getEmployeeName()+"'";
			try {
				statement = connection.createStatement();
				result = statement.executeUpdate(query);
			}catch(SQLException e ) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				 
			}
		
		}
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		employeeBean employee = new employeeBean();
		System.out.println("Enter the employee details");
		System.out.println("Enter the employee id");
		employee.setEmployeeId(input.nextInt());
		System.out.println("Enter the employee name");
		employee.setEmployeeName(input.next());
		System.out.println("Enter the employee salary");
		employee.setEmployeeSalary(input.nextDouble());
		System.out.println("Enter the employeeMobile no");
		employee.setEmployeeMobileno(input.nextLong());
		DBOperations dboperations = new DBOperations();
		int result = dboperations.insertDataWithStatement(employee);
		if(result>0) {
			System.out.println("employee data insert succesfully");
		}else {
			System.out.println("operation failed please try again");
		}
		System.out.println("enter the employee name to be deleted");
		employee.setEmployeeName(input.next());
		DBOperations dboperations1 = new DBOperations();
		int result1=dboperations1.deleteDataWithStatement(employee);
		if (result1>0) {
			System.out.println("employee data delete succesfully");
		}
		else
		{
			System.out.println("deleted unsucessfully");
			{
				
		System.out.println("update the employee data");
		employee.setEmployeeName(input.next());
		DBOperations dboperations11 = new DBOperations();
		int result11=dboperations11.deleteDataWithStatement(employee);
		if (result11>0) {
			System.out.println("sucessfully updated the employee data");
		}
			}
		}
	}
}

		
	

	
	