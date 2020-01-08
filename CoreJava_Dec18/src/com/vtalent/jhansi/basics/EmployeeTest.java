package com.vtalent.jhansi.basics;

import java.util.Scanner;
import com.vtalent.jhansi.basics.Employee;

public class EmployeeTest {
	static Employee[] employeeArray;
	static Scanner input = new Scanner(System.in);

	public static boolean insertAnEmployee() {
		boolean flag = false;
		if (employeeArray == null) {
			System.out.println("Array Size is not defined, Please run again and pass the value");
			flag = false;
		} else {
			Employee employee = new Employee();
			System.out.println("Please enter employee Id");
			employee.employeeId = input.nextInt();
			System.out.println("Please enter employee salary");
			employee.employeeSalary = input.nextFloat();
			System.out.println("please enter employee Mobile No");
			employee.employeeMobileNo = input.nextLong();
			System.out.println("Please enter employee name");
			employee.name = input.next();
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

	public static boolean deleteEmployee() {
		boolean flag = false;
		if (employeeArray == null) {
			System.out.println("Array Size is not defined, Please run again and pass the value");
			flag = false;
		} else {
			System.out.println("Please Enter Delete Employee Id");
			int empId = input.nextInt();

			for (int i = 0; i <= employeeArray.length - 1; i++) {
				Employee emp = employeeArray[i];
				if (emp.employeeId == empId) {
					flag = true;
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

	public static boolean updateEmployee() {
		boolean flag = false;
		String s;
		if (employeeArray == null) {
			System.out.println("Array Size is not defined, Please run again and pass the value");
			flag = false;
		} else {
			System.out.println("Please enter the Element you want to update");
			s = input.next();
			System.out.println("if yes please enter id");
			int empId = input.nextInt();

			for (int i = 0; i <= employeeArray.length - 1; i++) {
				if (employeeArray[i] != null) {
					Employee employee = employeeArray[i];
					if (employee.employeeId == empId) {
						System.out.println("EmployeeID : " + employee.employeeId);
						System.out.println("Employee Salary " + employee.employeeSalary);
						System.out.println("Employee Mobile No " + employee.employeeMobileNo);
						System.out.println("Employee Name " + employee.name);
						System.out.println();

						System.out.println("Do you want to your data, press(1/0), 1=yes, 0=No");
						s = input.next();
						if (s.toLowerCase() == "yes") {
							System.out.println("Do you want to update your Salary, press(1/0), 1=yes, 0=Next");
							s = input.nextLine();
							if (s.toLowerCase() == "yes") {
								System.out.println("Please Enter your Salary to Update");
								employee.employeeSalary = input.nextFloat();
								System.out.println("Current Employee Salary : " + employee.employeeSalary);
								System.out.println("Salary Updated Successfully ");
							}

							System.out.println("Do you want to update your MobileNo, press(1/0), 1=yes, 0=Next");
							s = input.next();
							if (s.toLowerCase() == "yes") {
								{
									System.out.println("Please Enter your Mobile Number to Update");
									employee.employeeMobileNo = input.nextLong();
									System.out.println("Current Employee Salary : " + employee.employeeMobileNo);
									System.out.println("Mobile Updated Successfully ");
								}
							} else {
								System.out.println("Search Successfully");
							}
							flag = true;
							break;
						}
					}
				}
			}
		}
		return flag;
	}

	public static boolean searchEmployee() {
		boolean flag = false;
		if (employeeArray == null) {
			System.out.println("Array Size is not defined, Please run again and pass the value");
			flag = false;
		} else {
			System.out.println("Please Enter Search Employee Id");
			int search = input.nextInt();

			for (int i = 0; i <= employeeArray.length - 1; i++) {
				if (employeeArray[i] != null) {
					Employee employee = employeeArray[i];
					if (employee.employeeId == search) {
						System.out.println(employee.employeeId + "\t \t" + employee.employeeSalary + "\t \t "
								+ employee.employeeMobileNo + "\t \t" + employee.name);
						flag = true;
						break;
					}
				}
			}
		}
		return flag;
	}

	public static boolean searchNameEmployee() {
		boolean flag = false;
		if (employeeArray == null) {
			System.out.println("Array Size is not defined, Please run again and pass the value");
			flag = false;
		} else {
			System.out.println("Please Enter Search Employee name");
			String search = input.next();
			search = search.toLowerCase();

			for (int i = 0; i <= employeeArray.length - 1; i++) {
				if (employeeArray[i] != null) {
					Employee employee = employeeArray[i];
					employee.name = employee.name.toLowerCase();
					if (employee.name.startsWith(search)) {
						System.out.println(employee.employeeId + "\t \t" + employee.employeeSalary + "\t \t "
								+ employee.employeeMobileNo + "\t \t" + employee.name);
						flag = true;
						break;
					}}
					}
						
				}
			
		
		return flag;
	}

	public static void printAllEmployees() {
		if (employeeArray == null) {
			System.out.println("No Data Found");
		} else {
			System.out.println("EmployeeId \t EmployeeSalary \t EmployeeMobileNo \t EmployeeName");
			for (int i = 0; i <= employeeArray.length - 1; i++) {
				if (employeeArray[i] != null) {
					Employee employee = employeeArray[i];
					System.out.println(employee.employeeId + "\t  \t" + employee.employeeSalary + "\t \t \t \t"
							+ employee.employeeMobileNo + employee.name);
				}
			}
		}
	}

	public static void main(String[] args) {
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
			System.out.println("7) Search an employee by name");
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
				boolean deleteFlag = deleteEmployee();
				if (deleteFlag) {
					System.out.println("Deleted Succesfully");
				} else {
					System.out.println("Enter invalid Employee ID, Please try again");
				}
				break;
			case 3:
				boolean searchFlag = searchEmployee();
				if (searchFlag) {
					System.out.println("Searching Succesfully");
				} else {
					System.out.println("Enter invalid Employee ID, Please try again");
				}
				break;
			case 4:
				printAllEmployees();
				break;
			case 5:
				boolean updateFlag = updateEmployee();
				if (updateFlag) {
					System.out.println("Updation Succesfully");
				} else {
					System.out.println("Enter invalid Employee ID, Please try again");
				}
				break;
			case 6:
				System.exit(0);
			case 7:
				boolean searchNameFlag = searchNameEmployee();
				if (searchNameFlag) {
					System.out.println("Searching by name  Succesfully");
				} else {
					System.out.println("Entered invalid Employee name, Please try again");
				}
				break;

			default:
				System.out.println("Invalid Option Please try again");
				break;
			}
		}
	}

}
