package com.example.main;

import com.example.jdbc.bean.Employee;
import com.example.jdbc.dao.DAO;
import com.example.jdbc.statement.StatementDAO;

public class JdbcTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmployeeId(300);
		employee.setEmployeeName("charan");
		employee.setEmployeeSalary(25000);
		employee.setEmployeeMobile(999989);
		employee.setEmployeeAddress("vizag");
		DAO dao = new StatementDAO();
		//int result = dao.createEmployee(employee);
		//int result = dao.updateEmployee(employee);
		int result = dao.deleteEmployee(200);
		System.out.println(result  +"Inserted successfully");
		
		

	}
}
