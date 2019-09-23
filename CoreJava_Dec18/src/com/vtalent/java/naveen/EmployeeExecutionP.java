package com.vtalent.java.naveen;

import java.util.Scanner;

public class EmployeeExecutionP {
	// Employee em;
	Scanner sc = new Scanner(System.in);
	EmployeeBeanP emp[] = new EmployeeBeanP[3];

	public String insert() {
		System.out.println("enter your id");
		System.out.println("enter your salary");
		System.out.println("enter mobile number");
		EmployeeBeanP e = new EmployeeBeanP(sc.nextInt(), sc.nextDouble(), sc.nextLong());
		System.out.println("2nd employee");
		EmployeeBeanP e1 = new EmployeeBeanP(sc.nextInt(), sc.nextDouble(), sc.nextLong());
		System.out.println("3rd employee");
		EmployeeBeanP e2 = new EmployeeBeanP(sc.nextInt(), sc.nextDouble(), sc.nextLong());
		// e.setEmployeeId(sc.nextInt());
		// e.setEmployeesalary(sc.nextDouble());
		// e.setEmployeemobileno(sc.nextLong());
		emp[0] = e;
		System.out.println("emp array" + emp[0]);
		emp[1] = e1;
		emp[2] = e2;
		// emp[3]=e1;
		// emp[4]=e2;
		System.out.println(e.getEmployeeId() + "  " + e.getEmployeesalary() + "  " + e.getEmployeemobileno());
		System.out.println(emp[0]);
		System.out.println(emp[1]);
		System.out.println(emp[2]);

		// System.out.println(emp);
		return "recorded  success";
	}

	public String delete() {
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

	public String disply() {
		if (emp != null) {
			for (int i = 0; i <= emp.length - 1; i++) {
				System.out.println(emp[i]);
			}
		}
		return "Display all array elements";
	}

	public String searchEmployee() {
		System.out.println("enter  id");
		Integer id = sc.nextInt();

		for (int i = 0; i <= emp.length - 1; i++) {
			if (id.equals(emp[i].getEmployeeId())) {
				System.out.println(emp[i]);
			}
		}

		return "employee id ";
	}
}
