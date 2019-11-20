package com.vtalent.varshini;

import java.sql.*;
import java.util.*;

public class OperationsPs {
	Connection connection;
	PreparedStatement preparestatement;
	ResultSet resultSet;
	
public OperationsPs() {
	connection=MySQLConnection.getInstance();
}
public int insertdataWithPrepareStatement(EmployeeSQL empsql) {
	int result=0;
	String query="insert into EmployeeSQL values(?,?,?,?)";
	try {
	preparestatement=connection.prepareStatement(query);
	preparestatement.setInt(1, empsql.getEmployeeid());
	preparestatement.setString(2,empsql.getEmployeename());
	preparestatement.setLong(3,empsql.getEmployeemobile());
	preparestatement.setDouble(4,empsql.getEmployeesalary());
	result=preparestatement.executeUpdate();
}catch(SQLException e) {
	e.printStackTrace();
}
return result;
}
public int deletedataWithPrepareStatement(EmployeeSQL empsql) {
	int result=0;
	String query="delete from EmployeeSQL where Employeeid=?";
	try {
		preparestatement=connection.prepareStatement(query);
		preparestatement.setInt(1, empsql.getEmployeeid());
		result=preparestatement.executeUpdate();
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return result;	
}
public int updatedataWithPrepareStatement(EmployeeSQL empsql) {
	int result=0;
	String query="update EmployeeSQL set Employeename=?,Employeemobile=?,Employee=? where EmployeeId=?";
	try {
		preparestatement=connection.prepareStatement(query);
		preparestatement.setString(1, empsql.getEmployeename());
		preparestatement.setLong(2, empsql.getEmployeemobile());
		preparestatement.setDouble(3, empsql.getEmployeesalary());
		preparestatement.setInt(4,empsql.getEmployeeid());
		result=preparestatement.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return result;
}
public List<EmployeeSQL> ListOfEmployeedata(){
	List<EmployeeSQL>  listofemployeedata=new ArrayList<EmployeeSQL>();
	String query="select * from EmployeeSQL";
	try {
		preparestatement=connection.prepareStatement(query);
		resultSet=preparestatement.executeQuery();
		EmployeeSQL empsql=null;
		while(resultSet.next()) {
			EmployeeSQL empsql1=new EmployeeSQL();
			empsql1.setEmployeeid(resultSet.getInt(1));
			empsql1.setEmployeename(resultSet.getString(2));
			empsql1.setEmployeemobile(resultSet.getLong(3));
			empsql1.setEmployeesalary(resultSet.getDouble(4));
			listofemployeedata.add(empsql1);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return listofemployeedata;
	
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	EmployeeSQL emp=new EmployeeSQL();
	for(;;) {
		System.out.println("please select your choice.\n"
				+"1.insert an employee.\n"
				+"2.delete an employee.\n"
				+"3.update an employee.\n"
				+"4.Retrieve data from employee.\n"
				+"5.exit.\n");
		int scan=sc.nextInt();
		switch(scan) {
		case 1:
			System.out.println("Enter employee details");
			System.out.println("Enter employeeid");
			emp.setEmployeeid(sc.nextInt());
			System.out.println("Enter employeename");
			emp.setEmployeename(sc.next());
			System.out.println("Enter employeemobile");
			emp.setEmployeemobile(sc.nextLong());
			System.out.println("Enter employeesalary");
			emp.setEmployeesalary(sc.nextDouble());
			OperationsPs operations=new OperationsPs();
			int result=operations.insertdataWithPrepareStatement(emp);
			if(result>0) {
				System.out.println("Inserted successfully!!!");
			}else {
			System.out.println("Operation failed try again");		
				}
			break;
			
		case 2:
			System.out.println("enter data to be deleted");
			emp.setEmployeeid(sc.nextInt());
			OperationsPs operations1=new OperationsPs();
			int result1=operations1.deletedataWithPrepareStatement(emp);
			if(result1>0) {
				System.out.println("Deleted succesfully!!!");
			}else {
				System.out.println("Deleted unsuccessfully");
			}
			break;
			case 3:
			System.out.println("enter name to be update: ");
			emp.setEmployeename(sc.next());
			System.out.println("enter mobile to be update: ");
			emp.setEmployeemobile(sc.nextLong());
			System.out.println("enter salary to be update: ");
			emp.setEmployeesalary(sc.nextDouble());
			System.out.println("enter id to update details: ");
			emp.setEmployeeid(sc.nextInt());
			OperationsPs operations2=new OperationsPs();
			int result2=operations2.updatedataWithPrepareStatement(emp);
			if(result2>0) {
				System.out.println("updated successfully");
			}else {
				System.out.println("updated unsuccessfully");
			}break;
			case 4:
				OperationsPs operations3=new OperationsPs();
				List<EmployeeSQL> response=operations3.ListOfEmployeedata();
				System.out.println("EmpId \t EmpName \t EmpMobile \t EmpSalary");
				System.out.println(emp.getEmployeeid()+"\t"+emp.getEmployeename()+"\t"+emp.getEmployeemobile()+"\t"+emp.getEmployeesalary());
				
		}
			
		}
		
	
}


}
