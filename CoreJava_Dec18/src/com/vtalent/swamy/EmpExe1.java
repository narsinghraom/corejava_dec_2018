package com.vtalent.swamy;
import java.util.Scanner;
public class EmpExe1 {
		// Employee em;
		Scanner sc = new Scanner(System.in);
		EmpBeen1 emp[] = new EmpBeen1[3];

		public String insert() {
			System.out.println("enter your id");
			System.out.println("enter your salary");
			System.out.println("enter mobile number");
			EmpBeen1 e = new EmpBeen1(sc.nextInt(), sc.nextDouble(), sc.nextLong());
			System.out.println("2nd employee");
			EmpBeen1 e1 = new EmpBeen1(sc.nextInt(), sc.nextDouble(), sc.nextLong());
			System.out.println("3rd employee");
			EmpBeen1 e2 = new EmpBeen1(sc.nextInt(), sc.nextDouble(), sc.nextLong());
			// e.setEmployeeId(sc.nextInt());
			// e.setEmployeesalary(sc.nextDouble());
			// e.setEmployeemobileno(sc.nextLong());
			emp[0] = e;
		//	System.out.println("emp array" + emp[0]);
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
			for (int i= 0; i <= emp.length - 1; i++) {
				if (n.equals(emp[i].getEmployeeId())) {
					emp[i] = null;
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

