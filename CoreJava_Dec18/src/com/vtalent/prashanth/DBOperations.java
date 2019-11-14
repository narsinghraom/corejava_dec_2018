package com.vtalent.prashanth;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBOperations {
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	
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
	
	public int updateDataWithStatement(EmployeeBean2 employee) {
		int result2 = 0;
		String query = "update Employee_table set employeeName='"+employee.getEmployeeName()+"' where employeeId="+employee.getEmployeeId();
		try {
			statement = connection.createStatement();
			result2 = statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result2;
		
	}
	
	public EmployeeBean2 searchDataWithStatement(EmployeeBean2 employee) {
		EmployeeBean2 emp = null;
		String query = "select * from Employee_table where employeeId="+employee.getEmployeeId();
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				emp = new EmployeeBean2();
				emp.setEmployeeId(resultSet.getInt(1));
				emp.setEmployeeName(resultSet.getString(2));
				emp.setEmployeeSalary(resultSet.getDouble(3));
				emp.setEmployeeMobileNo(resultSet.getLong(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	public static void main(String[] args) {
		
		DBOperations dbOperations = new DBOperations();
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("Please select your choice: \r\n" +
					"1. insert Into Array.\r\n" + 
					"2. delete from my Array.\r\n" + 
					"3. Update an employee details.\r\n" +
					"4. Search an employee details.\r\n" +
					"5. Exit.");
			int scan = sc.nextInt();
			
			EmployeeBean2 employee = new EmployeeBean2();
			switch(scan) {
			case 1: 
				
				System.out.println("Enter the Employee Details: ");
				System.out.println("Enter Employee Id: ");
				employee.setEmployeeId(sc.nextInt());
				System.out.println("Enter Employee Name: ");
				employee.setEmployeeName(sc.next());
				System.out.println("Enter Employee Salary: ");
				employee.setEmployeeSalary(sc.nextDouble());
				System.out.println("Enter Mobile Number: ");
				employee.setEmployeeMobileNo(sc.nextLong());
				
				int result = dbOperations.insertDataWithStatement(employee);
				if(result > 0) {
					System.out.println("Employee Data Inserted Successfully.");
				}else {
					System.out.println("Operation Failed, Please Try Again.");
				}
				break;
			case 2:
				
				System.out.println("Enter Employee Name to Delete: ");
				employee.setEmployeeName(sc.next());
				int result1 = dbOperations.deleteDataWithStatement(employee);
				if(result1>0) {
					System.out.println("Employee Data Deleted Successfully.");
				}else {
					System.out.println("Operation Failed, Please Try Again.");
				}
				break;
			case 3: 
				
				System.out.println("Enter Employee Name to Update: ");
				employee.setEmployeeName(sc.next());
				System.out.println("Enter Employee Id for Upadating Name: ");
				employee.setEmployeeId(sc.nextInt());
				int result2 = dbOperations.updateDataWithStatement(employee);
				if(result2>0) {
					System.out.println("Employee Data Updated Successfully.");
				}else {
					System.out.println("Operation Failed, Please Try Again.");
				}
				break;
			case 4:
				
				System.out.println("Enter Employee Id to be Search: ");
				employee.setEmployeeId(sc.nextInt());
				EmployeeBean2 emp1 = dbOperations.searchDataWithStatement(employee);
				if(null != emp1) {
					System.out.println("Employee Data Searched Successfully.");
					System.out.println("employeeId \t employeeName \t employeeSalary \t employeeMobileNo");
					System.out.println(emp1.getEmployeeId()+" \t "+emp1.getEmployeeName()+" \t "+emp1.getEmployeeSalary()+" \t "+emp1.getEmployeeMobileNo());
				}else {
					System.out.println("Employee Id is Not Valid.");
				}
				break;
			case 5:
				
				System.exit(0);
			default: System.out.println("Please give a valid Input: ");
			
			}
		}
		
	}
}
