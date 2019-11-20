package com.vtalent.java.venkatesh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBOperations2 {
	Connection connection;
	PreparedStatement pstatement;
	ResultSet resultset;
	public DBOperations2() {
		connection=MySQLConnections.getInstance();
	}
	public int insertDataWithPreparedStatement(EmployeeBean2 employee) {
		int result=0;
		String query="insert into employee_table values(?,?,?,?)";
		try {
			pstatement=connection.prepareStatement(query);
			pstatement.setInt(1,employee.getEmployeeId());
			pstatement.setString(2,employee.getEmployeeName());
			pstatement.setDouble(3,employee.getEmployeeSalary());
			pstatement.setLong(4,employee.getEmployeeMobileno());
			result=pstatement.executeUpdate();
		} catch (SQLException e) {
					e.printStackTrace();
		}
		return result;
	}
	public int deleteDataWithPreparedStatement(EmployeeBean2 employee) {
		int result=0;
		String query="delete from employee_table where employeeName=?";
		try {
			pstatement=connection.prepareStatement(query);
			pstatement.setString(1, employee.getEmployeeName());
			result=pstatement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}
	public int updateDataWithPreparedStatement(EmployeeBean2 employee) {
		int result=0;
		String query="update employee_table set employeeName=? where employeeId=?";
		try {
			pstatement=connection.prepareStatement(query);
			pstatement.setInt(1, employee.getEmployeeId());
			pstatement.setString(2, employee.getEmployeeName());
			result=pstatement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}
	public EmployeeBean2 searchDataWithPreparedStatement(EmployeeBean2 employee) {
		EmployeeBean2 employee1 = null;
		String query = "select * from Employee_table where employeeId=?";
		try {
			
			pstatement = connection.prepareStatement(query);
			pstatement.setInt(1, employee1.getEmployeeId());
			resultset = pstatement.executeQuery();
			while(resultset.next()) {
				employee1 = new EmployeeBean2();
				employee1.setEmployeeId(resultset.getInt(1));
				employee1.setEmployeeName(resultset.getString(2));
				employee1.setEmployeeSalary(resultset.getDouble(3));
				employee1.setEmployeeMobileno(resultset.getLong(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee1;
	}
	
	public static void main(String[] args) {
		DBOperations2 dboperations=new DBOperations2();
		Scanner s=new Scanner(System.in);
		for(;;){
			System.out.println("please select your choice:\n"+
		            "1.insert employee data.\n"+
					"2.delete employee data.\n"+
		            "3.update employee data.\n"+
					"4.search.\n"+
		            "5.exit.");
		int n=s.nextInt();
		EmployeeBean2 employee=new EmployeeBean2();
		switch(n) {
		case 1:
		System.out.println("enter employee details");
		System.out.println("enter employee id");
		employee.setEmployeeId(s.nextInt());
		System.out.println("enter employee name");
		employee.setEmployeeName(s.next());
		System.out.println("enter employee salary");
		employee.setEmployeeSalary(s.nextDouble());
		System.out.println("enter employee mobileno");
		employee.setEmployeeMobileno(s.nextLong());
		int result=dboperations.insertDataWithPreparedStatement(employee);
		if(result>0) {
			System.out.println("data inserted successfully");
		}else {
			System.out.println("try again");
		}break;
		case 2:
		System.out.println("enter the name to be deleted");
		employee.setEmployeeName(s.next());
		int result1=dboperations.deleteDataWithPreparedStatement(employee);
		if(result1>0) {
			System.out.println("employee data deleted successfully");
		}else {
			System.out.println("delete operation was unsuccessfull");
		}break;
		case 3:
			System.out.println("enter the name to be updated");
			employee.setEmployeeName(s.next());
			System.out.println("enter specific id to update name");
			employee.setEmployeeId(s.nextInt());
			int result2=dboperations.updateDataWithPreparedStatement(employee);
			if(result2>0) {
				System.out.println("data updated successfully");
			}else {
				System.out.println("update operation was unsuccessfull");
			}break;
		case 4:
			System.out.println("Enter Employee Id to be Search: ");
			employee.setEmployeeId(s.nextInt());
			EmployeeBean2 employee1 = dboperations.searchDataWithPreparedStatement(employee);
			if(null != employee1) {
				System.out.println("Employee Data Searched Successfully.");
				System.out.println("employeeId \t employeeName \t employeeSalary \t employeeMobileNo");
				System.out.println(employee1.getEmployeeId()+" \t "+employee1.getEmployeeName()+" \t "+employee1.getEmployeeSalary()+" \t "+employee1.getEmployeeMobileno());
			}else {
				System.out.println("Employee Id is Not Valid.");
			}
			break;
			}
		}
	}
}