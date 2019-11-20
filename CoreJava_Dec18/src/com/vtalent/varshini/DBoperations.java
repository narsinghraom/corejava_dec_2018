package com.vtalent.varshini;

import java.sql.*;
import java.util.Scanner;

import com.vtalent.prashanth.DBOperations;
import com.vtalent.prashanth.EmployeeBean2;

public class DBoperations {
	static DBoperations dboperations = new DBoperations();
	  Connection connection; 
	  Statement statement;
	public DBoperations() {
		connection=MySQLConnection.getInstance();
	}
	public int insertDataWithStatement(JdbcBean jdbc) {
		
    int result=0;
	String query = "insert into employee values("+jdbc.getEmployeeId()+",'"+jdbc.getEmployeeName()+"',"+jdbc.getEmployeeSalary()+")";
    
	try {
		statement=connection.createStatement();
	    result=statement.executeUpdate(query);
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	return result;
}
	public int deleteDataWithStatement(JdbcBean jdbc) {
		
	    int result=0;
	    String query="delete from employee where Employeeid="+jdbc.getEmployeeId();
	    try {
	    statement=connection.createStatement();
	    result=statement.executeUpdate(query);
	    }
	    catch(SQLException e) {
	    	e.printStackTrace();
	    }
	    return result;
	    }
public int UpdateDataWithStatement(JdbcBean jdbc) {
		
	    int result=0;
	    String query = "update employee set EmployeeName='"+jdbc.getEmployeeName()+"' where EmployeeId="+jdbc.getEmployeeId();
	    try {
	    statement=connection.createStatement();
	    result=statement.executeUpdate(query);
	    }
	    catch(SQLException e) {
	    	e.printStackTrace();
	    }
	    return result;
	    }

    public static void main(String args[]) {
    	 JdbcBean jdbc= new JdbcBean();
		 Scanner sc = new Scanner(System.in);
		for(;;) {
			
			System.out.println("Please select your choice: \r\n" +
					"1. insert Into Array.\r\n" + 
					"2. delete from my Array.\r\n" + 
					"3. Update an employee details.\r\n" +
					"4. Exit.");
			 int scan = sc.nextInt();
    switch(scan) {
	case 1: 
		   System.out.println("Enter the employee Details");
            System.out.println("Enter Employee Id");
            jdbc.setEmployeeId(sc.nextInt());
            System.out.println("Enter employee Name");
            jdbc.setEmployeeName(sc.next());
            System.out.println("enter employee Salary");
            jdbc.setEmployeeSalary(sc.nextLong());
	        int result = dboperations.insertDataWithStatement(jdbc);
	        if(result>0) {
		      System.out.println("Insert Sucessfully");
	        }else {
		    System.out.println("Operation failed please try again");
            }
	        break;
	        
	case 2:
		   System.out.println("enter the data to be deleted");
	       System.out.println("enter employee id value");
	       jdbc.setEmployeeId(sc.nextInt());
	       int result1 = dboperations.deleteDataWithStatement(jdbc);
	       if(result1>0) {
		   System.out.println("delete data Sucessfully");
	       }else {
		   System.out.println("Operation failed please try again");
            }
	       break;
	case 3:
		     System.out.println("Enter Employee Name to Update: ");
	        jdbc.setEmployeeName(sc.next());
	        System.out.println("Enter Employee Id for Upadating Name: ");
	        jdbc.setEmployeeId(sc.nextInt());
	        int result2 = dboperations.UpdateDataWithStatement(jdbc);
	        if(result2>0) {
	     	System.out.println("Employee Data Updated Successfully.");
	         }else {
		     System.out.println("Operation Failed, Please Try Again.");
	         }
	        break;
	case 4: System.exit(0);
			default: System.out.println("Please give a valid Input: ");
			
}
}
}
}