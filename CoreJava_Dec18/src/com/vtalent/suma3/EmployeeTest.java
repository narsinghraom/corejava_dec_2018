package com.vtalent.suma3;
	
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
		
		public static void printAllEmployees() {
			if(employeeArray == null) {
				System.out.println("No Data Found");
			}else {
				System.out.println("EmployeeId \t EmployeeSalary \t EmployeeMobileNo");
				for(int i=0;i<=employeeArray.length-1;i++) {
					if(employeeArray[i] != null) {
						Employee employee = employeeArray[i];
						System.out.println(employee.employeeId +"\t"+employee.employeeSalary+"\t"+employee.employeeMobileNo);
					}
				}
			}
		}
		

		public static boolean deleteAnEmployee() {
			boolean flag = false;
			if(employeeArray == null) {
				System.out.println("Something went wrong, Please try again");
				flag =false;
			}else {
				System.out.println("Enter the id");
				int delId = input.nextInt();
				for(int i = 0; i<employeeArray.length-1; i++) {
					Employee emp = employeeArray[i];
					if (emp.employeeId == delId) {
						flag = true;
						for(int j =i; j<employeeArray.length-1; j++) {
							employeeArray[j] = employeeArray[j+1];
						}
						employeeArray[employeeArray.length-1] = null;
						break;
						
					} 
				}
				
			}
			return flag;
			
		}
		public static boolean searchAnEmployee() {
			boolean flag = false;
			if(employeeArray == null) {
				System.out.println("Array is empty, Please try again");
				flag =false;
			}else {
				System.out.println("Enter the employee id to search");
				int searchId = input.nextInt();
				for(int i = 0; i<employeeArray.length-1; i++) {
					Employee employee = employeeArray[i];
					if (employee.employeeId == searchId) {
						System.out.println(employee.employeeId + "\t" + employee.employeeSalary + "\t"
								+ employee.employeeMobileNo);
						flag = true;
						break;
					} 
				}
				
			}
			return flag;
			
		}
    public static boolean updateAnEmployee() {
		boolean flag = false;
		if(employeeArray == null) {
			System.out.println("Array Size is not defined, Please run again and pass the value");
			flag =false;
		}
		else {
				System.out.println("Enter the employee id to update");
				int updateId = input.nextInt();
				for(int i = 0; i<employeeArray.length-1; i++) {
					Employee employee = employeeArray[i];
					if (employee.employeeId == updateId) {
						System.out.println("Your details are");
						System.out.println(employee.employeeId + "\t" + employee.employeeSalary + "\t"
								+ employee.employeeMobileNo);
						while(true) {
						System.out.println("Do you want to update your details(1/0)");
						int choice = input.nextInt();
						
														if (choice ==1) {
															System.out.println("do you want to update salary (1/0)");
															choice= input.nextInt();
																								if (choice== 1) {
																									System.out.println("please enter the salary to update");
																									float updatedSal = input.nextFloat();
																									employee.employeeSalary = updatedSal;
																								}
																								       else if(choice==0)  {
																										System.out.println("do you want to update mobile no(1/0)");
																										int choice1  = input.nextInt();
																																	if (choice1 == 1) {
																																		System.out.println("Please enter the mobile no to update");
																																		long updateMobileNo = input.nextLong();
																																		employee.employeeMobileNo = updateMobileNo;
																															         }
																																	else {
																																		break;
																																	}
																								      }
																								}
														else {break;}
																					
													break;}
																		
											                                                } 															
							
							flag = true;
							break;
							
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
				int choice = input.nextInt();
				switch (choice) {
				case 1: boolean insertFlag = insertAnEmployee();
					if(insertFlag) {
						System.out.println("Inserted Succesfully");
					}else {
						System.out.println("Something went worng! Please try again");
					}
					break;
				case 2:boolean deleteFlag = deleteAnEmployee();
				
				if(deleteFlag) {
					System.out.println("Successfully deleted");						
				} else {

					System.out.println("Invalid id! Please try again");
				}
			    break;
				case 3: boolean searchFlag = searchAnEmployee();
				if(searchFlag) {
					System.out.println("displayed successfully");						
				} else {

					System.out.println("Invalid id! Please try again");

				}
				break;
			
				case 4: printAllEmployees();
						break;
				case 5: boolean updateFlag = updateAnEmployee();
				if(updateFlag) {
					System.out.println(" Updated successfully");
				} else{
					System.out.println("Invalid id! Please try again");
						
				}
				break;
				case 6: System.exit(0);

				default:System.out.println("Invalid Option Please try again");
					break;
				}
			}
		}

	}



