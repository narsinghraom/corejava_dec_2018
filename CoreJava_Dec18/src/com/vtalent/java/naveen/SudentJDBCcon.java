package com.vtalent.java.naveen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SudentJDBCcon {

//private static  SudentJDBCcon sjc=new SudentJDBCcon();
 private SudentJDBCcon(){
	 String url="jdbc:mysql://localhost:3306/vsn";
	 String user ="root";
	 String password="root";
	try {
		Class.forName("com.mysql.jdbc.Driver");
	Connection	con1=DriverManager.getConnection(url, user, password);
	} catch (ClassNotFoundException e) {
			e.printStackTrace();
	} catch (SQLException e) {
				e.printStackTrace();
	}
}
 public static Connection getconnection() {	
	 Connection con = null;
	 String url="jdbc:mysql://localhost:3306/vsn";
	 String user ="root";
	 String password="root";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(url, user, password);
	} catch (ClassNotFoundException e) {
			e.printStackTrace();
	} catch (SQLException e) {
				e.printStackTrace();
	}
	return con;
	 
 }
}
