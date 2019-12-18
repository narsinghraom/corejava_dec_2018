package com.vtalent.mohammad;

import java.util.Scanner;
import com.vtalent.mohammad.Employee;

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
	public static boolean deleteEmployee() {
		boolean flag = false;
		if(employeeArray == null) 
		{
			System.out.println("Array Size is not defined, Please run again and pass the value");
			flag =false;
		}
		else 
		{
			System.out.println("Please enter employee Id");
			int empId = input.nextInt();
			
			for(int i=0;i<=employeeArray.length-1;i++) 
			{
				Employee emp=employeeArray[i];
				if(emp.employeeId==empId)
				{
					flag = true;
					for(int j=i;j<employeeArray.length-1;j++)
					{
						employeeArray[j]=employeeArray[j+1];
					}
					employeeArray[employeeArray.length-1]=null;
					
					break;
				}
			}
		}
		return flag;
	}
	
	public static boolean searchEmployee(){
		boolean flag = false;
		if(employeeArray == null) 
		{
			System.out.println("Array Size is not defined, Please run again and pass the value");
			flag =false;
		}
		else 
		{
			System.out.println("Please enter employee Id");
			int search = input.nextInt();
			
			for(int i=0;i<=employeeArray.length-1;i++)
			{
				if(employeeArray[i]==null)
				{
					Employee employee=employeeArray[i];
					if(employee.employeeId==search)
					{
						System.out.println(employee.employeeId +"\t \t"+employee.employeeSalary+ "\t \t "+employee.employeeMobileNo);
						flag =true;
						break;
					}
				}
			}
		}
		return flag;
	}
	public static void printAllEmployees() {
		if(employeeArray == null) {
			System.out.println("No Data Found");
		}else {
			System.out.println("EmployeeId \t EmployeeSalary \t EmployeeMobileNo");
			for(int i=0;i<=employeeArray.length-1;i++) {
				if(employeeArray[i] != null) {
					Employee employee = employeeArray[i];
					System.out.println(employee.employeeId +"\t  \t"+employee.employeeSalary+"\t \t \t \t"+employee.employeeMobileNo);
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
				
			case 2:boolean deleteFlag=deleteEmployee();
				if(deleteFlag)
				{
					System.out.println("Deleted Succesfully");
				}
				else
				{
					System.out.println("Enter invalid Employee ID, Please try again");
				}
				break;
			case 3:boolean searchFlag=searchEmployee();
			if(searchFlag)
			{
				System.out.println("Searching Succesfully");
			}
			else
			{
				System.out.println("Enter invalid Employee ID, Please try again");
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
