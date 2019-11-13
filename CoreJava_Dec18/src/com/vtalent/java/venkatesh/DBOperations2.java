package com.vtalent.java.venkatesh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DBOperations2 {
	Connection connection;
	PreparedStatement pstatement;
	public DBOperations2() {
		connection=MySQLConnections.getInstance();
	}
	public int insertDataWithPreparedStatement(EmployeeBean2 employee) {
		int result=0;
		String query="insert into Employee_table values(?,?,?,?)";
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
		String query="delete from employee_table where employeeName='"+employee.getEmployeeName()+"'";
		try {
			pstatement=connection.prepareStatement(query);
			result=pstatement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}
	public int updateDataWithPreparedStatement(EmployeeBean2 employee) {
		int result=0;
		String query="update employee_table set employeeName='"+employee.getEmployeeName()+"'+where employeeId="+employee.getEmployeeId();
		try {
			pstatement=connection.prepareStatement(query);
			result=pstatement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}
	public static void main(String[] args) {
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
		DBOperations2 dboperations=new DBOperations2();
		int result=dboperations.insertDataWithPreparedStatement(employee);
		if(result>0) {
			System.out.println("data inserted successfully");
		}else {
			System.out.println("try again");
		}break;
		case 2:
		System.out.println("enter the name to be deleted");
		employee.setEmployeeName(s.next());
		DBOperations2 dboperations1=new DBOperations2();
		int result1=dboperations1.deleteDataWithPreparedStatement(employee);
		if(result1>0) {
			System.out.println("employee data deleted successfully");
		}else {
			System.out.println("delete operation was unsuccessfull");
		}break;
		case 3:
		System.out.println("enter the name to be updated");
		employee.setEmployeeName(s.next());
		System.out.println("enter the id for updateing name");
		employee.setEmployeeId(s.nextInt());
		DBOperations2 dboperations2=new DBOperations2();
		int result2=dboperations2.updateDataWithPreparedStatement(employee);
		if(result2>0) {
			System.out.println("employee data updated");
		}else {
			System.out.println("update was unsuccessfull");
		}break;
	}
	}
	}
	}
