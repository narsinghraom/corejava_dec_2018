package com.example.jdbc.dao;

import com.example.jdbc.bean.Employee;

public interface DAO {
	public int createEmployee(Employee employee);
	public int updateEmployee(Employee employee);
	public int deleteEmployee(int employeeId);

}
