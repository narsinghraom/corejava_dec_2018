package com.vtalent.java.naveen;
import java.util.Scanner;

public class EmployeeTestP  {

	public static void main(String[] args) {
		String s = "n";
		// EmployeeExecutionP ee = new EmployeeExecutionP();
		Scanner sc = new Scanner(System.in);
		EmployeeBeanP e;
		do {
			System.out.println("1. insert Into Array");
			System.out.println("2.delete from my Array");
			System.out.println("3. Search an employee from my Array");
			System.out.println(" 4.Print All the employees from my Array");
			System.out.println("5.update employee");
			System.out.println("6.Exit");
			System.out.println("please choose your option");
			int i = sc.nextInt();
			if (i <= 6) {
				switch (i) {
				case 1:
					System.out.println("enter array size");
					EmployeeExecutionP ee = new EmployeeExecutionP();
					for (int i1 = 0; i1 <= EmployeeExecutionP.emp.length - 1; i1++) {

						e = new EmployeeBeanP();
						System.out.println("please enter employee name");
						e.setEmployeeename(sc.next());
						System.out.println("please enter employee id");
						e.setEmployeeId(sc.nextInt());
						System.out.println("please enter employee salary");
						e.setEmployeesalary(sc.nextDouble());
						System.out.println("please enter employee mobile number ");
						e.setEmployeemobileno(sc.nextLong());

						System.err.println(" insert Into Array " + EmployeeExecutionP.insert(e));
					}
					break;
				case 2:

					System.out.println("delete" + EmployeeExecutionP.delete());
					break;
				case 3:
					System.out.println("search" + EmployeeExecutionP.searchEmployee());
					break;
				case 4:
					System.out.println("print all" + EmployeeExecutionP.disply());
					break;
				case 5:
					EmployeeExecutionP.update();
					break;
																								/*
																								 * for (int i1 = 0; i1 <= EmployeeExecution.emp.length - 1; i1++) {
																								 * 
																								 * e = new Employee(); System.out.println("please enter employee name");
																								 * e.setEmployeename(sc.next()); System.out.println("please enter employee id");
																								 * e.setEmployeeId(sc.nextInt());
																								 * System.out.println("please enter employee salary");
																								 * e.setEmployeesalary(sc.nextDouble());
																								 * System.out.println("please enter employee mobile number ");
																								 * e.setEmployeemobileno(sc.nextLong()); int l= EmployeeExecution.update();
																								 * if(l==1) { break; }else
																								 * System.out.println("array is full you can not inserted");
																								 */
																								/*
																								 * break; }
																								 */
				case 6:
					System.out.println("you want to exit application press 'y' ");
					String ap1 = "y";
					String ap = sc.next();
					if (ap1.equals(ap)) {
						System.out.println("Application terminated by you");
						System.exit(0);
					}
					break;
				}
			} else
			System.out.println("do you want to continue [y/n]");
			s = sc.next();
		} while (s.equals("y"));
		System.out.println("application terminated:::::: ");
				System.out.println("please enter valid input option(between 1-6)");

	}

}
