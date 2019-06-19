package com.vtalent.saichand;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmployeeTask2 {

	static Scanner input = new Scanner(System.in);
	static int z = 0;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int size = 0;
		while (true) {
			int t = 0;
			EmployeeOperations.view();
			int n = getInput().nextInt();
			if (n <= 7) {
				switch (n) {
				case 1:
					if (size == 0) {
						System.out.println(" Number of Employees to be Insert");
						size = getInput().nextInt();
						EmployeeOperations.empArray = new Employee[size];
						for (int i = 0; i <= size - 1; i++) {
							System.out.println("Enter " + (i + 1)
									+ " Employee data");
							EmployeeOperations.InsertInnerLogic();

						}

						System.out.println("insertion completed Entered ");
					} else if (size == z) {

						for (int i = 0; i <= size - 1; i++) {
							if (EmployeeOperations.empArray[i] == null) {
								EmployeeOperations.InsertInnerLogic();
								z = EmployeeOperations.empArray.length;
								System.out
										.println("inserted Data Successfully");
								z = size + 1;

							}
						}
					} else {
						System.out.println("No Space to enter");
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

					try {
						File file = new File("C:\\vtalen.txt");
						FileOutputStream fos = new FileOutputStream(file);
						@SuppressWarnings("resource")
						ObjectOutputStream oos = new ObjectOutputStream(fos);
						oos.writeObject(EmployeeOperations.empArray);

					} catch (Exception e) {
						e.getMessage();
					}
					t = 1;
					break;

				}

			} else {
				System.out.println("please Enter valid Number");
			}

			if (t == 1) {
				break;
			}

		}
	}

	public static Scanner getInput() {
		return input;
	}

	public static void setInput(Scanner input) {
		EmployeeTask2.input = input;
	}
}
