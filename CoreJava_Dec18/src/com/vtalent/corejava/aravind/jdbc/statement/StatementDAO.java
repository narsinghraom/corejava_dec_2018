package com.example.jdbc.statement;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.jdbc.bean.Employee;
import com.example.jdbc.dao.DAO;
import com.example.jdbcConnection.MySqlConnection;


public class StatementDAO implements DAO{
	private Connection connection;
	private Statement statement;
	
	public StatementDAO() {
		connection = MySqlConnection.getMyInstanceOfMySql();
	}

	@Override
	public int createEmployee(Employee employee) {
		int result = 0;
		//insert into EMployee_Table values (100 , "Mahankali" , 25000.00 , 9700423723,"hyd");
		String query = "insert into employee_table values ("+employee.getEmployeeId()+", '"+
		employee.getEmployeeName()+"' , "+employee.getEmployeeSalary()+","+employee.getEmployeeMobile() +", '"+employee.getEmployeeAddress()+
		"')";
		
		try {
			statement = connection.createStatement();
			result= statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int updateEmployee(Employee employee) {
		int result = 0;
		//update EMployee_Table set employeeAddress = "Hyderabad" where employeeId=100;
		String query = "update employee_table set employeename = '"+employee.getEmployeeName()+" ' , employeeAddress = '"+
		employee.getEmployeeAddress() +" ' where employeeId ="+employee.getEmployeeId();
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int deleteEmployee(int employeeId) {
		int result = 0;
		//delete from EMployee_Table where employeeId = 200;
		String query = "delete from EMployee_Table where employeeId ="+employeeId;
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}














