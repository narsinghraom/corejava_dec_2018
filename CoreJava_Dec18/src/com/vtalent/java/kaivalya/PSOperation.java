package com.vtalent.java.kaivalya;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.PreparedStatement;
import com.mysql.jdbc.Connection;
import com.vtalent.jdbc.EmployeeBean;


public class PSOperation 
{
Connection connection;
PreparedStatement preparedstatement;
ResultSet resultset;
public PSOperation()
{
	connection=MySqlConnection.getInstance();
}
public int insertdatawithPrepareStatement(Employeeps employee)
{
	int result=0;
	
	String query="insert into employee values(?,?,?)";
	try {
		preparedstatement=connection.prepareStatement(query);
		preparedstatement.setInt(1,employee.getEmpid());
		preparedstatement.setString(2,employee.getEmpname());
		preparedstatement.setDouble(3,employee.getEmpsalary());
		result=preparedstatement.executeUpdate();
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return result;
	
}
public int deletedatawithPrepareStatement(Employeeps employee)
{
	int result=0;
	String query="delete from employee where id=?";
	try
	{
		preparedstatement=connection.prepareStatement(query);
		preparedstatement.setInt(1,employee.getEmpid());
		result=preparedstatement.executeUpdate();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return result;
}
public int updatedatawithstatement(Employeeps employee)
{
	int result=0;
	String query="update Employee set name=?,salary=? where id=?";
	try
	{
		preparedstatement=connection.prepareStatement(query);
		preparedstatement.setInt(1,employee.getEmpid());
		preparedstatement.setString(2,employee.getEmpname());
		preparedstatement.setDouble(3,employee.getEmpsalary());
		result=preparedstatement.executeUpdate();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return result;
}
public List<Employeeps> ListofEmployeedata(){

	List<Employeeps>  listofemployeedata=new ArrayList<Employeeps>();
	String query="select * from Employee";
	try {
		preparedstatement=connection.prepareStatement(query);
		resultset=preparedstatement.executeQuery();
		Employeeps employee1=null;
		while(resultset.next()) {
			employee1=new Employeeps();
			employee1.setEmpid(resultset.getInt(1));
			employee1.setEmpname(resultset.getString(2));
			employee1.setEmpsalary(resultset.getDouble(3));
			listofemployeedata.add(employee1);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return listofemployeedata;
		
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Employeeps emp=new Employeeps();
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
			emp.setEmpid(sc.nextInt());
			System.out.println("Enter employeename");
			emp.setEmpname(sc.next());
			System.out.println("Enter employeemobile");
			emp.setEmpsalary(sc.nextDouble());
			PSOperation operations=new PSOperation();
			int result=operations.insertdatawithPrepareStatement(emp);
			if(result>0) {
				System.out.println("Inserted successfully!!!");
			}else {
			System.out.println("Operation failed try again");		
				}
			break;
			
		case 2:
			System.out.println("enter data to be deleted");
			emp.setEmpid(sc.nextInt());
			PSOperation operations1=new PSOperation();
			int result1=operations1.deletedatawithPrepareStatement(emp);
			if(result1>0) {
				System.out.println("Deleted succesfully!!!");
			}else {
				System.out.println("Deleted unsuccessfully");
			}
			break;
			case 3:
			System.out.println("enter name to be update: ");
			emp.setEmpname(sc.next());
			System.out.println("enter mobile to be update: ");
			emp.setEmpsalary(sc.nextDouble());
			System.out.println("enter id to update details: ");
			emp.setEmpid(sc.nextInt());
			PSOperation operations2=new PSOperation();
			int result2=operations2.updatedatawithstatement(emp);
			if(result2>0) {
				System.out.println("updated successfully");
			}else {
				System.out.println("updated unsuccessfully");
			}break;
			case 4:
				PSOperation  operations3=new PSOperation();
				List<Employeeps> response=operations3.ListofEmployeedata();
				System.out.println("EmpId \t EmpName \t EmpMobile");
				for(Employeeps emp1:response) 
				System.out.println(emp1.getEmpid()+"\t"+emp1.getEmpname()+"\t"+emp1.getEmpsalary());
				
		}
			
		}
		
	}

	
}



