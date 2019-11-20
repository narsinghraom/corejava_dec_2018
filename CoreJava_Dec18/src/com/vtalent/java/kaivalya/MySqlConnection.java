package com.vtalent.java.kaivalya;

import java.sql.*;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;
public class MySqlConnection
{
private static MySqlConnection mysqlconnection=new MySqlConnection();
Connection connection;
private MySqlConnection()
{
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vtalent","root","root");
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
public static Connection getInstance()
{
	return mysqlconnection.connection;
}
public static void main(String[] args)
{
	System.out.println(mysqlconnection.getInstance());
}


	
}

