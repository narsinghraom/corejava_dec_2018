package com.vtalent.kirankumar;

import java.util.Scanner;
<<<<<<< HEAD

=======
/*
>>>>>>> 57da0be8e4c3cc67b707b93822524f1292d76f83
public class Test {
	static Scanner input = new Scanner(System.in);
	static int z = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 0;
		// int z = 0;
		while (true) {
			int t = 0;
<<<<<<< HEAD
			EmployeeOperations.view();
=======
//	EmployeeOperations.view();
>>>>>>> 57da0be8e4c3cc67b707b93822524f1292d76f83
			int n = input.nextInt();
			if (n <= 6) {
				switch (n) {
				case 1:
					if (size == 0) {
						System.out.println("enter Number of Employees to Insert");
						size = input.nextInt();
<<<<<<< HEAD
						EmployeeOperations.empArray = new Employee[size];
=======
					//	EmployeeOperations.empArray = new Employee[size];
>>>>>>> 57da0be8e4c3cc67b707b93822524f1292d76f83
						for (int i = 0; i <= size - 1; i++) {
							System.out.println("Enter" + (i + 1) + "Employee data");
							Employee emp = new Employee();
							System.out.println("Enter ID");
<<<<<<< HEAD
							emp.setEmployeeID(input.nextInt());
							System.out.println("Enter Salary");
							emp.setEmployeeSalary(input.nextDouble());
=======
							///emp.setEmployeeID(input.nextInt());
							System.out.println("Enter Salary");
						//	emp.setEmployeeSalary(input.nextDouble());
>>>>>>> 57da0be8e4c3cc67b707b93822524f1292d76f83
							EmployeeOperations.insertData(emp);
							// System.out.println("Insert Data Successfully ");
							// z = EmployeeOperations.empArray.length;
						}
						System.out.println("Successfully Entered ");
					} else if (size == z) {
						System.out.println("z value...." + z + " size Of Array...." + size);
						for (int i = 0; i <= size - 1; i++) {
<<<<<<< HEAD
							if (EmployeeOperations.empArray[i] == null) {
								Employee emp = new Employee();
								System.out.println("Enter ID");
								emp.setEmployeeID(input.nextInt());
								System.out.println("Enter Salary");
								emp.setEmployeeSalary(input.nextDouble());
								EmployeeOperations.insertData(emp);
								z = EmployeeOperations.empArray.length;
=======
							//if (EmployeeOperations.empArray[i] == null) {
								Employee emp = new Employee();
								System.out.println("Enter ID");
						//		emp.setEmployeeID(input.nextInt());
								System.out.println("Enter Salary");
					//			emp.setEmployeeSalary(input.nextDouble());
								EmployeeOperations.insertData(emp);
				//				z = EmployeeOperations.empArray.length;
>>>>>>> 57da0be8e4c3cc67b707b93822524f1292d76f83
							}
							System.out.println("insert Data Successfully");
							z = size + 1;
						}
					} else {
						System.out.println("No Space to insert");
					}
					break;
				case 2:

<<<<<<< HEAD
					EmployeeOperations.upDateEmployeeData();
=======
			//		EmployeeOperations.upDateEmployeeData();
>>>>>>> 57da0be8e4c3cc67b707b93822524f1292d76f83
					break;
				case 3:

					EmployeeOperations.DeleteEmployeeData();
					break;
				case 4:

<<<<<<< HEAD
					EmployeeOperations.searchEmployee();
					break;
				case 5:

					EmployeeOperations.printAllEmployeeData();
=======
		//			EmployeeOperations.searchEmployee();
					break;
				case 5:

	//				EmployeeOperations.printAllEmployeeData();
>>>>>>> 57da0be8e4c3cc67b707b93822524f1292d76f83
					break;
				case 6:

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
<<<<<<< HEAD
=======
*/
>>>>>>> 57da0be8e4c3cc67b707b93822524f1292d76f83
