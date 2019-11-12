package com.vtalent.java.venkatesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnections {
	private static MySQLConnections mysqlconnections= new MySQLConnections();
	Connection connections;
	private MySQLConnections() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connections = DriverManager.getConnection("jdbc:mysql://localhost:3306/venkatesh","root","root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public static Connection getInstance() {
		return mysqlconnections.connections;
		
	}
	public static void main(String[] args) {
		System.out.println(mysqlconnections.getInstance());
	}
	
}
