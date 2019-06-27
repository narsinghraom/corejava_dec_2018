package com.vtalent.Bhavani;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Client

{
	static EmployeeOperations eo = new EmployeeOperations();

	public void addData() throws Exception {

		Scanner input = new Scanner(System.in);
		System.out.println("enter number of employees to insert");
		// taking size of an array here
		int size = input.nextInt();
		// passing array size
		eo.array = new Employee[size];

		// loop to take employee data
		for (int i = 0; i <= size - 1; i++) {

			System.out.println("enter details of employee " + (i + 1));
			Employee emp = new Employee();

			System.out.println("enter id");
			emp.setId(input.nextInt());
			System.out.println("enter name");
			emp.setEname(input.next());
			System.out.println("enter salary package");
			emp.setSalary(input.nextInt());

			eo.insetData(emp);
			// break;

			/*
			 * File file = new File("D:\\employeedata.txt"); FileOutputStream
			 * fos = new FileOutputStream(file); ObjectOutputStream oos = new
			 * ObjectOutputStream(fos); oos.writeObject(emp)
			 */;

		}

		System.out.println("data inserted succesfully");
	}

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Client c = new Client();
		for (int i = 0; i < 100; i++) {
			System.out.println("please select an option from below:"
					+ "\n1.insert data" + "\n2.update data" + "\n3.search data"
					+ "\n4.delete data" + "\n5.validate loan"
					+ "\n6.print data" + "\n7.exit");

			int options = sc.nextInt();

			switch (options) {
			case 1:
				c.addData();
				/*
				 * File file = new File("D:\\employeedata.txt");
				 * FileOutputStream fos = new FileOutputStream(file);
				 * ObjectOutputStream oos = new ObjectOutputStream(fos);
				 * oos.writeObject(EmployeeOperations.array);
				 */

				break;

			case 2:

				eo.updateData();

				break;
			case 3:
				eo.searchData();

				break;
			case 4:

				eo.DeleteData();

				break;
			case 5:
				eo.validateLoan();
				break;
			case 6:
				eo.printData();

			case 7:
				File file = new File("D:\\employeedata.txt");
				FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(EmployeeOperations.array);

			}
		}
	}

}
