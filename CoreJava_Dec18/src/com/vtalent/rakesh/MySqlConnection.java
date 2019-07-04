package com.vtalent.rakesh;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {

	private static MySqlConnection mysqlcom = new MySqlConnection();
	private Connection con;

	private MySqlConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rakesh", "root", "root");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static Connection getInstsnce() {
		return mysqlcom.con;
	}

}
