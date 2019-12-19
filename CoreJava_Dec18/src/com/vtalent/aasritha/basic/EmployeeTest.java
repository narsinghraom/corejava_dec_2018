package com.vtalent.aasritha.basic;


import java.util.Scanner;



public class EmployeeTest {
	static Employee1[] employeeArray;
	static Scanner input = new Scanner(System.in);
	public static boolean insertAnEmployee() {
		boolean flag = false;
		if(employeeArray == null) {
			System.out.println("Array Size is not defined, Please run again and pass the value");
			flag =false;
		}else {
			Employee1 employee = new Employee1();
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
	 public static boolean deleteAnEmployee() 
	{
	boolean flag = false;
	 int searchValue;
	 if(employeeArray == null) {
			System.out.println("Array is emplty, Please run again and pass the value");
			flag =false;
		}else {
		
		 System.out.print("Enter the element you want to delete:");
	
	        searchValue = input.nextInt();
	        
	        
	        for(int i=0;i<=employeeArray.length-1;i++) 
	        {
				if(employeeArray[i] != null )
				{
					Employee1 employee = employeeArray[i];
					 if(employee.employeeId == searchValue) 
					 {
					
						    for(int j=i+1;j <=employeeArray.length-1; j++)
				            {
							 employeeArray[j-1] = employeeArray[j];
				            }
						    employeeArray[employeeArray.length - 1] = null;
						 flag = true;
							break;
	                  }
				}
	        }
		}
		return flag;
	}
 public static boolean searchAnEmployee() 
	{
	boolean flag = false;
	 int x;
	 if(employeeArray == null) {
			System.out.println("No data found");
			flag =false;
		}else {
		
		 System.out.print("Enter the employee id which is to be searched ");
	        x = input.nextInt();
	        
	        
	        for(int i=0;i<=employeeArray.length-1;i++) {
				if(employeeArray[i] != null) {
					Employee1 employee = employeeArray[i];
					 if(employee.employeeId == x) {
						 
						 System.out.println(employee.employeeId +"\t\t"+employee.employeeSalary+"\t\t"+employee.employeeMobileNo);
						 flag = true;
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
					Employee1 employee = employeeArray[i];
					System.out.println(employee.employeeId +"\t"+employee.employeeSalary+"\t"+employee.employeeMobileNo);
				}
			}
		}
	}
	public static boolean updateAnEmployee() {
		boolean flag = false;
		int yes;
		if (employeeArray == null) {
			System.out.println("Array Size is not defined, Please run again and pass the value");
			flag = false;
		} else {
			System.out.println("Please enter the Element you want to update");
			int empId = input.nextInt();

			for (int i = 0; i <= employeeArray.length - 1; i++) {
				if(employeeArray[i]!=null)
				{
					Employee1 employee = employeeArray[i];
					if(employee.employeeId==empId)
					{
						System.out.println("EmployeeID : "+employee.employeeId);
						System.out.println("Employee Salary "+employee.employeeSalary);
						System.out.println("Employee Mobile No "+employee.employeeMobileNo);
						System.out.println();
						
						System.out.println("Do you want to your data, press(1/0), 1=yes, 0=No");
						yes=input.nextInt();
						if(yes==1)
						{
							System.out.println("Do you want to update your Salary, press(1/0), 1=yes, 0=Next");
							yes=input.nextInt();
							if(yes==1)
							{
								System.out.println("Please Enter your Salary to Update");
								employee.employeeSalary=input.nextFloat();
								System.out.println("Current Employee Salary : "+employee.employeeSalary);
								System.out.println("Salary Updated Successfully ");
							}
							
							System.out.println("Do you want to update your MobileNo, press(1/0), 1=yes, 0=Next");
							yes=input.nextInt();
							if(yes==1)
							{
								System.out.println("Please Enter your Mobile Number to Update");
								employee.employeeMobileNo=input.nextLong();
								System.out.println("Current Employee number : "+employee.employeeMobileNo);
								System.out.println("Mobile Updated Successfully ");
							}
						}
						else
						{
							System.out.println("Search Successfully");
						}
						flag=true;
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
		employeeArray = new Employee1[employeeSize];
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
				System.out.println("Succesfully deleted");
			}else {
				System.out.println("Something went worng! Please try again");
			}
			break;
			case 3: boolean searchFlag = searchAnEmployee();
			if(searchFlag) {
				System.out.println("Searched employee details");
			}else {
				System.out.println("Something went worng! Please try again");
			}
			break;
			case 4: printAllEmployees();
					break;
			case 5: boolean updateFlag = updateAnEmployee();
			if(updateFlag) {
				System.out.println("Updated Succesfully");
			}else {
				System.out.println("Something went worng! Please try again");
			}
			break;
			case 6: System.exit(0);

			default:System.out.println("Invalid Option Please try again");
				break;
			}
		}
	}

}











