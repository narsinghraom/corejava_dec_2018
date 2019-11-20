package com.vtalent.java.lokesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


	public class MySQLConnections {
		private static MySQLConnections mySQLConnection = new MySQLConnections();
		Connection connection;
		private MySQLConnections() {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lokesh","root","ROOT");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		public static Connection getInstance() {
			return mySQLConnection.connection;
			
		}
		public static void main(String[] args) {
			System.out.println(MySQLConnections.getInstance());
		}
		
	}
