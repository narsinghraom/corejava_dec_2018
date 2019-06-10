package com.vtalent.sukesh;

import java.util.Scanner;

public class EmployeeTask1 {

	static Scanner input = new Scanner(System.in);
	static int z = 0;

	public static void main(String[] args) throws ClassNotFoundException,
			EmployeeCustomException {
		// TODO Auto-generated method stub
		int size = 0;
		while (true) {
			int t = 0;
			EmployeeOperations.view();
			int n = input.nextInt();
			if (n <= 7) {
				switch (n) {
				case 1:
					if (size == 0) {
						System.out
								.println("enter Number of Employees to Insert");
						size = input.nextInt();
						EmployeeOperations.empArray = new Employee[size];
						for (int i = 0; i <= size - 1; i++) {
							System.out.println("Enter " + (i + 1)
									+ " Employee data");
							EmployeeOperations.InsertInnerLogic();
						}
						System.out.println("Successfully Entered ");
					} else if (size == z) {

						for (int i = 0; i <= size - 1; i++) {
							if (EmployeeOperations.empArray[i] == null) {
								EmployeeOperations.InsertInnerLogic();
								z = EmployeeOperations.empArray.length;
								System.out.println("insert Data Successfully");
								z = size + 1;
							}
						}
					} else {
						System.out.println("No Space to insert");
					}
					break;
				case 2:

					EmployeeOperations.upDateEmployeeData();
					break;
				case 3:

					EmployeeOperations.DeleteEmployeeData();
					break;
				case 4:

					EmployeeOperations.searchEmployee();
					break;
				case 5:

					EmployeeOperations.printAllEmployeeData();
					break;
				case 6:
					EmployeeOperations.GetLoanDetails();
					break;
				case 7:

					t = 1;
					break;

				}

			} else {
				System.out.println("please Enter Correct Number");
			}

			if (t == 1) {
				break;
			}

		}
	}
}
