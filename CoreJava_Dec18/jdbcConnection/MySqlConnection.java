package com.example.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
	private Connection connection;
	private static MySqlConnection mysqlConnection = new MySqlConnection();

	private static final String URL = "jdbc:mysql://localhost:3306/connectionexample";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "123456";

	private MySqlConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getMyInstanceOfMySql() {
		return mysqlConnection.connection;

	}

}
