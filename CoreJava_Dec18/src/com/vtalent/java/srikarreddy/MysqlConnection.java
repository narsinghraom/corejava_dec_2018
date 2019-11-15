package com.vtalent.java.srikarreddy;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {
	private static MysqlConnection mySQLConnection = new MysqlConnection();
	Connection connection;
	
	private MysqlConnection() {
		try {
			 Class.forName("com.mysql.jdbc.Driver");  
			 connection=DriverManager.getConnection( "jdbc:mysql://localhost:3306/srikar","root","ROOT");   
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
		System.out.println(MysqlConnection.getInstance());
	}

}
