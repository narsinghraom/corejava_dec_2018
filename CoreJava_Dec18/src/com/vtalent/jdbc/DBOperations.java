package com.vtalent.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DBOperations {
	
	Connection connection;
	Statement statement;
	PreparedStatement pStatement;
	ResultSet resultSet;
	
	public DBOperations() {
		connection = MySQLConnection.getInstance();
	}
	
	public EmployeeBean getEmployeeData(int employeeId) {
		EmployeeBean employee = null; 
		String query = "select employeeName, employeeSalary from employee where employeeId = ?";
		try {
			pStatement = connection.prepareStatement(query);
			pStatement.setInt(1, employeeId);
			resultSet=pStatement.executeQuery();
			while(resultSet.next()) {
				employee= new EmployeeBean();
				employee.setEmployeeId(employeeId);
				employee.setEmployeeName(resultSet.getString(1));
				employee.setEmployeeSalary(resultSet.getDouble(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}
	
	public List<EmployeeBean> getAllEmployeeData(){
		List<EmployeeBean> listOfEmployees = new ArrayList<EmployeeBean>();
		String query = "select * from employee";
		try {
			pStatement = connection.prepareStatement(query);
			resultSet =	pStatement.executeQuery();
			EmployeeBean employeeBean= null;
			while(resultSet.next()) {
			 employeeBean=new EmployeeBean();
			 employeeBean.setEmployeeId(resultSet.getInt(1));
			 employeeBean.setEmployeeName(resultSet.getString(2));
			 employeeBean.setEmployeeSalary(resultSet.getDouble(3));
			 listOfEmployees.add(employeeBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listOfEmployees;
	}
	
	public int insertDataWithPreparedStatement(EmployeeBean employeeBean) {
		int result = 0;
		String query = "insert into employee values(?,?,?)";
		try {
			pStatement= connection.prepareStatement(query);
			pStatement.setInt(1, employeeBean.getEmployeeId());
			pStatement.setString(2, employeeBean.getEmployeeName());
			pStatement.setDouble(3, employeeBean.getEmployeeSalary());
			result = pStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
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
		DBOperations dbOperations = new DBOperations();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Employee Id to pull the data");
		int employeeId = input.nextInt();
		EmployeeBean employee = dbOperations.getEmployeeData(employeeId);
		if(null != employee) {
			System.out.println("EmpId \t EmpName \t EmpSalary");
			System.out.println(employee.getEmployeeId() +"\t"+employee.getEmployeeName()+"\t"+employee.getEmployeeSalary());
		}else {
			System.out.println("Employee Id Not Valid");
		}
		
		
		/*
		 * List<EmployeeBean> response= dbOperations.getAllEmployeeData();
		 * System.out.println("EmpId \t EmpName \t EmpSalary"); for(EmployeeBean
		 * employee:response) { System.out.println(employee.getEmployeeId()
		 * +"\t"+employee.getEmployeeName()+"\t"+employee.getEmployeeSalary()); }
		 */
		
		/*
		 *  EmployeeBean employee = new
		 * EmployeeBean(); System.out.println("Enter the employee Details");
		 * System.out.println("Enter Employee Id");
		 * employee.setEmployeeId(input.nextInt());
		 * System.out.println("Enter employee Name");
		 * employee.setEmployeeName(input.next());
		 * System.out.println("enter employee Salary");
		 * employee.setEmployeeSalary(input.nextDouble());
		 * 
		 *  int result =
		 * dbOperations.insertDataWithPreparedStatement(employee); if(result>0) {
		 * System.out.println("Insert Sucessfully"); }else {
		 * System.out.println("Operation failed please try again"); }
		 
*/
	}

}

















