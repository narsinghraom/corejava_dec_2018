package com.vtalent.mahadev;

import com.vtalent.saichand.Employee;
import com.vtalent.saichand.EmployeeOperations;
import com.vtalent.saichand.Test;

public class EmployeeOperations {
	public static Employee[] empArray;

	public static void view() {
		System.out.println("1-Insert an Employee");
		System.out.println("2-Updata an Emploee");
		System.out.println("3-Delete an Employee");
		System.out.println("4-Searching an Employee");
		System.out.println("5-print all Employee Details");
		System.out.println("6-Exit");
	}

	public static void insertData(Employee emp) {
		if (empArray != null) {
			for (int i = 0; i <= empArray.length - 1; i++) {
				if (empArray[i] == null) {
					empArray[i] = emp;
					break;
				}
			}
		} else {
			System.out.println("already inserted");
		}
	}

	public static void upDateEmployeeData() {
		int count = 0;
		if (empArray != null) {
			System.out.println("enter Updated  EmployeeID:");
			int x = Test.input.nextInt();
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (x == emp.getEmployeeID()) {
						System.out.println("enter Salary:");
						int x1 = Test.input.nextInt();
						emp.setEmployeeSalary(x1);
						System.out.println("Ofter update "
								+ emp.getEmployeeID() + "    "
								+ emp.getEmployeeSalary());
						count = 1;
						break;
					} else {
						count++;
					}
				}
			}
			if (count == EmployeeOperations.empArray.length) {
				System.out.println("enter Valid ID to UPdate");
			}

		} else {
			System.out.println("1st Enter Data");
		}
	}

	public static void DeleteEmployeeData() {
		int Count = 0;
		if (empArray != null) {
			System.out.println("enter EmployeeID");
			int x = Test.input.nextInt();
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (x == emp.getEmployeeID()) {
						empArray[i] = null;
						System.out.println("Deleted Data");
						Test.z = EmployeeOperations.empArray.length;
						break;
					} else {
						Count = 2;
					}
				}
			}
			if (Count == 2) {
				System.out.println("Enter Correct Employee ID");
			}
		} else {
			System.out.println("1st enter Data");
		}
	}

	public static void searchEmployee() {
		int count = 0;
		if (empArray != null) {
			System.out.println("enter EmployeeID:");
			int x = Test.input.nextInt();
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (x == emp.getEmployeeID()) {
						System.out.println("EmployeeId:---"
								+ emp.getEmployeeID() + "  Salary:---"
								+ emp.getEmployeeSalary());
						count = 1;
						break;
					} else {
						count = 2;
					}
				}
			}
			if (count == 2) {
				System.out.println("Enter Valid ID");
			}

		} else {
			System.out.println("1st Insert Data");
		}
	}

	public static void printAllEmployeeData() {
		if (empArray != null) {
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					System.out.println(emp.getEmployeeID() + " "
							+ emp.getEmployeeSalary());
				}
			}
		} else {
			System.out.println("Not Data Not available to Print");
		}
	}


}
