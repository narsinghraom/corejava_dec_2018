package com.vtalent.vittalharish;

import java.sql.*;
import java.util.*;

import com.vtalent.bhavani.add;

public class DBOperations2 {
	Connection connection;
	Statement statement;
	PreparedStatement pstatement;
	ResultSet rset;

	public DBOperations2() {
		connection = MySqlConnection.getInstance();
	}

	public int InsertDataWithStatement(Employee employee) {
		String query = "insert into employee_table values(?,?,?,? )";
		int result = 0;
		try {
			pstatement = connection.prepareStatement(query);
			pstatement.setInt(1, employee.getEmployeeID());
			pstatement.setString(2, employee.getEmployeeName());
			pstatement.setDouble(3, employee.getEmployeeSalary());
			pstatement.setString(4, employee.getEmpolyeeMobileNumber());
			int result1 = pstatement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	public int DeleteDataWithStatement(int empID) {
		String deletequery = "delete from employee_table where empID=?";
		int result = 0;
		try {
			pstatement = connection.prepareStatement(deletequery);
			 pstatement.setInt(1, empID);
			int result2 = pstatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	public List<Employee> Search(int empID) {
		String query = "select empName , empSalary , empMobile from employee_table where empID=?";
		Employee employee = null;
		List<Employee> listofemployee = new ArrayList<>();
		try {
			pstatement = connection.prepareStatement(query);
			pstatement.setInt(1, empID);
			rset = pstatement.executeQuery();
			while (rset.next()) {
				employee = new Employee();
				employee.setEmployeeID(empID);
				employee.setEmployeeName(rset.getString(1));
				employee.setEmployeeSalary(rset.getDouble(2));
				employee.setEmpolyeeMobileNumber(rset.getString(3));
				listofemployee.add(employee);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return listofemployee;
	}
	
	public List<Employee> Print(){
		String query = "select * from employee_table";
		Employee employee = null;
		List<Employee> listofemployees = new ArrayList<>();
		try {
			pstatement = connection.prepareStatement(query);
			rset = pstatement.executeQuery();
			while(rset.next()) {
				employee = new Employee();
				employee.setEmployeeID(rset.getInt(1));
				employee.setEmployeeName(rset.getString(2));
				employee.setEmployeeSalary(rset.getDouble(3));
				employee.setEmpolyeeMobileNumber(rset.getString(4));
				listofemployees.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listofemployees;

	}
}
