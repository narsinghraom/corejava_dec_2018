package com.vtalent.java.mahesh;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
	private static MySQLConnection mySQLConnection = new MySQLConnection();
	Connection connection;
	
	private MySQLConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		try{
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vtalent9","root","root");
		}
		catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	public static Connection getInstance() {
		return mySQLConnection.connection;
	}
	
	public static void main(String[] args) {
		System.out.println(MySQLConnection.getInstance());
	}

}
