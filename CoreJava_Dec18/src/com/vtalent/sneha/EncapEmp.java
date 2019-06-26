package com.vtalent.sneha;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class EncapEmp {
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
			emp.setEmployPackage(sc.nextDouble());

			System.out.println("Enter mobile number:");
			emp.setMobileNumber(sc.next());

			double d = emp.getEmployPackage();
			double salary = d / 12;
			double pf = salary * 2 / 100;
			double finalSalary = salary - pf;
			emp.setEmploysalary(finalSalary);
			emp.setPf(pf);
			EmployeeOperations.storeData(emp);
		}
	}

	public static void main(String[] args) {
		EncapEmp et = new EncapEmp();
		EmployeeOperations eo = new EmployeeOperations();

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
			}
			if (a == 7) {
				try {
					File file = new File("D:\\Employee.txt");
					FileOutputStream fo = new FileOutputStream(file);
					ObjectOutputStream oos = new ObjectOutputStream(fo);
					oos.writeObject(EmployeeOperations.emparray);
				} catch (Exception e) {
				}
				break;
			} else {
				System.out.println("Enter Valid Search" + '\n');
			}
		}
	}
}


