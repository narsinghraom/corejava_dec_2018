package com.vtalent.rakesh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBOperations {
	Connection Connection;
	PreparedStatement pstatement;
	ResultSet rset;

	DBOperations() {
		Connection = MySqlConnection.getInstsnce();

	}

	public void insertDataWithStatements(Employee employee) {
		String query = "insert into qwerty values(?,?,?,?,?,?,?,?,?,?,?)";

		try {
			pstatement = Connection.prepareStatement(query);
			pstatement.setInt(1, employee.getEmployid());
			pstatement.setString(2, employee.getEmployName());
			pstatement.setDouble(3, employee.getEmploysalary());
			pstatement.setDouble(4, employee.getEmi());
			pstatement.setDouble(5, employee.getEmployPackage());
			pstatement.setDouble(6, employee.getPf());
			pstatement.setString(7, employee.getMobileNumber());

			pstatement.setDouble(9, employee.getLoanAmount());

			pstatement.setInt(8, employee.getTenure());
			pstatement.setString(10, employee.getLoanStartDate());
			pstatement.setString(11, employee.getLoanEndDate());

			int rsetone = pstatement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);

		}

	}

	public Employee Search(int empID) {
		String query = "select * from qwerty where empID=?";
		Employee employee = null;
		try {
			pstatement = Connection.prepareStatement(query);
			pstatement.setInt(1, empID);
			rset = pstatement.executeQuery();
			while (rset.next()) {
				employee = new Employee();
				employee.setEmployid(empID);
				employee.setEmployName(rset.getString(1));
				employee.setEmploysalary(rset.getDouble(2));
				employee.setMobileNumber(rset.getString(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return employee;
	}

	public Employee update(int empid) {
		String query = "update qwerty set empsalary=? where empID=?";
		Employee employee = null;
		try {
			pstatement = Connection.prepareStatement(query);
			pstatement.setInt(1, empid);
			rset = pstatement.executeQuery();
			while (rset.next()) {
				employee = new Employee();
				employee.setEmployid(empid);

				employee.setEmploysalary(rset.getDouble(1));

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return employee;
	}

	public void deleteEmploy() {

		String query = "delete from qwerty where empID=?";

	}

	public void printData() {

		/*
		 * System.out.println("All employee details:\n" + "id is " + employee.getId() +
		 * "\n" + "name is " + employee.getEname() + "\n" + "salary is " +
		 * employee.getLoanAmount());
		 */
	}

	public void updateData() {
		// TODO Auto-generated method stub

	}

	public void searchData() {
		// TODO Auto-generated method stub

	}

	public void DeleteData() {
		// TODO Auto-generated method stub

	}

	public void validateLoan() {
		// TODO Auto-generated method stub

	}

}
