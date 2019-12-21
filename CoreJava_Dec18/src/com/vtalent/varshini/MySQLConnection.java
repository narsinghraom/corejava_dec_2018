package com.vtalent.varshini;

import java.sql.*;

public class MySQLConnection {
	private static MySQLConnection mysqlconnection=new MySQLConnection();
	Connection connection;
	private MySQLConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vtalent","root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getInstance() {
		return mysqlconnection.connection;
	}
	public static void main(String[] args) {
		System.out.println(MySQLConnection.getInstance());
	}
	


}
