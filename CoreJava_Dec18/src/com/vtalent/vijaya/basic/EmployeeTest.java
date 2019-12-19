package com.vtalent.vijaya.basic;

import java.util.Scanner;
public class EmployeeTest {
	static Employee[] employeeArray;
	static Scanner input = new Scanner(System.in);
	public static boolean insertAnEmployee() {
		boolean flag = false;
		if(employeeArray == null) {
			System.out.println("Array Size is not defined, Please run again and pass the value");
			flag =false;
		}else {
			Employee employee = new Employee();
			System.out.println("Please enter employee Id");
			employee.employeeId = input.nextInt();
			System.out.println("Please enter employee salary");
			employee.employeeSalary = input.nextFloat();
			System.out.println("please enter employee Mobile No");
			employee.employeeMobileNo = input.nextLong();
			for(int i=0;i<=employeeArray.length-1;i++) {
				if(employeeArray[i]==null) {
					employeeArray[i] = employee;
					flag = true;
					break;
				}
			}
		}
		
		return flag;
	}
	public static boolean deleteAnEmployee() {
		boolean flag=false;
		if(employeeArray == null) {
			System.out.println("Array size is not defined, please run again and pass the value");
			flag=false;
		}else {
			Employee employee = new Employee();
			System.out.println("Please enter an employee to delete");
			employee.employeeId=input.nextInt();
			for(int i=0;i<=employeeArray.length-1;i++) {
				Employee delete=null;
				if(delete==employeeArray[i]) {
					for(int j=0;j<=employeeArray.length-1;i++) {
						employeeArray[j]=employeeArray[j+1];
					}
					break;
				}
				
			}
			
		}
		return flag;
	}
	
	public static void printAllEmployees() {
		if(employeeArray == null) {
			System.out.println("No Data Found");
		}else {
			System.out.println("EmployeeId\tEmployeeSalary\tEmployeeMobileNo");
			for(int i=0;i<=employeeArray.length-1;i++) {
				if(employeeArray[i] != null) {
					Employee employee = employeeArray[i];
					System.out.println(employee.employeeId +"\t\t"+employee.employeeSalary+"\t\t"+employee.employeeMobileNo);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter the size of array to store the employees");
		int employeeSize = input.nextInt();
		employeeArray = new Employee[employeeSize];
		while(true) {
			System.out.println("Please select your choice");
			System.out.println("1) Insert an employee");
			System.out.println("2) Delete an employee");
			System.out.println("3) Search an employee");
			System.out.println("4) Print All employees");
			System.out.println("5) Update an employee");
			System.out.println("6) Terminate the application");
			int choice = input.nextInt();
			switch (choice) {
			case 1: boolean insertFlag = insertAnEmployee();
				if(insertFlag) {
					System.out.println("Inserted Succesfully");
				}else {
					System.out.println("Something went worng! Please try again");
				}
				break;
			case 2: boolean deleteFlag = deleteAnEmployee();
				if(deleteFlag) {
					System.out.println("Deleted Succesfully");
				}else {
					System.out.println("something went wrong! please try again");
				}
				break;
			case 4: printAllEmployees();
					break;
			case 6: System.exit(0);

			default:System.out.println("Invalid Option Please try again");
				break;
			}
		}
	}

}











