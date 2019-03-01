package com.vtalent.sravani;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {

	public static void main(String[] args) {
		
		boolean exit = false;
		ArrayList<Employee> employees = new ArrayList<Employee>();
		while (!exit) {
			System.out.println("please enter the option ");
			System.out.println("1. Create");
			System.out.println("2. View");
			System.out.println("3. Delete");
			System.out.println("4. Exit");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();

			switch (id) {
			case 1:

				System.out.println("Enter Employee ID :: ");
				int empId = sc.nextInt();
				System.out.println("Enter Employee Salary :: ");
				long salary = sc.nextLong();

				Employee emp = new Employee(empId, salary);
				employees.add(emp);
				break;
			case 2:
				System.out.println(employees);
				break;

			case 3:
				System.out.println("Enter Employee Id to delete :: ");
				empId = sc.nextInt();

				for (Employee employee : employees) {
					if (empId == employee.getId()) {
						employees.remove(employee);
						break;
					}
				}

				break;
			case 4:
				exit = true;
				break;

			default:
				System.out.println("InValid option...");
				break;
			}
		}
	}
}
