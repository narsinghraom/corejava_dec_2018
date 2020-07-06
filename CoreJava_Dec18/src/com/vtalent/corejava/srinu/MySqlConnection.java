package com.vtalent.corejava.srinu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
	private Connection connection;
	private static MySqlConnection mySqlConnection=new MySqlConnection();
	private static final String URL="jdbc:mysql://localhost:3306:vtalentdatabase";
	private static final String USERANAME="root";
	private static final String PASSWORD="root";
	private MySqlConnection(){
		try {
			Class.forName("com.mysql.jdbc.driver");
			connection=DriverManager.getConnection(URL,USERANAME,PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public static Connection getInstanceOfMySql(){
			return mySqlConnection.connection;
		
	}

}
