package com.vtalent.kirankumar;

import java.util.Scanner;


public class EmployeeTest {
	Scanner sc = new Scanner(System.in);
	static int c=0;
	public void inputdata() {
		int size;
		System.out.println("New Employee Data? Choose-1 " + '\n' + "Existing Employee Data?? Choose-2 ");
		int a = sc.nextInt();
		
		if (a == 1) {
			System.out.println("Enter the no.of Employees to be stored");
			size = sc.nextInt();
			EmployeeOperations.emparray = new Employee[size];
			for (int i = 0; i <= size - 1; i++) {
				System.out.println("Enter " + (i + 1) + " EmployeeData ");
				Employee emp = new Employee();
				System.out.println("Enter Id:");
				emp.setEmployId(sc.nextInt());
				System.out.println("Enter Employ Name");
				emp.setEmployname(sc.next());
				System.out.println("Enter Package:");
				emp.setEmployPackage(sc.nextDouble());
				EmployeeOperations.insertData(emp);
				 
			}
		} else if (a == 2) {
			if (EmployeeOperations.emparray == null) {
				System.out.println("First Create Employee Data");
			} else {
				System.out.println("Enter the no.of Employees to be Added");
				size = sc.nextInt();
				// EmployeeOperations.emparray=new Employee[size];
				for (int i = 0; i <= size - 1; i++) {

					System.out.println("Enter " + (i + 1) + " EmployeeData ");
					Employee emp = new Employee();
					System.out.println("Enter Id:");
					emp.setEmployId(sc.nextInt());

					System.out.println("Enter Salary:");
					emp.setEmployPackage(sc.nextDouble());
					EmployeeOperations.insertData(emp);
				}
			}
		}

		else {
			System.out.println("Check the Option you entered.");
		}

	}

	public static void main(String[] args) {
		EmployeeTest et = new EmployeeTest();
		EmployeeOperations eo = new EmployeeOperations();
		Scanner sc = new Scanner(System.in);

		for (;;) {
			
			System.out.println("1.Insert an Employee." + '\n' + "2.Update an Employee." + '\n' + "3.Delete an Employee"
					+ '\n' + "4.Search an Employee" + '\n' + "5.Print All the Employee Data" + '\n' + "6.Loan Eligibility "+'\n'+"7.Exit");
			
			int a = sc.nextInt();

			if (a == 1) {
				et.inputdata();
			} else if (a == 2) {
				eo.updateData();
			}

			else if (a == 3) {
				try {
				eo.deleteEmploy();
				}
				catch(Exception e) {
					
				}
			} else if (a == 4) {
				try {
				eo.searchData();
			}
				catch(Exception e) {}
			}

			else if (a == 5) {
				eo.printAllData();
				
				
			}

			else if (a == 6) {
				eo.employeeLoanMain();
				
			}
			
			else if(a==7) {
				try {
				eo.serialization();
				}
				catch(Exception e) {}
				break;
			}

			else {
				System.out.println("Enter Valid Search" + '\n');
			}
			c++;
		}
	}
}