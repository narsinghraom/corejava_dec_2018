package com.vtalent.corejava.srinu;
import com.vtalent.corejava.srinu.*;

public class STest {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setEmployeeId(10);
		employee.setEmployeeName("srinu");
		employee.setEmployeeSalary(25000.00);
		employee.setEmployeeMobile(779977486);
		employee.setEmployeeAddress("bhadrachalam");
		
		Dao dao=new StatementDao();
		int result=dao.createEmployee(employee);
		System.out.println("successfully insertedd");
		//int result=dao.updateEmployee(employee);
		//int result=dao.deleteEmployee(employee);


		
	}

}
