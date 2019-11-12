package com.vtalent.shiva;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
	private static MySQLConnection mySQLConnection = new MySQLConnection();
	Connection connection;
	
	private MySQLConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shiva","root","root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection getInstance() {
		return mySQLConnection.connection;
	}
	
	public static void main(String[] args) {
		System.out.println(MySQLConnection.getInstance());
	}

}
