package com.vtalent.tarun.basics.employee;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter EmployeeID: ");
		int employeeID = s.nextInt();
		System.out.println("Enter EmployeeName: ");
		String employeeName = s.next();
		Employee emp = new Employee();
		emp.setEmployeeID(employeeID);
		emp.setEmpoyeeName(employeeName);
		DAOOperations dao = new DAOOperations();
		int stmtResult = dao.insertDataWithStatement(emp);
		int prepareResult = dao.insertDataWithPrepared(emp);
		if (stmtResult == 1) {
			System.out.println("Inserted succesfully");
		}
		else {
			System.out.println("Try Again");
		}
	}

}
