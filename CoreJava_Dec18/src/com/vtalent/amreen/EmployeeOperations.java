package com.vtalent.amreen;

import java.util.Scanner;

public class EmployeeOperations {
	static Employee[] array;
	Client c = new Client();

	// method to insert employee data
	public void insetData(Employee emp) {
		if (array != null) {
			for (int i = 0; i <= array.length - 1; i++) {
				if (array[i] == null) {
					array[i] = emp;
					break;

				}
				System.out.println("Data inserted");
			}

		} else {
			System.out.println("size full");
		}
	}

	// method to print all employees data
	public void printData() {
		if (array != null) {
			for (int i = 0; i <= array.length - 1; i++) {
				Employee emp = array[i];
				if (emp != null) {

					System.out.println(emp.getId() + " " + emp.getSalary());

				}
			}

		} else {
			System.out.println("no data found! " + " please insert data first");
			c.addData();
		}

	}

	public void updateData() {

	}

	public void DeleteData() {

		Scanner input = new Scanner(System.in);
		if (array != null) {
			Employee emp1;
			for (int i = 0; i <= array.length - 1; i++) {
				emp1 = array[i];
				System.out.println(emp1.getId());
			}
			System.out.println("enter id to be deleted");
			int del = input.nextInt();
			if (array != null) {
				for (int i = 0; i < array.length - 1; i++) {

					emp1 = array[i];
					if (del == emp1.getId()) {
						array[i] = null;
						System.out.println("deleted succesfully");

					}

				}

			}
		} else {
			System.out.println("no data found! " + " please insert data first");
			c.addData();
		}
	}

}