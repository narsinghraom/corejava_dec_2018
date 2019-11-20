package com.vtalent.java.mahesh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DBOperationswithpreparedstatement {
	static Scanner in = new Scanner(System.in);
	Connection connection;
	PreparedStatement pstatement;
	ResultSet resultSet;
	
	public DBOperationswithpreparedstatement() {
		connection=MySQLConnection.getInstance();
	}
	public int insertdataWithPreparedStatement(EmplyBean empsql) {
		int result=0;
		String query="insert into employee values(?,?,?,?)";
		try {
		pstatement=connection.prepareStatement(query);
		pstatement.setInt(1, empsql.getEmpid());
		pstatement.setString(2,empsql.getEmpname());
		pstatement.setDouble(3,empsql.getEmpsal());
		pstatement.setLong(4,empsql.getEmpmobnum());
		result=pstatement.executeUpdate();
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return result;
	}
	public int deletedataWithPrepareStatement(EmplyBean empsql) {
		int result=0;
		String query="delete from employee where id=?";
		try {
			pstatement=connection.prepareStatement(query);
			pstatement.setInt(1, empsql.getEmpid());
			result=pstatement.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return result;	
	}
	
	public int updatedataWithPrepareStatement(EmplyBean empsql) {
		int result=0;
		String query="update employee set name=?,mobileno=?,salary=? where id=?";
		try {
			pstatement=connection.prepareStatement(query);
			pstatement.setString(1, empsql.getEmpname());
			pstatement.setDouble(2, empsql.getEmpsal());
			pstatement.setLong(3, empsql.getEmpmobnum());
			pstatement.setInt(4,empsql.getEmpid());
			result=pstatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public List<EmplyBean> ListOfEmployeedata(){
		List<EmplyBean>  listofemployeedata=new ArrayList<EmplyBean>();
		String query="select * from employee";
		try {
			pstatement=connection.prepareStatement(query);
			resultSet=pstatement.executeQuery();
			EmplyBean empsql=null;
			while(resultSet.next()) {
				EmplyBean empsql1=new EmplyBean();
				empsql1.setEmpid(resultSet.getInt(1));
				empsql1.setEmpname(resultSet.getString(2));
				empsql1.setEmpmobnum(resultSet.getLong(4));
				empsql1.setEmpsal(resultSet.getDouble(3));
				listofemployeedata.add(empsql1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listofemployeedata;	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmplyBean emp=new EmplyBean();
		for(;;) {
			System.out.println("please select your choice.\n"
					+"1.insert an employee.\n"
					+"2.delete an employee.\n"
					+"3.update an employee.\n"
					+"4.Print the table.\n"
					+"5.exit.");
			int scan=sc.nextInt();
			switch(scan) {
			case 1:
				System.out.println("Enter employee details");
				System.out.println("Enter employeeid");
				emp.setEmpid(sc.nextInt());
				System.out.println("Enter employeename");
				emp.setEmpname(sc.next());
				System.out.println("Enter employeemobile");
				emp.setEmpmobnum(sc.nextLong());
				System.out.println("Enter employeesalary");
				emp.setEmpsal(sc.nextDouble());
				DBOperationswithpreparedstatement operations=new DBOperationswithpreparedstatement();
				int result=operations.insertdataWithPreparedStatement(emp);
				if(result>0) {
					System.out.println("Inserted successfully!!!");
				}else {
				System.out.println("Insert Operation failed try again");		
					}
				break;
				
			case 2:
				System.out.println("enter employee id of the row to be deleted");
				emp.setEmpid(sc.nextInt());
				DBOperationswithpreparedstatement operations1=new DBOperationswithpreparedstatement();
				int result1=operations1.deletedataWithPrepareStatement(emp);
				if(result1>0) {
					System.out.println("Deleted succesfully!!!");
				}else {
					System.out.println("Delete Operation failed try again");
				}
				break;
				case 3:
				System.out.println("enter name to be update: ");
				emp.setEmpname(sc.next());
				System.out.println("enter mobile to be update: ");
				emp.setEmpmobnum(sc.nextLong());
				System.out.println("enter salary to be update: ");
				emp.setEmpsal(sc.nextDouble());
				System.out.println("enter id of the employee to update details: ");
				emp.setEmpid(sc.nextInt());
				DBOperationswithpreparedstatement operations2=new DBOperationswithpreparedstatement();
				int result2=operations2.updatedataWithPrepareStatement(emp);
				if(result2>0) {
					System.out.println("updated successfully");
				}else {
					System.out.println("Update Operation failed try again");
				}break;
				case 4:
					DBOperationswithpreparedstatement operations3=new DBOperationswithpreparedstatement();
					List<EmplyBean> response=operations3.ListOfEmployeedata();
					 System.out.println("EmpId\tEmpName \tEmpSalary \tEmpMobileno"); 
					 for(EmplyBean emp1:response){ 
						 System.out.println(emp1.getEmpid()+"\t"+emp1.getEmpname()+"\t\t"+emp1.getEmpsal()+"\t\t"+emp1.getEmpmobnum()); 
						 }
					 break;
				case 5:
					System.exit(0);
			}	
			}
			
		}
}
