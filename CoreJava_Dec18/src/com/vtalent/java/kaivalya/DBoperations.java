package com.vtalent.java.kaivalya;

import java.sql.*;
import java.util.*;

public class DBoperations 
{
Connection connection;
Statement statement;

public DBoperations()
{
	connection=MySqlConnection.getInstance();
}


public int  insertdatawithstatement(Employee employee)
{
	int result=0;
	String query="insert into employee values("+employee.getEmpid()+",'"+employee.getEmpname()+"',"+employee.getEmpsalary()+")";
	{
		try {
			statement = connection.createStatement();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			result=statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	return result;
	}
}
	public static void main(String[] args)
	
	{
		Scanner input=new Scanner(System.in);
		Employee emp=new Employee();
		System.out.println("Enter employee details");
		System.out.println("Enter employee name");
		emp.setEmpname(input.next());
		System.out.println("Enter employee id");
		emp.setEmpid(input.nextInt());
		System.out.println("Enter employee salary");
		emp.setEmpsalary(input.nextDouble());
		DBoperations dboperation=new DBoperations();
		int result1=dboperation.insertdatawithstatement(emp);
		if(result1>0)
		{
			System.out.println("insert successfully");
		}
		else
		{
			System.out.println("operations fail try again");
				
		}
	}
	
}
