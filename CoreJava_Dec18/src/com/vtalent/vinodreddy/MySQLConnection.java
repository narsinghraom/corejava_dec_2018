package com.vtalent.vinodreddy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class MySQLConnection {
	private static MySQLConnection mysqlconnection=new MySQLConnection();
	Connection connection;
	private MySQLConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/vinodreddy","root","root");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	public static Connection getInstance() {
		return mysqlconnection.connection;
		}
	public static void main(String[] args) {
		System.out.println("mysqlconnection.getInstance()");
	}
	
}

