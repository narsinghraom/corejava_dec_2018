package com.vtalent.saranyanc;

import java.util.Scanner;

public class EmployeeTest {
	static Employee[] empArray;
	static Scanner input = new Scanner(System.in);

	public static int insertIntoArray() {
		int index = 0;
		Employee emp = new Employee();

		System.out.println("enter employee Id");
		emp.setEmpId(input.nextInt());
		System.out.println("enter salary");

		emp.setEmpSalary(input.nextDouble());
		if (empArray != null) {

			for (int i = 0; i <= empArray.length - 1; i++) {

				if (empArray[i] == null) {
					index = i;

					break;
				}
			}
		} else

		{
			System.out
					.println("Array is full please delete some data to insert");
			return 0;

		}
		empArray[index] = emp;

		return index + 1;

	}

	public static int deleteFromArray() {
		boolean flag = false;
		System.out.println("enter the Id to delete");
		int tempId = input.nextInt();
		for (int i = 0; i <= empArray.length - 1; i++) {
			Employee emp = empArray[i];
			if (emp.getEmpId() == tempId) {
				empArray[i] = null;
				flag = true;
				return i + 1;

			}
		}

		if (flag) {
			System.out.println("successfully deleted");
		}

		else
			System.out.println("invalid id");

		return 0;

	}

	public static void main(String[] args) {
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		empArray = new Employee[size];
		Employee emp = new Employee();
		while (true) {
			System.out.println("enter your choice");
			System.out.println("1 insert");
			System.out.println("2 delete");
			System.out.println("3 view");
			System.out.println("4 exit");
			int ch = input.nextInt();
			switch (ch) {
			case 1:
				EmployeeTest.insertIntoArray();

				break;
			case 2:
				EmployeeTest.deleteFromArray();
				break;
			case 3:
				for (int i = 0; i <= empArray.length - 1; i++)

				{
					Employee employee = empArray[i];
					if(null != employee)
					System.out.println(employee.getEmpId());
					if(null!=employee)
					System.out.println(employee.getEmpSalary());

				}
				break;
			case 4:
				System.out.println("exit program");

				break;

			default:
				System.out.println(" invalid choice");
				break;

			}
		}
	}
}
