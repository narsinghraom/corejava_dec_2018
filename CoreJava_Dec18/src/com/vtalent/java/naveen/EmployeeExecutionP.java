package com.vtalent.java.naveen;

import java.io.Serializable;
import java.util.Scanner;

public class EmployeeExecutionP implements Serializable {
	// Employee em;

	static Scanner sc = new Scanner(System.in);

	static int sa = sc.nextInt();
	public static EmployeeBeanP emp[] = new EmployeeBeanP[sa];
	//  /* In this method follows as insert the employee data into the array */
	public static int insert(EmployeeBeanP employee) {

		int result = 0;
		for (int i = 0; i <= emp.length - 1; i++) {
			if (emp[i] == null) {
				emp[i] = employee;
				result++;
				System.out.println(emp[i]);
				break;
			}
		}
		return result;
	}

	public static String delete() {
		System.out.println("enter delete id");
		Integer n = sc.nextInt();
		for (int j = 0; j <= emp.length - 1; j++) {
			if (n.equals(emp[j].getEmployeeId())) {
				emp[j] = null;
			}

		}
		if (emp != null) {
			for (int k = 0; k <= emp.length - 1; k++) {
				System.out.println(emp[k]);
			}
		}

		return "deleted";

	}

	public static String disply() {
		if (emp != null) {
			for (int i = 0; i <= emp.length - 1; i++) {
				System.out.println(emp[i]);
			}
		}
		return "Display all array elements";
	}

	public static String searchEmployee() {
		System.out.println("enter  id");
		Integer id = sc.nextInt();

		for (int i = 0; i <= emp.length - 1; i++) {
			if (id.equals(emp[i].getEmployeeId())) {
				System.out.println(emp[i]);
			}
		}

		return "employee id ";
	}

	public static int update() {
		EmployeeBeanP e = null;
		String da = "n";
		System.out.println("enter  id ");
		Integer id = sc.nextInt();
		for (int i = 0; i <= emp.length - 1; i++) {
			if (id.equals(emp[i].getEmployeeId())) {
				System.out.println(emp[i]);

				System.out.println("do you want to update name  press 'y'  ");
				da = sc.next();

				if (da.equalsIgnoreCase("y")) {
					e = new EmployeeBeanP();
					System.err.println("please enter employee name");
					emp[i].setEmployeeename(sc.next());
				}
				System.out.println("Do you  want to change id press 'y' ");
				String ss = "n";
				ss = sc.next();
				if (da.equalsIgnoreCase("n")) {
					e = new EmployeeBeanP();
					System.err.println("please enter employee id");
					emp[i].setEmployeeId(sc.nextInt());
				}
				String na = "no";
				System.out.println("Do you want to update salary press'y' ");
				na = sc.next();
				if (na.equalsIgnoreCase("y")) {
					e = new EmployeeBeanP();
					System.err.println("please enter employee salary");
					emp[i].setEmployeesalary(sc.nextDouble());
				}
				System.out.println("Do you want to change mobile number press 'y' ");
				String vs = "n";
				vs = sc.next();
				if (vs.equalsIgnoreCase("y")) {
					e = new EmployeeBeanP();
					System.err.println("please enter employee mobile number");
					emp[i].setEmployeemobileno(sc.nextLong());
				} else {
					System.out.println("employee mobile number as same ");
				}
				searchEmployee();
				break;

			}

		}
		/*
		 * int k = 0; for (int i = 0; i <= emp.length - 1; i++) { if (emp == null) { //
		 * emp[i] = employee; System.out.println(emp[i]); k++; } }
		 */
		return 0;
	}
}
