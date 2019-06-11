package com.vtalent.vittalharish;

import java.util.Scanner;

import com.vtalent.raju.Employee;

class EmployeeOperations {

	static Employee[] emparray;

	Scanner input = new Scanner(System.in);

	public static void insertData(Employee emp) {
		if (emparray != null) {
			for (int i = 0; i <= emparray.length - 1; i++) {
				if (emparray[i] == null) {
					emparray[i] = emp;

					break;
				}

			}
			System.out.println("Sucessfully Inserted." + '\n');
		}

		else {
			System.out.println("Already Inserted." + '\n');

		}

	}

	public void printAllData() {
		if (emparray != null) {
			for (int i = 0; i <= emparray.length - 1; i++) {
				Employee emp1 = emparray[i];
				System.out.println(emp1.getEmployeeId() + "   " + emp1.getEmployeeSalary());

			}
		} else {
			System.out.println("Insert the Employee Data first" + '\n');
		}
	}

	public void updateData() {
		if (emparray != null) {
			Employee emp1;
			for (int i = 0; i <= emparray.length - 1; i++) {
				emp1 = emparray[i];
				System.out.println(emp1.getEmployeeId() + "   " + emp1.getEmployeeSalary());
			}

			System.out.println("Enter the Id to be Updated" + '\n');
			int x = input.nextInt();
			for (int i = 0; i <= emparray.length - 1; i++) {
				Employee emp2;
				emp2 = emparray[i];
				if (x == emp2.getEmployeeId()) {
					System.out.println("Enter the new Salary to be Updated" + '\n');
					emp2.setEmployeeSalary(input.nextDouble());
				}
			}
		}

		else {
			System.out.println("First Insert Employee Data" + '\n');
		}
	}

	public void searchData() {
		if (emparray != null) {
			System.out.println("Enter the Employee_Id:");
			Employee emp1;
			int x = input.nextInt();
			for (int i = 0; i <= emparray.length - 1; i++) {
				emp1 = emparray[i];
				if (x == emp1.getEmployeeId()) {
					System.out.println("Employee_Id- " + emp1.getEmployeeId() + '\n' + "Employee_Salary- "
							+ emp1.getEmployeeSalary());
				} else {
					System.out.println("Enter the Valid Id" + '\n');
				}
			}
		} else {
			System.out.println("Insert the Employee Data first" + '\n');
		}
	}

	public void deleteEmployee() {
		if (emparray != null) {
			Employee emp1;
			for (int i = 0; i <= emparray.length - 1; i++) {
				emp1 = emparray[i];
				System.out.println(emp1.getEmployeeId());

			}
			System.out.println("Enter the Id to be Deleted");
			int x = input.nextInt();
			for (int i = 0; i <= emparray.length - 1; i++) {
				emp1 = emparray[i];
				if (x == emp1.getEmployeeId()) {
					emparray[i] = null;
					System.out.println("Deleted");
				}

			}

		} else {
			System.out.println("No Data Found" + '\n');
		}

	}

}
