package com.vtalent.naresh;

import java.util.*;

public class EmployeeTest1 {
	Scanner sc = new Scanner(System.in);
	public void inputdata() {
		int size;
		
			System.out.println("Enter the no.of Employees to be stored");
			size = sc.nextInt();
			EmployeeOperations1.emparray = new ArrayList<>();
			for (int i = 0; i <= size - 1; i++) {
				System.out.println("Enter " + (i + 1) + " EmployeeData ");
				Employee emp = new Employee();
				System.out.println("Enter Id:");
				emp.setEmployId(sc.nextInt());
				System.out.println("Enter Employ Name");
				emp.setEmployname(sc.next());
				System.out.println("Enter Package:");
				emp.setEmployPackage(sc.nextDouble());
				EmployeeOperations1.insertData(emp);
			}
				 
	 	}

	public static void main(String[] args) {
		EmployeeTest1 et1 = new EmployeeTest1();
		EmployeeOperations1 eo1=new EmployeeOperations1();
		Scanner sc = new Scanner(System.in);

		for (;;) {
			
			System.out.println("1.Insert an Employee." + '\n' + "2.Update an Employee." + '\n' + "3.Delete an Employee"
					+ '\n' + "4.Search an Employee" + '\n' + "5.Print All the Employee Data" + '\n' + "6.Loan Eligibility "+'\n'+"7.Exit");
			
			int a = sc.nextInt();

			if (a == 1) {
				et1.inputdata();
			} else if (a == 2) {
				eo1.update ();
			}

			else if (a == 3) {
				try {
				eo1.delete ();
				}
				catch(Exception e) {
					
				}
			} else if (a == 4) {
				eo1.search ();
			}
			else if (a == 5) {
				eo1.PrintAll();
				
				
			}

			else if (a == 6) {
				eo1.employeeLoanMain();
				
			}
			
			else if(a==7) {
				
				break;
			}

			else {
				System.out.println("Enter Valid Search" + '\n');
			}
		}
	}
}