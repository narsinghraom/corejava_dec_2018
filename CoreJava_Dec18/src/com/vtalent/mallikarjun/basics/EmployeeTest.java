
package com.vtalent.mallikarjun.basics;
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
			System.out.println("Please enter employee name");
			employee.employeeName=input.next();
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
		
		if (employeeArray == null) {
			System.out.println("Array is emplty, Please run again and pass the value");
			flag = false;
		} else {
			int empid;

			System.out.println("enter id to delete");
			empid = input.nextInt();
			for (int i = 0; i < employeeArray.length; i++) {
				Employee emp = employeeArray[i];
				if (emp.employeeId ==empid) {
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
	public static boolean searchingEmployee() {
		boolean flag = false;
		int empid;
		if (employeeArray == null) {
			System.out.println("Array is emplty, Please run again and pass the value");
			flag = false;
		} else {

			System.out.print("Enter the element you want to search:");
			empid = input.nextInt();

			for (int i = 0; i <= employeeArray.length - 1; i++) {
				if (employeeArray[i] != null) {
					Employee employee = employeeArray[i];
					if (employee.employeeId == empid) {

						System.out.println(employee.employeeId + "\t"+employee.employeeName+"\t" + employee.employeeSalary + "\t"+ employee.employeeMobileNo);
						flag = true;
						break;
					}
				}
			}
		}
		return flag;
	}
	public static boolean searchingEmployeeName() {
		boolean flag = false;
		String empName;
		if (employeeArray == null) {
			System.out.println("Array is emplty, Please run again and pass the value");
			flag = false;
		} else {

			System.out.print("Enter the employee name you want to search:");
			empName = input.next();
			empName=empName.toLowerCase();
			for (int i = 0; i <= employeeArray.length - 1; i++) {
				if (employeeArray[i] != null) {
					Employee employee = employeeArray[i];
					if (employee.employeeName.startsWith(empName)) {

						
						System.out.println(employee.employeeId + "\t"+employee.employeeName+"\t" + employee.employeeSalary + "\t"+ employee.employeeMobileNo);
						flag = true;
						//break;
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
			System.out.println("EmployeeId \t EmployeeName \t EmployeeSalary \t EmployeeMobileNo");
			for(int i=0;i<=employeeArray.length-1;i++) {
				if(employeeArray[i] != null) {
					Employee employee = employeeArray[i];
					System.out.println(employee.employeeId +"\t\t"+employee.employeeName+"\t\t"+employee.employeeSalary+"\t\t"+employee.employeeMobileNo);
				}
			}
		}
	}
	
	public static boolean updatingEmployee() {
		boolean flag = false;
		int empid;
		String m;
		if (employeeArray == null) {
			System.out.println("Array is emplty, Please run again and pass the value");
			flag = false;
		} else {

			System.out.print("Enter the element you want to search:");
			empid = input.nextInt();

			for (int i = 0; i <= employeeArray.length - 1; i++) {
				if (employeeArray[i] != null) {
					Employee employee = employeeArray[i];
					if (employee.employeeId == empid) {
						System.out.println("employeeId        :"+employee.employeeId);
						System.out.println("employeeName      :"+employee.employeeName);
						System.out.println("employeeSalary    :"+employee.employeeSalary);
						System.out.println("employeeMobileNo. :"+employee.employeeMobileNo);
						System.out.println();
							System.out.println("do u want to update ur data, press yes  else no");
							m=input.next();
							if(m.equals("yes")) {
								System.out.println("do u waant to update ur salary ,press (yes/no) ,yes=salary, no=next ");
								m=input.next();
								if(m.equals("yes")) {
									System.out.println("enter ur salary to update");
									employee.employeeSalary=input.nextFloat();
									System.out.println(employee.employeeSalary);
									System.out.println("salary updated sucessfully");
								}else {
									System.out.println("u entered wrong values");
								}
								System.out.println("do u waant to update ur  mobile no. ,press (yes/no) ,no=next, yes=mobile no. ");
								m=input.next();
								if(m.equals("yes")){
									System.out.println("enter ur mobile no. to update");
									employee.employeeMobileNo=input.nextLong();
									System.out.println(employee.employeeMobileNo);
									System.out.println("mobile no. updated sucessfully");
								}else{
									System.out.println("u enter wrong value");
								}
							}else {
								System.out.println("thanks for searching");
							}
							
						flag = true;
						break;
					}
				}
			}
		}
		return flag;
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
			System.out.println("7) Search with employee name");
			int choice = input.nextInt();
			switch (choice) {
			case 1: boolean insertFlag = insertAnEmployee();
					if(insertFlag) {
						System.out.println("Inserted Succesfully");
					}else {
						System.out.println("Something went worng! Please try again");
					}
					break;
			case 2: boolean deleteFlag=deleteEmployee();
					if(deleteFlag) {
						System.out.println("Deleted Succesfully");
					}else {
						System.out.println("Something went worng! Please try again");
					}
			        break;
			case 3:boolean searchingFlag= searchingEmployee();
					if(searchingFlag) {
						System.out.println("searching Succesfully");
					}else {
						System.out.println("Something went worng! Please try again");
					}
					break;
			case 4: printAllEmployees();
					break;
			case 5:boolean updatingFlag= updatingEmployee();
					if(updatingFlag) {
						System.out.println("update Succesfully");
					}else {
						System.out.println("Something went worng! Please try again");
					}
					break;
			case 6: System.exit(0);
			case 7:boolean searchingFlag1= searchingEmployeeName();
					if(searchingFlag1) {
						System.out.println("searching Succesfully");
					}else {
						System.out.println("Something went worng! Please try again");
					}
					break;
			default:System.out.println("Invalid Option Please try again");
					break;
			}
		}
	}

}












