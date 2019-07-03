package com.vtalent.vittalharish;

import java.sql.*;

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

	public int DeleteDataWithStatement(Employee employee) {
		String deletequery = "delete from employee_table where empID=123";
		int result = 0;
		try {
			pstatement = connection.prepareStatement(deletequery);
			// pstatement.setInt(1, employee.getEmployeeID());
			int result2 = pstatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	public Employee Search(int empID) {
		String query = "select empName , empSalary , empMobile from employee_table where empID=?";
		Employee employee = null;
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
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return employee;
	}
}
