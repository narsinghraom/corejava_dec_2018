package com.vtalent.java.srikarreddy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vtalent.prashanth.EmployeeBean2;

public class Operations {
	
	Connection connection;
	Statement statement;
	PreparedStatement pStatement;
	ResultSet resultSet;
	
	public Operations() {
		connection = MysqlConnection.getInstance();
	}
	public int deleteDataWithPreparedStatement(Employee employee) {
		int result1 = 0;
		String query = "delete from Employee where employeeName=?";
		try {
			pStatement = connection.prepareStatement(query);
			pStatement.setString(1, employee.getEmployeeName());
			result1 = pStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result1 ;
	}
	public int updateDataWithPreparedStatement(Employee employee) {
		int result2 = 0;
		String query = "update Employee set employeeName=? where employeeId=?";
		try {
			pStatement = connection.prepareStatement(query);
			pStatement.setString(1, employee.getEmployeeName());
			pStatement.setInt(2, employee.getEmployeeId());
			result2 = pStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result2 ;
	}
	public Employee getEmployeeData(int employeeId) {
		Employee employee = null; 
		String query = "select employeeName, employeeSalary from employee where employeeId = ?";
		try {
			pStatement = connection.prepareStatement(query);
			pStatement.setInt(1, employeeId);
			resultSet=pStatement.executeQuery();
			while(resultSet.next()) {
				employee= new Employee();
				employee.setEmployeeId(employeeId);
				employee.setEmployeeName(resultSet.getString(1));
				employee.setEmployeeSalary(resultSet.getDouble(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}
	
	public List<Employee> getAllEmployeeData(){
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		String query = "select * from employee";
		try {
			pStatement = connection.prepareStatement(query);
			resultSet =	pStatement.executeQuery();
			Employee employeeBean= null;
			while(resultSet.next()) {
			 employeeBean=new Employee();
			 employeeBean.setEmployeeId(resultSet.getInt(1));
			 employeeBean.setEmployeeName(resultSet.getString(2));
			 employeeBean.setEmployeeSalary(resultSet.getDouble(3));
			 listOfEmployees.add(employeeBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listOfEmployees;
	}
	
	public int insertDataWithPreparedStatement(Employee employee) {
		int result = 0;
		String query = "insert into employee values(?,?,?)";
		try {
			pStatement= connection.prepareStatement(query);
			pStatement.setInt(1, employee.getEmployeeId());
			pStatement.setString(2, employee.getEmployeeName());
			pStatement.setDouble(3, employee.getEmployeeSalary());
			result = pStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static void main(String[] args) {
		Operations dbOperations = new Operations();
		Employee employee = new Employee();
		Scanner rd = new Scanner(System.in);
	
		for(;;) {
		System.out.println("please enter your choice\n"
				+"1.insert an employee.\n"
				+"2.delete from employee.\n"
				+"3.update employee details from employee.\n"
				+"4.search.\n"
				+"5.print all employee list.\n"
				+"6.exit.");
		 
		int n=rd.nextInt();
		switch(n) {
		case 1:
			System.out.println("Enter the Employee Details: ");
			System.out.println("Enter Employee Id: ");
			employee.setEmployeeId(rd.nextInt());
			System.out.println("Enter Employee Name: ");
			employee.setEmployeeName(rd.next());
			System.out.println("Enter Employee Salary: ");
			employee.setEmployeeSalary(rd.nextDouble());
		  int result = dbOperations.insertDataWithPreparedStatement(employee);
			 if(result>0) {
			  System.out.println("Insert Sucessfully"); }
			 else {
			  System.out.println("Operation failed please try again"); }
			break;
		case 2:
			
			System.out.println("Enter Employee Name to Delete: ");
			employee.setEmployeeName(rd.next());
			int result1 = dbOperations.deleteDataWithPreparedStatement(employee);
			if(result1>0) {
				System.out.println("Employee Data Deleted Successfully.");
			}else {
				System.out.println("Operation Failed, Please Try Again.");
			}
			break;
		case 3: 
			
			System.out.println("Enter Employee Name to Update: ");
			employee.setEmployeeName(rd.next());
			System.out.println("Enter Employee Id for Upadating Name: ");
			employee.setEmployeeId(rd.nextInt());
			int result2 =dbOperations.updateDataWithPreparedStatement(employee);
			if(result2>0) {
				System.out.println("Employee Data Updated Successfully.");
			}else {
				System.out.println("Operation Failed, Please Try Again.");
			}
			break;
		case 4:
		System.out.println("Enter Employee Id to pull the data");
		int employeeId = rd.nextInt();
		Employee employee1 = dbOperations.getEmployeeData(employeeId);
		if(null != employee1) {
			System.out.println("EmpId \t EmpName \t EmpSalary");
			System.out.println(employee1.getEmployeeId() +"\t"+employee1.getEmployeeName()+"\t"+employee1.getEmployeeSalary());
		}else {
			System.out.println("Employee Id Not Valid");
		}
		break;
		
		case 5:
		  List<Employee> response= dbOperations.getAllEmployeeData();
		  System.out.println("EmpId \t EmpName \t EmpSalary");
		  for(Employee   employee2:response)
		 { System.out.println(employee2.getEmployeeId()
		  +"\t"+employee2.getEmployeeName()+"\t"+employee2.getEmployeeSalary()); }
         break;
		 
		
	}
	}
		}
	}