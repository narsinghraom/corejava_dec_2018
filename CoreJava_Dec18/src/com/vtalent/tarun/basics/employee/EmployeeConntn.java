package com.vtalent.tarun.basics.employee;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeConntn {

	static Connection con;
	private static EmployeeConntn mySQLDBInstance = new EmployeeConntn();

	private EmployeeConntn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrm", "root", "root");
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}

	public static Connection getInstance() {

		return con;
	}

	public static void main(String[] args) {
		System.out.println(getInstance());
	}	
}
