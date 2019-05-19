package com.vtalent.amreen;

import java.util.Scanner;

public class EmployeeOperations {
	static EmployeeOperations[] emparray = new EmployeeOperations[5];
	static Scanner sc = new Scanner(System.in);
	static Employee emp = new Employee();
	int i;

	public void insertData() {
		{
			System.out.println("enter employee id");
			emp.setEmployeeId(sc.nextInt());

			System.out.println("enter employee salary");

			emp.setEmployeeSalary(sc.nextDouble());

		}

	}

	public void printData() {

		System.out.println(emp.getEmployeeId());
		System.out.println(emp.getEmployeeSalary());

	}
}
