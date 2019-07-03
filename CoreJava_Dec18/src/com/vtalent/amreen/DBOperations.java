package com.vtalent.amreen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBOperations {
	Connection connection;
	Statement statement;
	PreparedStatement pstatement;
	ResultSet rset;

	public DBOperations() {
		connection = MySqlConnection.getInstance();
	}

	public int insertDataWithPreparedStatement(Employee employee) {
		String query = "insert into emp values(?,?,?)";
		int result = 0;
		try {
			pstatement = connection.prepareStatement(query);
			pstatement.setInt(1, employee.getId());
			pstatement.setString(2, employee.getEname());

			pstatement.setDouble(3, employee.getSalary());

			/*
			 * pstatement.setFloat(4, employee.getLoanAmount());
			 * pstatement.setFloat(4, employee.getEMI()); pstatement.setFloat(4,
			 * employee.getYear()); pstatement.setFloat(4,
			 * employee.getInterest()); pstatement.setString(4,
			 * employee.getStartingDate()); pstatement.setString(4,
			 * employee.getEndDate());
			 */

			int result1 = pstatement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	public int deleteDataWithPreparedStatement(int Id) {
		String query = "delete from emp where Id=?";
		int result = 0;
		try {
			pstatement = connection.prepareStatement(query);
			pstatement.setInt(1, Id);

			int result1 = pstatement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	public int updateDataWithPreparedStatement(Employee employee) {

		String query = "update emp set Salary=? where Id=?";
		int result = 0;
		try {
			pstatement = connection.prepareStatement(query);

			pstatement.setDouble(1, employee.getSalary());
			pstatement.setInt(2, employee.getId());

			int result1 = pstatement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	public List<Employee> search(int Id) {

		String query = "select eName,Salary from emp where Id=?";
		Employee emp = null;
		List<Employee> ref = new ArrayList<>();
		try {
			pstatement = connection.prepareStatement(query);
			pstatement.setInt(1, Id);
			rset = pstatement.executeQuery();
			while (rset.next()) {
				emp = new Employee();
				emp.setId(Id);
				emp.setEname(rset.getString(1));
				emp.setSalary(rset.getDouble(2));
				ref.add(emp);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ref;

	}

}
