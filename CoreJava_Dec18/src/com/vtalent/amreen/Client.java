package com.vtalent.amreen;

import java.util.Scanner;

public class Client

{
	static EmployeeOperations eo = new EmployeeOperations();

	public void addData() {

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
			System.out.println("enter salary");
			emp.setSalary(input.nextInt());
			eo.insetData(emp);
			// break;
		}
		System.out.println("data inserted succesfully");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Client c = new Client();
		for (int i = 0; i < 100; i++) {
			System.out.println("please select an option from below:"
					+ "\n1.insert data" + "\n2.update data" + "\n3.search data"
					+ "\n4.delete data" + "\n5.print data");

			int options = sc.nextInt();

			switch(options) {
			case 1:
				c.addData();

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
				eo.printData();

			}
		}
	}
}