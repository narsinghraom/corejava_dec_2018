package com.vtalent.corejava.srinu;
import com.vtalent.corejava.srinu.Employee;
public interface Dao {
public int createEmployee(Employee employee);
public int updateEmployee(Employee employee);
public int deleteEmployee(int employeeId);
}
