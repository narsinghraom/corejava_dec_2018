package com.vtalent.java.haritha;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vtalent.jdbc.DBOperations;

public class Operations {
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	public Operations() {
		connection= MySQLConnection.getInstance();
	}
public int insertdataWithStatement(EmployeeSQL empsql) {
	int result=0;
	String query="insert into EmployeeSQL values("+empsql.getEmployeeid()+",'"+empsql.getEmployeename()+"',"+empsql.getEmployeemobile()+","+empsql.getEmployeesalary()+")";
try {
	statement=connection.createStatement();
	result=statement.executeUpdate(query);
	}catch(SQLException e){
		e.printStackTrace();
	}
		return result; 
	}
public int deletedataWithStatement(EmployeeSQL empsql) {
	int result=0;
	String query="delete from EmployeeSQL where employeeid="+empsql.getEmployeeid();
			try {
				statement=connection.createStatement();
				result=statement.executeUpdate(query);
				}catch(SQLException e){
					e.printStackTrace();
				}
			return result;
}
public int updatedataWithStatement(EmployeeSQL empsql) {
	int result=0;
	String query="update EmployeeSQL set Employeename='"+empsql.getEmployeename()+"',Employeemobile="+empsql.getEmployeemobile()+",Employee="+empsql.getEmployeesalary()+" where Employeeid="+empsql.getEmployeeid();
	try {
		statement=connection.createStatement();
		result=statement.executeUpdate(query);
	}catch(SQLException e) {
	e.printStackTrace();
}
	return result;
}
public List<EmployeeSQL> getAllEmployeeData(){
	   List<EmployeeSQL> listofemployeedata=new ArrayList<EmployeeSQL>();
	   String query="select * from EmployeeSQL";
	   try {
	   statement=connection.createStatement();
	   resultSet=statement.executeQuery(query);
	   EmployeeSQL empsql=null;
	   while(resultSet.next()) {
		   empsql=new EmployeeSQL();
		   empsql.setEmployeeid(resultSet.getInt(1));
		   empsql.setEmployeename(resultSet.getString(2));
		   empsql.setEmployeemobile(resultSet.getLong(3));
		   empsql.setEmployeesalary(resultSet.getDouble(4));
		   listofemployeedata.add(empsql);
	   }
	   }catch(SQLException e) {
        e.printStackTrace();	
	   }
	   return listofemployeedata;
	   }
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	EmployeeSQL emp=new EmployeeSQL();
	for(;;) {
		System.out.println("please select your choice:\n"+
	"1.insert an employee.\n"
	+"2.delete an employee.\n"
	+"3.update an employee.\n"
	+"4.retrieve employee.\n"
	+"5.exit");
	int scan=sc.nextInt();
	switch(scan) {
	case 1:
	System.out.println("Enter employee details");
	System.out.println("enter the employeeid");
	emp.setEmployeeid(sc.nextInt());
	System.out.println("enter employeename");
	emp.setEmployeename(sc.next());
	System.out.println("enter the mobileno");
	emp.setEmployeemobile(sc.nextLong());
	System.out.println("enter salary");
	emp.setEmployeesalary(sc.nextDouble());
	Operations operations = new Operations();
	int result = operations.insertdataWithStatement(emp);
	if(result>0) {
		System.out.println("Insert Sucessfully");
	}else {
		System.out.println("Operation failed please try again");
	}
	break;
	case 2:
	System.out.println("enter data to be deleted");
	emp.setEmployeeid(sc.nextInt());
	Operations operations1=new Operations();
	int result1=operations1.deletedataWithStatement(emp);
	if(result1>0) {
	System.out.println("Employee data deleted successfully!!!");
	}else {
	System.out.println("Employeedata not found");	
	}break;
	case 3:
	System.out.println("enter name to be update: ");
	emp.setEmployeename(sc.next());
	System.out.println("enter mobile to be update: ");
	emp.setEmployeemobile(sc.nextLong());
	System.out.println("enter salary to be update: ");
	emp.setEmployeesalary(sc.nextDouble());
	System.out.println("enter id to update details: ");
	emp.setEmployeeid(sc.nextInt());
	Operations operations2=new Operations();
	int result2=operations2.updatedataWithStatement(emp);
	if(result2>0) {
		System.out.println("updated successfully");
	}else {
		System.out.println("updated unsuccessfully");
	}break;
	case 4:
		Operations operations3 = new Operations();
		List<EmployeeSQL> response=operations3.getAllEmployeeData();
		if(null != emp) {
		System.out.println("EmpId \t EmpName \t EmpMobile \t EmpSalary");
		for(EmployeeSQL emp1:response) {
		System.out.println(emp1.getEmployeeid()+"  \t"+emp1.getEmployeename()+"   \t"+emp1.getEmployeemobile()+"   \t"+emp1.getEmployeesalary());	
		}
	}
	}
}
}
}
