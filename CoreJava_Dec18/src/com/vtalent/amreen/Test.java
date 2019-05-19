package com.vtalent.amreen;

import java.util.Scanner;

public class Test {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Test test = new Test();
		Scanner sc = new Scanner(System.in);
		EmployeeOperations eo = new EmployeeOperations();
		int options;
		System.out.println("select an option from 1 to 6");
		options = input.nextInt();

		switch (options) {
		case 1:
			eo.insertData();
			eo.printData();
		case 6:
			eo.printData();
		}

	}
}