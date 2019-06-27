package com.vtalent.rakesh;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EncapulationEmployeeTest {

	static Scanner sc = new Scanner(System.in);

	public void insertData() {
		System.out.println("Enter the no.of Employees to be stored");
		int size = sc.nextInt();

		EmployeeOperations.emparray = new Employee[size];
		for (int i = 0; i <= size - 1; i++) {

			System.out.println("Enter " + (i + 1) + " EmployeeData ");

			Employee emp = new Employee();

			System.out.println("Enter id:");
			emp.setEmployid(sc.nextInt());

			System.out.println("Enter name:");
			emp.setEmployName(sc.next());

			System.out.println("Enter package:");
			double d = sc.nextDouble();

			emp.setEmployPackage(d);

			System.out.println("Enter mobile number:");
			emp.setMobileNumber(sc.next());

			double d2 = emp.getEmployPackage();
			double salary = d2 / 12;

			double pf = salary * 2 / 100;
			double finalSalary = salary - pf;

			double finalSalary1 = Math.round(finalSalary * 100.0) / 100.0;
			emp.setEmploysalary(finalSalary1);
			double pf1 = Math.round(pf * 100.0) / 100.0;
			emp.setPf(pf1);
			EmployeeOperationss.storeData(emp);
		}
	}

	public static void main(String[] args) {
		EncapulationEmployeeTest et = new EncapulationEmployeeTest();
		EmployeeOperationss eo = new EmployeeOperationss();

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

			} else if (a == 4) {
				eo.searchData();
			}

			else if (a == 5) {
				eo.printAllData();
			}

			else if (a == 6) {
				eo.validateLoan();
			} else if (a == 7) {
				FileOutputStream fo = null;
				try {
					File file = new File("D:\\Rakesh\\rakeshdataqqqqqa");
					fo = new FileOutputStream(file);

					ObjectOutputStream oos = new ObjectOutputStream(fo);
					oos.writeObject(EmployeeOperations.emparray);

				} catch (Exception e) {
				} finally {
					try {
						fo.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			}
		}
	}
}