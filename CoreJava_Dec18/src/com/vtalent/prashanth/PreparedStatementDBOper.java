package com.vtalent.prashanth;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.corba.se.spi.legacy.connection.GetEndPointInfoAgainException;

public class PreparedStatementDBOper {    
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	
	public PreparedStatementDBOper() {
		connection = MySQLConnection.getInstance();
	}
	
	public int insertDataWithPreparedStatement(EmployeeBean2 employee) {
		int result = 0;
		String query = "insert into Employee_table values(?,?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, employee.getEmployeeId());
			preparedStatement.setString(2, employee.getEmployeeName());
			preparedStatement.setDouble(3, employee.getEmployeeSalary());
			preparedStatement.setLong(4, employee.getEmployeeMobileNo());
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int deleteDataWithPreparedStatement(EmployeeBean2 employee) {
		int result1 = 0;
		String query = "delete from Employee_table where employeeName=?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, employee.getEmployeeName());
			result1 = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result1 ;
	}
	
	public int updateDataWithPreparedStatement(EmployeeBean2 employee) {
		int result2 = 0;
		String query = "update Employee_table set employeeName=? where employeeId=?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, employee.getEmployeeName());
			preparedStatement.setInt(2, employee.getEmployeeId());
			result2 = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result2 ;
	}
	
	public EmployeeBean2 searchDataWithPreparedStatement(EmployeeBean2 employee) {
		EmployeeBean2 emp = null;
		String query = "select * from Employee_table where employeeId=?";
		try {
			
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, employee.getEmployeeId());
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				emp = new EmployeeBean2();
				emp.setEmployeeId(resultSet.getInt(1));
				emp.setEmployeeName(resultSet.getString(2));
				emp.setEmployeeSalary(resultSet.getDouble(3));
				emp.setEmployeeMobileNo(resultSet.getLong(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	public List<EmployeeBean2> getAllEmployeeData() {
		List<EmployeeBean2> listOfEmployees = new ArrayList<EmployeeBean2>();
		String query = "select * from Employee_table";
		try {
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			EmployeeBean2 employeeBean = null;
			while(resultSet.next()) {
				employeeBean = new EmployeeBean2();
				employeeBean.setEmployeeId(resultSet.getInt(1));
				employeeBean.setEmployeeName(resultSet.getString(2));
				employeeBean.setEmployeeSalary(resultSet.getDouble(3));
				employeeBean.setEmployeeMobileNo(resultSet.getLong(4));
				listOfEmployees.add(employeeBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listOfEmployees ;
		
	}
	
	public static void main(String[] args) {
		
		PreparedStatementDBOper preparedStatementDBOper = new PreparedStatementDBOper();
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("Please select your choice: \r\n" +
					"1. insert Into Array.\r\n" + 
					"2. delete from my Array.\r\n" + 
					"3. Update an employee details.\r\n" +
					"4. Search an employee details.\r\n" +
					"5. Print all employee details.\r\n" +
					"6. Exit.");
			int scan = sc.nextInt();
			
			EmployeeBean2 employee = new EmployeeBean2();
			switch(scan) {
			case 1: 
				
				System.out.println("Enter the Employee Details: ");
				System.out.println("Enter Employee Id: ");
				employee.setEmployeeId(sc.nextInt());
				System.out.println("Enter Employee Name: ");
				employee.setEmployeeName(sc.next());
				System.out.println("Enter Employee Salary: ");
				employee.setEmployeeSalary(sc.nextDouble());
				System.out.println("Enter Mobile Number: ");
				employee.setEmployeeMobileNo(sc.nextLong());
				
				int result = preparedStatementDBOper.insertDataWithPreparedStatement(employee);
				if(result > 0) {
					System.out.println("Employee Data Inserted Successfully.");
				}else {
					System.out.println("Operation Failed, Please Try Again.");
				}
				break;
			case 2:
				
				System.out.println("Enter Employee Name to Delete: ");
				employee.setEmployeeName(sc.next());
				int result1 = preparedStatementDBOper.deleteDataWithPreparedStatement(employee);
				if(result1>0) {
					System.out.println("Employee Data Deleted Successfully.");
				}else {
					System.out.println("Operation Failed, Please Try Again.");
				}
				break;
			case 3: 
				
				System.out.println("Enter Employee Name to Update: ");
				employee.setEmployeeName(sc.next());
				System.out.println("Enter Employee Id for Upadating Name: ");
				employee.setEmployeeId(sc.nextInt());
				int result2 = preparedStatementDBOper.updateDataWithPreparedStatement(employee);
				if(result2>0) {
					System.out.println("Employee Data Updated Successfully.");
				}else {
					System.out.println("Operation Failed, Please Try Again.");
				}
				break;
			case 4:
				
				System.out.println("Enter Employee Id to be Search: ");
				employee.setEmployeeId(sc.nextInt());
				EmployeeBean2 emp1 = preparedStatementDBOper.searchDataWithPreparedStatement(employee);
				if(null != emp1) {
					System.out.println("Employee Data Searched Successfully.");
					System.out.println("employeeId \t employeeName \t employeeSalary \t employeeMobileNo");
					System.out.println(emp1.getEmployeeId()+" \t "+emp1.getEmployeeName()+" \t "+emp1.getEmployeeSalary()+" \t "+emp1.getEmployeeMobileNo());
				}else {
					System.out.println("Employee Id is Not Valid.");
				}
				break;
			case 5:
				
				List <EmployeeBean2> emp2 = preparedStatementDBOper.getAllEmployeeData();
				if(null != emp2) {
					System.out.println("employeeId \t employeeName \t employeeSalary \t employeeMobileNo");
					for(EmployeeBean2 em:emp2) {
						System.out.println(em.getEmployeeId()+" \t "+em.getEmployeeName()+" \t "+em.getEmployeeSalary()+" \t "+em.getEmployeeMobileNo());
					}
					System.out.println("Employee Data Searched Successfully.");
				}else {
					System.out.println("Employee Id is Not Valid.");
				}
				break;
			case 6:
				
				System.exit(0);
			default: System.out.println("Please give a valid Input: ");
			
			}
		}
	}

}
