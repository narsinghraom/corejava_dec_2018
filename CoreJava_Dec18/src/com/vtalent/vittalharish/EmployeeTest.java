package com.vtalent.vittalharish;

import java.util.Scanner;

import com.vtalent.raju.Employee;

public class EmployeeTest {

	static Scanner input = new Scanner(System.in);

	public void insertData() {
		System.out.println("Enter No Of Employees to Be Stored.");
		int size = input.nextInt();

		EmployeeOperations.emparray = new Employee[size];

		for (int i = 0; i <= size - 1; i++) {

			System.out.println("Enter " + (i + 1) + " EmployeeData ");
			Employee emp = new Employee();
			System.out.println("Enter Id:");
			emp.setEmployeeId(input.nextInt());

			System.out.println("Enter Salary:");
			emp.setEmployeeSalary(input.nextDouble());

			EmployeeOperations.insertData(emp);

		}

	}

	public static void main(String[] args) {
		EmployeeTest empt = new EmployeeTest();
		EmployeeOperations empo = new EmployeeOperations();
		Scanner input = new Scanner(System.in);

		for (;;) {
			System.out.println("1.Insert an Employee." + '\n' + "2.Update an Employee." + '\n' + "3.Delete an Employee"
					+ '\n' + "4.Search an Employee" + '\n' + "5.Print All the Employee Data" + '\n' + "6.Exit");
			int employee = input.nextInt();

			switch (employee) {
			
			case 1: empt.insertData();
			break;
			
			case 2: empo.updateData();
			break;
			
			case 3: empo.deleteEmployee();
			break;
			
			case 4: empo.searchData();
			break;
			
			case 5: empo.printAllData();
			break;
			
			case 6: 
				break;
				
			default :
				System.out.println("Enter Valid Search"+'\n');
			
			
			
			}
		}

	}
}
