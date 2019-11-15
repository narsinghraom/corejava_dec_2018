package com.vtalent.java.mahesh;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DBOperations {
	static Scanner input = new Scanner(System.in);
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	
	public DBOperations() {
		connection = MySQLConnection.getInstance();
	}
	public List<EmployBean> getAllEmployeeData(){
		List<EmployBean> listOfEmployees = new ArrayList<EmployBean>();
		String query = "select * from employee";
		try {
			statement = connection.createStatement();
			resultSet =	statement.executeQuery(query);
			EmployBean empBean= null;
			while(resultSet.next()) {
			 empBean=new EmployBean();
			 empBean.setEmpid(resultSet.getInt(1));
			 empBean.setEmpname(resultSet.getString(2));
			 empBean.setEmpsal(resultSet.getDouble(3));
			 empBean.setEmpmobnum(resultSet.getLong(4));
			 listOfEmployees.add(empBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listOfEmployees;
	}
	public int InsertData(EmployBean empBean) {
		int result = 0;
		String insertquery = "insert into employee values("+empBean.getEmpid()+",'"+empBean.getEmpname()+"',"+empBean.getEmpsal()+","+empBean.getEmpmobnum()+")";
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(insertquery);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int DeleteData(EmployBean empBean){
		int rest=0;
		String deletequery="delete from employee where id="+empBean.getEmpid();
		try {
			statement = connection.createStatement();
			rest = statement.executeUpdate(deletequery);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return rest;	
	}
	
	public int UpdateData(EmployBean empBean){
		int res=0;
		String updatequery="update employee set name='"+empBean.getEmpname()+"',mobileno="+empBean.getEmpmobnum()+",salary="+empBean.getEmpsal()+" where id="+empBean.getEmpid();
		try {
			statement = connection.createStatement();
			res = statement.executeUpdate(updatequery);
		} catch (SQLException e2){
			e2.printStackTrace();
		}
		return res;
	}

	public static void main(String[] args) {
		EmployBean employee = new EmployBean();
		DBOperations dbo = new DBOperations();
		for (;;) {
			System.out.println("please select your choice:\n" + 
					 "1.insert an employee.\n"
					+"2.delete an employee.\n"
					+"3.Update an employee.\n"
					+"4.print the table.\n"
					+ "5.Exit.");
			int scan = input.nextInt();
		switch (scan) {
		case 1:
		System.out.println("Enter the employee Details");
		System.out.println("Enter Employee Id");
		employee.setEmpid(input.nextInt());
		System.out.println("Enter employee Name");
		employee.setEmpname(input.next());
		System.out.println("enter employee Salary");
		employee.setEmpsal(input.nextDouble());
		System.out.println("enter employee Mobile Number");
		employee.setEmpmobnum(input.nextLong());
		int result = dbo.InsertData(employee);
		if(result>0) {
			System.out.println("Insert Sucessfully");
		}else {
			System.out.println("insertion failed please try again");
		}
		break;
		case 2:
			System.out.println("Please enter id of an employee whose details are to be deleted:");
			employee.setEmpid(input.nextInt());
			int rest=dbo.DeleteData(employee);
			if(rest>0){
				System.out.println("Deleted sucessfully");
				}else{
					System.out.println("Delete Operation failed please try again");
				}
			break;
		case 3:
			System.out.println("Please enter id of an employee whose details are to be updated:");
			employee.setEmpid(input.nextInt());
			System.out.println("Enter the employee Details");
			System.out.println("Enter employee Name");
			employee.setEmpname(input.next());
			System.out.println("enter employee Salary");
			employee.setEmpsal(input.nextDouble());
			System.out.println("enter employee Mobile Number");
			employee.setEmpmobnum(input.nextLong());
			int res=dbo.UpdateData(employee);
			if(res>0){
				System.out.println("updated sucessfully");
				}else{
				System.out.println("Update operation failed please try again");
				}
			break;
		case 4:
			List<EmployBean> response= dbo.getAllEmployeeData();
			 System.out.println("EmpId\tEmpName \tEmpSalary \tEmpMobileno"); 
			 for(EmployBean emp:response){ 
				 System.out.println(emp.getEmpid()+"\t"+emp.getEmpname()+"\t\t"+emp.getEmpsal()+"\t\t"+emp.getEmpmobnum()); 
				 }
			break;
		case 5:
			System.exit(0);
		}	
	}
	}
}
