package com.vtalent.bharathi.basics;


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
				System.out.println("Enter the Employee name");
				employee.employeeName = input.next();				
				
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
				System.out.println("Enter the employee name to search");
				int searchId = input.nextInt();
				for(int i = 0; i<employeeArray.length-1; i++) {
					Employee employee = employeeArray[i];
					if (employee.employeeId == searchId) {
						System.out.println(employee.employeeId + "\t" + employee.employeeSalary + "\t"
								+ employee.employeeMobileNo+"\t" + employee.employeeName );
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
						System.out.println("\t"+employee.employeeId +"\t"+"\t"+employee.employeeSalary+"\t"+"\t"+employee.employeeMobileNo+"\t"+employee.employeeName);
					}
				}
			}
		}
		public static boolean updateAnEmployee() {
			boolean flag = false;
			if(employeeArray == null) {
				System.out.println("Array is empty, Please try again");
				flag =false;
			} else {
				System.out.println("Enter the employee id to update");
				int updateId = input.nextInt();
				for(int i = 0; i<employeeArray.length-1; i++) {
					Employee employee = employeeArray[i];
					if (employee.employeeId == updateId) {
						System.out.println("Your details are");
						System.out.println(employee.employeeId + "\t" + employee.employeeSalary + "\t"
								+ employee.employeeMobileNo);
						while(true) {
						System.out.println("Do you want to update your details(yes/No)");
						String choice = input.nextLine();
						
														if (choice =="yes") {
															System.out.println("do you want to update salary (yes/No)");
															choice= input.nextLine();
																								if (choice== "yes") {
																									System.out.println("please enter the salary to update");
																									float updatedSal = input.nextFloat();
																									employee.employeeSalary = updatedSal;
																								}
																								       else if(choice=="no")  {
																										System.out.println("do you want to update mobile no(yes/no)");
																										String choice1  = input.nextLine();
																																	if (choice1 == "no") {
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
		
		
		public static boolean searchWithName() {
			boolean flag = false;
			if(employeeArray == null) {
				System.out.println("Array is empty, Please try again");
				flag =false;
			}else {
			System.out.println("enter name you want to search ");
			String n=input.next();
	
		boolean b;
		String  newName=n.toLowerCase();
			for (int i=0;i<=employeeArray.length-1;i++) {
			Employee employee = employeeArray[i];
				b=employee.employeeName.startsWith(newName);			
					if(b==true) {
<<<<<<< HEAD
					System.out.println(employee.employeeName);
=======
						System.out.println(employee.employeeId + "\t" + employee.employeeSalary + "\t"
								+ employee.employeeMobileNo);
>>>>>>> 29fc3a9ddf7519b56adb46b238336b6d4387a700
					if( employeeArray.length>1 )if( employeeArray[i+1]==null) {flag= true;break;}
					flag= true;
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
				System.out.println("7) searchWithName");
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
					System.out.println("Updated  successfully");
				} else {
					System.out.println("no record updated");
				}
				break;
				
				case 6: System.exit(0);

				default:System.out.println("Invalid Option Please try again");
					break;
				
				case 7:boolean searchFlagName = searchWithName();
				if (searchFlagName) {
					System.out.println(" Successfully displayed");
				}
				else {
					System.out.println("Nothing found ");
				}
				break;
				
				}
			}
		}

	}

