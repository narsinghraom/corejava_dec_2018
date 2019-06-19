package com.vtalent.saritha;

import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.vtalent.rakesh.Employee;
import com.vtalent.rakesh.EmployeeOperations;
import com.vtalent.rakesh.EncapulationEmployeeTest;
import com.vtalent.rakesh.GetALoan;


public class EmployeeTest {

	static Scanner sc = new Scanner(System.in);

	public void insertData() {
		System.out.println("Enter the no.of Employees to be stored");
		int size = sc.nextInt();

		EmployeeOperations.emparray = new Employee[size];
		for (int i = 0; i <= size - 1; i++) {

			System.out.println("Enter " + (i + 1) + " EmployeeData ");

			Employee emp = new Employee();

			System.out.println("Enter name:");
			emp.setEmployName(sc.next());

			System.out.println("Enter package:");
			emp.setEmployPackage(sc.nextDouble());

			System.out.println("Enter id:");
			emp.setEmployid(sc.nextInt());

			System.out.println("Enter pf:");
			emp.setPf(sc.nextFloat());

			System.out.println("Enter mobile number:");
			emp.setMobileNumber(sc.next());

			double d = emp.getEmployPackage();
			double salary = d / 12;
			double pf = emp.getPf();
			double finalSalary = salary - pf;
			emp.setEmploysalary(finalSalary);
			EmployeeOperations.storeData(emp);
		}
	}

	public static void main(String[] args) {
		EncapulationEmployeeTest et = new EncapulationEmployeeTest();
		EmployeeOperations eo = new EmployeeOperations();
		GetALoan g = new GetALoan();
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("1.Insert an Employee." + '\n' + "2.Update an Employee." + '\n' + "3.Delete an Employee"
					+ '\n' + "4.Search an Employee" + '\n' + "5.Print All the Employee Data" + '\n' + "6.Get A Loan"
					+ '\n' + "7.Exit");
			int a = sc.nextInt();

			if (a == 1) {
				et.insertData();
			} else if (a == 2) {
				eo.updateData();
			}

			else if (a == 3) {
				eo.deleteEmploy();
				// System.out.println("still under process..."+'\n');
			} else if (a == 4) {
				eo.searchData();
			}

			else if (a == 5) {
				eo.printAllData();
			}

			else if (a == 6) {
				Employee q = new Employee();
				GetALoan w = new GetALoan();
				w.validateSalary(q.getEmploysalary());
			} else if (a == 7) {
				break;
			} else {
				System.out.println("Enter Valid Search" + '\n');
			}
		}
	}
}
