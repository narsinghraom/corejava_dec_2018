package com.vtalent.sukesh;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmployeeCollectionTask1 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int size = 0;
		while (true) {
			int t = 0;
			EmployeeCollectionOperations.view();
			int n = EmployeeCollectionTask1.input.nextInt();
			switch (n) {
			case 1:

				System.out.println("enter Number of Employees to Insert");
				size = input.nextInt();

				for (int i = 0; i < size; i++) {
					System.out.println("Enter " + (i + 1) + " Employee data");
					EmployeeCollectionOperations.InsertInnerLogic();
				}

				System.out.println("Successfully Entered ");

				break;
			case 2:

				EmployeeCollectionOperations.upDateEmployeeData();
				break;
			case 3:

				EmployeeCollectionOperations.DeleteEmployeeData();
				break;
			case 4:

				EmployeeCollectionOperations.searchEmployee();
				break;
			case 5:

				EmployeeCollectionOperations.printAllEmployeeData();
				break;
			case 6:
				EmployeeCollectionOperations.GetLoanDetails();
				break;
			case 7:

				try {
					File file = new File("F:\\Employee Data View.txt");
					FileOutputStream fos = new FileOutputStream(file);
					@SuppressWarnings("resource")
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(EmployeeCollectionOperations.empArray);

				} catch (Exception e) {
					e.getMessage();
				}
				t = 1;
				break;
			default:
				System.out.println("please Enter Correct Number");
			}

			if (t == 1) {
				break;
			}

		}

	}

}