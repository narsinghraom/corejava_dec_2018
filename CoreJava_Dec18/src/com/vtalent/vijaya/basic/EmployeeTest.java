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
		boolean flag = false;
		int deletevalue;
		if(employeeArray == null) {
			System.out.println("Array size is not defined, please run again and pass the value");
			flag=false;
		}else {
			System.out.println("Please enter an employee to delete");
			deletevalue=input.nextInt();
			for(int i=0;i<=employeeArray.length-1;i++) {
				if(employeeArray[i]!=null) {
				Employee employee=employeeArray[i];
				if(employee.employeeId == deletevalue) {
					for(int j=i+1;j<=employeeArray.length-1;j++) {
						employeeArray[j-1]=employeeArray[j];
					}
					employeeArray[employeeArray.length-1]=null;
					flag=true;
					break;
				}
				
			}
			}
			
		}
		return flag;
	}
	public static boolean searchAnEmployee() {
		boolean flag = false;
		if(employeeArray == null) {
			System.out.println("Array is empty,please try again");
			flag = false;
		}else {
			System.out.println("enter the employeeid to search");
			int searchId = input.nextInt();
			for(int i= 0;i<=employeeArray.length-1;i++) {
				if(employeeArray[i]!=null) {
				Employee employee = employeeArray[i];
				if(employee.employeeId == searchId) {
					System.out.println(employee.employeeId+"\t"+employee.employeeSalary+"\t"+employee.employeeMobileNo);
					flag=true;
					break;
				}
			}
		}
		}
		return flag;
	}
	public static boolean updateAnEmployee() 
	{
		boolean flag = false;
		 int x;
		 if(employeeArray == null) {
		System.out.println("Array is emplty, Please run again and pass the value");
		flag =false;
			}else
			 {	
			 System.out.print("Enter the element you want to update:");
		        x = input.nextInt();  
		        for(int i=0;i<=employeeArray.length-1;i++) {
				if(employeeArray[i] != null) {
					Employee employee = employeeArray[i];
						if(employee.employeeId == x) {	 
						System.out.println(employee.employeeId +"\t"+employee.employeeSalary+"\t"+employee.employeeMobileNo);
							while(true) {
							 System.out.println("do you want to update details[1/0]");
							 int k=input.nextInt();
							 if (k==1)
							 {
							  k=0;
							 System.out.println("do you want to update salary[1/0]");
							k=input.nextInt();
							if (k==1) 
							{
							  System.out.println("Please enter employee salary");									
							 employee.employeeSalary = input.nextFloat();
							 System.out.println(employee.employeeId +"\t"+employee.employeeSalary+"\t"+employee.employeeMobileNo);
							 System.out.println("do you want to update mobile[1/0]");
						     k=input.nextInt();								     
							if (k==1) 
						    {
																		               
							System.out.println("please enter employee Mobile No");
							employee.employeeMobileNo = input.nextLong();
						 System.out.println(employee.employeeId +"\t"+employee.employeeSalary+"\t"+employee.employeeMobileNo);										          
		}
		else {
			  break;
		 }
	}
		 else { 
			 System.out.println("please enter employee Mobile No");
			employee.employeeMobileNo = input.nextLong();
			System.out.println(employee.employeeId +"\t"+employee.employeeSalary+"\t"+employee.employeeMobileNo);
}
 }
break;}}  
} 
flag = true;
break;
							      
		        }}
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
					System.out.println("details are updated");
				}
				break;
			case 3:boolean searchFlag = searchAnEmployee();
				if(searchFlag) {
					System.out.println("searched the details");
				}else {
					System.out.println("something went wrong! please try again");
				}
				break;
			case 5:boolean updateFlag = updateAnEmployee();
			if(updateFlag) {
				System.out.println(" updated successfully");
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











