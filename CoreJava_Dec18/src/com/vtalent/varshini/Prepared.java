package com.vtalent.varshini;

import java.sql.*;
import java.util.*;

public class Prepared {
	Connection connection;
	PreparedStatement preparestatement;
	ResultSet resultSet;
	
public Prepared() {
	connection=MySQLConnection.getInstance();
}
public int insertdataWithPrepareStatement(JdbcBean jdbc) {
	int result=0;
	String query="insert into EmployeeSQL values(?,?,?,?)";
	try {
	preparestatement=connection.prepareStatement(query);
	preparestatement.setInt(1, jdbc.getEmployeeId());
	preparestatement.setString(2,jdbc.getEmployeeName());
	preparestatement.setLong(3,jdbc.getEmployeeSalary());
	result=preparestatement.executeUpdate();
}catch(SQLException e) {
	e.printStackTrace();
}
return result;
}
public int deletedataWithPrepareStatement(JdbcBean jdbc) {
	int result=0;
	String query="delete from EmployeeSQL where Employeeid=?";
	try {
		preparestatement=connection.prepareStatement(query);
		preparestatement.setInt(1, jdbc.getEmployeeId());
		result=preparestatement.executeUpdate();
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return result;	
}
public int updatedataWithPrepareStatement(JdbcBean jdbc) {
	int result=0;
	String query="update EmployeeSQL set Employeename=?,Employeemobile=?,Employee=? where EmployeeId=?";
	try {
		preparestatement=connection.prepareStatement(query);
		preparestatement.setInt(1, jdbc.getEmployeeId());
		preparestatement.setString(3, jdbc.getEmployeeName());
		preparestatement.setDouble(4,jdbc.getEmployeeSalary());
		result=preparestatement.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return result;
}
public List<JdbcBean> ListOfEmployeedata(){
	List<JdbcBean>  listofemployeedata=new ArrayList<JdbcBean>();
	String query="select * from employee";
	try {
		preparestatement=connection.prepareStatement(query);
		resultSet=preparestatement.executeQuery();
		JdbcBean jdbc=null;
		while(resultSet.next()) {
			JdbcBean empsql1=new JdbcBean();
			empsql1.setEmployeeId(resultSet.getInt(1));
			empsql1.setEmployeeName(resultSet.getString(2));
			empsql1.setEmployeeSalary(resultSet.getLong(4));
			listofemployeedata.add(empsql1);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return listofemployeedata;
	
	
}
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	JdbcBean jdbc=new JdbcBean();
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
			jdbc.setEmployeeId(sc.nextInt());
			System.out.println("Enter employeename");
			jdbc.setEmployeeName(sc.next());
			System.out.println("Enter employeemobile");
			jdbc.setEmployeeSalary(sc.nextLong());
			System.out.println("Enter employeesalary");
			jdbc.setEmployeeSalary(sc.nextLong());
			Prepared operations=new Prepared();
			int result=operations.insertdataWithPrepareStatement(jdbc);
			if(result>0) {
				System.out.println("Inserted successfully!!!");
			}else {
			System.out.println("Operation failed try again");		
				}
			break;
			
		case 2:
			System.out.println("enter data to be deleted");
			jdbc.setEmployeeId(sc.nextInt());
			Prepared operations1=new Prepared();
			int result1=operations1.deletedataWithPrepareStatement(jdbc);
			if(result1>0) {
				System.out.println("Deleted succesfully!!!");
			}else {
				System.out.println("Deleted unsuccessfully");
			}
			break;
		case 3:
			System.out.println("enter name to be update: ");
			jdbc.setEmployeeName(sc.next());
			System.out.println("enter salary to be update: ");
			jdbc.setEmployeeSalary(sc.nextLong());
			System.out.println("enter id to update details: ");
			jdbc.setEmployeeId(sc.nextInt());
			Prepared operations2=new Prepared();
			int result2=operations2.updatedataWithPrepareStatement(jdbc);
			if(result2>0) {
				System.out.println("updated successfully");
			}else {
				System.out.println("updated unsuccessfully");
			}break;
			case 4:
				Prepared operations3=new Prepared();
				List<JdbcBean> response=operations3.ListOfEmployeedata();
				System.out.println("EmpId \t EmpName \t EmpMobile \t EmpSalary");
				System.out.println(jdbc.getEmployeeId()+"\t"+jdbc.getEmployeeName()+"\t"+jdbc.getEmployeeName()+"\t"+jdbc.getEmployeeSalary());
				
		}
			
		}
	}
}


