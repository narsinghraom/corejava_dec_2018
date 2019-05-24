package com.vtalent.mahadev1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter no of employee to input");
		int size = input.nextInt();
		EmployeeOperations .empArray = new Employee[size];
		for (int i = 0; i <= size - 1; i++) {
			System.out.print("enter  " + (i+1) + "  employeedata");
			Employee emp = new Employee();
			System.out.println("enterid");
			emp.setEmployeeId(input.nextInt());
			System.out.println("enter salary");
			emp.setEmployeeSalary(input.nextDouble());
			EmployeeOperations.insertData(emp);
			

		}
		

	}
}