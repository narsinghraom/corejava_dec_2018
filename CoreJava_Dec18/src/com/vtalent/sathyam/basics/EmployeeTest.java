package com.vtalent.sathyam.basics;

import java.util.Scanner;

public class EmployeeTest {
	static Employee[] employeeArray;
	static Scanner input = new Scanner(System.in);

	public static boolean insertAnEmployee() {
		boolean flag = false;
		if (employeeArray == null) {
			System.out.println("Array Size is not defined, Please run again and pass the value");
			flag = false;
		} else {
			
		}
			Employee employee = new Employee();
			System.out.println("Please enter employee Id");
			employee.employeeId = input.nextInt();
			System.out.println("Please enter employee salary");
			employee.employeeSalary = input.nextFloat();
			System.out.println("please enter employee Mobile No");
			employee.employeeMobileNo = input.nextLong();
			for (int i = 0; i <= employeeArray.length - 1; i++) {
				if (employeeArray[i] == null) {
					employeeArray[i] = employee;
					flag = true;
					break;
				}
			}
		}

		return flag;
	}

	public static boolean searchAnEmployee() {
		boolean flag = false;
		int x;
		if (employeeArray == null) {
			System.out.println("Array is emplty, Please run again and pass the value");
			flag = false;
		} else {

			System.out.print("Enter the element you want to search:");
			x = input.nextInt();

			for (int i = 0; i <= employeeArray.length - 1; i++) {
				if (employeeArray[i] != null) {
					Employee employee = employeeArray[i];
					if (employee.employeeId == x) {

						System.out.println(employee.employeeId + "\t" + employee.employeeSalary + "\t"
								+ employee.employeeMobileNo);
						flag = true;
						break;
					}
				}
			}
		}
		return flag;
	}

	public static boolean deleteAnEmployee() {
		boolean flag = false;
		int x;
		if (employeeArray == null) {
			System.out.println("Array is emplty, Please run again and pass the value");
			flag = false;
		} else {
			int del;

			System.out.println("enter id to delete");
			del = input.nextInt();
			for (int i = 0; i < employeeArray.length; i++) {
				Employee emp = employeeArray[i];
				if (emp.employeeId == del) {
					flag = true;
					// employeeArray[i] = employeeArray[i+1];
					for (int j = i; j < employeeArray.length - 1; j++) {
						employeeArray[j] = employeeArray[j + 1];
					}
					
					employeeArray[employeeArray.length - 1] = null;

					break;
				}
			}
		}

		return flag;

	}
	public static boolean updateAnEmployee() {
		boolean flag = false;
		int a;
		if (employeeArray == null) {
			System.out.println("Array is emplty, Please run again and pass the value");
			flag = false;
		} else {
	        System.out.print("Enter the element you want to update:");
			a = input.nextInt();

			for (int i = 0; i <= employeeArray.length - 1; i++) {
				if (employeeArray[i] != null) {
					Employee employee = employeeArray[i];
					if (employee.employeeId == a) {

						System.out.println(employee.employeeId + "\t" + employee.employeeSalary + "\t"
								+ employee.employeeMobileNo);
						while(true) {
						System.out.println("do you want to update details[1/0]");
						int m=input.nextInt();
						if(m==1)
						{
							m=0;
							System.out.println("do you want to update salary[1/0]");
							m=input.nextInt();
							if(m==1)
							{
								System.out.println("please enter employee salary");
								employee.employeeSalary=input.nextFloat();
								System.out.println(employee.employeeId + "\t" + employee.employeeSalary + "\t"
										+ employee.employeeMobileNo);
								System.out.println("do you want to update mobileNo[1/0]");
								m=input.nextInt();
								if(m==1)
								{
									System.out.println("please enter employee mobileNo");
									employee.employeeMobileNo=input.nextLong();
									System.out.println(employee.employeeId + "\t" + employee.employeeSalary + "\t"
											+ employee.employeeMobileNo);
								}
								else
								{
									
								
					
									break;
								}
							}
						}

						return flag;                                                                                         
					
					}
					
					
					
	public static void printAllEmployees() {
		if (employeeArray == null) {
			System.out.println("No Data Found");
		} else {
			System.out.println("EmployeeId \t EmployeeSalary \t EmployeeMobileNo");
			for (int i = 0; i <= employeeArray.length - 1; i++) {
				if (employeeArray[i] != null) {
					Employee employee = employeeArray[i];
					System.out.println(
							employee.employeeId + "\t" + employee.employeeSalary + "\t" + employee.employeeMobileNo);
				}
			}
		}
	}

	public static void main(String[] args) {
		int size, i, del, count = 0;
		System.out.println("Please enter the size of array to store the employees");
		int employeeSize = input.nextInt();
		employeeArray = new Employee[employeeSize];
		while (true) {
			System.out.println("Please select your choice");
			System.out.println("1) Insert an employee");
			System.out.println("2) Delete an employee");
			System.out.println("3) Search an employee");
			System.out.println("4) Print All employees");
			System.out.println("5) Update an employee");
			System.out.println("6) Terminate the application");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				boolean insertFlag = insertAnEmployee();
				if (insertFlag) {
					System.out.println("Inserted Succesfully");
				} else {
					System.out.println("Something went worng! Please try again");
				}
				break;
			case 2:
				boolean deleteFlag = deleteAnEmployee();
				if (deleteFlag) {
					System.out.println("deleted Succesfully");
				} else {
					System.out.println("invalid id please try again");
				}
				break;

			case 3:
				boolean searchFlag = searchAnEmployee();
				if (searchFlag) {
					System.out.println("search Succesfully");
				} else {
					System.out.println("invalid id please try again");
				}
				break;
			case 4:
				printAllEmployees();
				break;
			case 5:
				boolean updateFlag = updateAnEmployee();
				if (updateFlag) {
					System.out.println("update Succesfully");
				} else {
					System.out.println("invalid id please try again");
				}
				break;
			case 6:
				System.exit(0);

			default:
				System.out.println("Invalid Option Please try again");
				break;
			}
		}
	}

}
