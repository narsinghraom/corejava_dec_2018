package com.vtalent.java.srikarreddy;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.vtalent.prashanth.EmployeeBean2;

public class DBoperations {
	static Scanner input = new Scanner(System.in);
	Connection connection;
	Statement statement;
	ResultSet resultset;
	
	public DBoperations() {
		connection = MysqlConnection.getInstance();
	}
	
	public int insertDataWithStatement(Employee employee) {
		int result = 0;
		String query = "insert into employee values("+employee.getEmployeeId()+",'"+employee.getEmployeeName()+"',"+employee.getEmployeeSalary()+")";
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public int deleteDataWithStatement(Employee employee) {
		int result1 = 0;
		String query = "delete from employee where employeeName='"+employee.getEmployeeName()+"'";
		try {
			statement = connection.createStatement();
			result1 = statement.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result1;
	}
	public int updateDataWithStatement(Employee employee) {
		int result2 = 0;
		String query = "update employee set employeeName='"+employee.getEmployeeName()+"' where employeeId="+employee.getEmployeeId();
		try {
			statement = connection.createStatement();
			result2 = statement.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result2;
	}
	public  Employee searchDataWithStatement(Employee  employee) {
		Employee em=null;
		String query ="Select * from employee  where employeeId='"+employee.getEmployeeId()+"'";  
		try {
			statement = connection.createStatement();
			resultset   = statement.executeQuery(query); 
			 while(resultset.next()) {
				 em =new Employee();
				 em.setEmployeeId(resultset.getInt(1));
				em.setEmployeeName(resultset.getString(2) );
				em.setEmployeeSalary(resultset.getDouble(3));
			 }
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return em;
	}

	public static void main(String[] args) {
	Employee employee = new Employee();
		for(;;) {
		System.out.println("please enter your choice\n"
				+"1.insert an employee.\n"
				+"2.delete from employee.\n"
				+"3.update employee details from employee.\n"
				+"4.search.\n"
				+"5.exit.");
		int n=input.nextInt();
		switch(n) {
		case 1:
		System.out.println("Enter the employee Details");
		System.out.println("Enter Employee Id");
		employee.setEmployeeId(input.nextInt());
		System.out.println("Enter employee Name");
		employee.setEmployeeName(input.next());
		System.out.println("enter employee Salary");
		employee.setEmployeeSalary(input.nextDouble());
		
		DBoperations dbOperations = new DBoperations();
		int result = dbOperations.insertDataWithStatement(employee);
		if(result>0) {
			System.out.println("Insert Sucessfully");
		}else {
			System.out.println("Operation failed please try again");
		}
		 break;
		case 2:
		System.out.println("enter the employee name to be deleted ");
	employee.setEmployeeName(input.next());
		DBoperations dbOperations1 = new DBoperations();
		int result1 = dbOperations1.deleteDataWithStatement(employee);
		if(result1>0) {
			System.out.println("deleted Sucessfully");
		}else {
			System.out.println("Operation failed please try again");
		}
		break;
		case 3:
			System.out.println("enter the employee name to be update ");
			employee.setEmployeeName(input.next());
			System.out.println("enter the id for updating name; ");
			employee.setEmployeeId(input.nextInt());
				DBoperations dbOperations2 = new DBoperations();
				int result2 = dbOperations2.updateDataWithStatement(employee);
				if(result2>0) {
					System.out.println("updated Sucessfully");
				}else {
					System.out.println("Operation failed please try again");
				}
				break;
		case 4:
			System.out.println("Enter Employee Id to be Search: ");
			employee.setEmployeeId(input.nextInt());
			DBoperations dbOperations3 = new DBoperations();
			Employee emp1 = dbOperations3.searchDataWithStatement(employee);
			if(null != emp1) {
				System.out.println("Employee Data Searched Successfully.");
				System.out.println("employeeId \t employeeName \t employeeSalary");
				System.out.println(emp1.getEmployeeId()+" \t "+emp1.getEmployeeName()+" \t "+emp1.getEmployeeSalary());
			}else {
				System.out.println("Employee Id is Not Valid.");
			}
			break;
			
		case 5:
			System.exit(0);
			default: System.out.println("please give a vaild input");
			
		}
		}
		}
}









