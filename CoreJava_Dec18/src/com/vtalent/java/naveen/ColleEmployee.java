package com.vtalent.java.naveen;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColleEmployee {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		String s = "n";
		Scanner sc = new Scanner(System.in);
		EmployeeBeanP e;
		do {
			System.out.println("1. insert Into ArrayList");
			System.out.println("2.delete from my  ArrayList");
			System.out.println("3. Search an employee from my  ArrayList");
			System.out.println(" 4.Print All the employees from my  ArrayList");
			System.out.println("5.update employee");
			System.out.println("6.Exit");
			System.out.println("please choose your option");
			int i = sc.nextInt();
			if (i <= 6) {
				switch (i) {
				case 1:
						e = new EmployeeBeanP();
						System.out.println("please enter employee name");
						e.setEmployeeename(sc.next());
						System.out.println("please enter employee id");
						e.setEmployeeId(sc.nextInt());
						System.out.println("please enter employee salary");
						e.setEmployeesalary(sc.nextDouble());
						System.out.println("please enter employee mobile number ");
						e.setEmployeemobileno(sc.nextLong());

				 ColleEmployeeExe.insert(e);
					
					break;
				case 2:
					ColleEmployeeExe.delete();
					System.out.println("delete" );
					break;
				case 3:
					ColleEmployeeExe.searchEmployee();
					System.out.println("search" );
					break;
				case 4:
					ColleEmployeeExe.printAll();
					System.out.println("print all" );
					break;
				case 5:
					ColleEmployeeExe.updateEmployee();
					break;
																					
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
				System.out.println("please enter valid input option(between 1-5)");
			System.out.println("do you want to continue [y/n]");
			s = sc.next();
		} while (s.equalsIgnoreCase("y"));
		System.out.println("application terminated:::::: ");

		

	}

}
