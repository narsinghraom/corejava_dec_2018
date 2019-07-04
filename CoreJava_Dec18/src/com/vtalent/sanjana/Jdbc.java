package com.vtalent.sanjana;
import java.sql.*;
public class Jdbc {
private static Jdbc mysqlcon=new Jdbc();
private Connection con;
private Jdbc()
{
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
	public static Connection getInstance()
	{
		return mysqlcon.con;
	}

}
