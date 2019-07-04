package com.vtalent.srihari;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {
	private static MySqlConnection mysqlc = new MySqlConnection();
	private Connection con;

	private MySqlConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeDB", "root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static Connection getInstance() {
		return mysqlc.con;

	}
}
