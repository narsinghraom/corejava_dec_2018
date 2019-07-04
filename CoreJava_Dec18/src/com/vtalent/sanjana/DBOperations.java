package com.vtalent.sanjana;
import java.sql.*;
public class DBOperations {
static Connection connection;
static Statement statement;
static PreparedStatement pstmt;
DBOperations()
{
	connection=Jdbc.getInstance();
}
public static int insertDataWithPstmt(Employee emp)
{
	String query="insert into emp_table values(?,?,?)";
	int result=0;
	try {
		pstmt=connection.prepareStatement(query);
		pstmt.setInt(1,emp.getEmployeeId());
		pstmt.setString(2, emp.getEmployeeName());
		pstmt.setDouble(3, emp.getEmployeeSalary());
		result=statement.executeUpdate(query);
	    }
	catch(Exception e)
	{
		System.out.println(e);
	}
	return result;
}
public static void main(String[] args)
{
	
}
}
