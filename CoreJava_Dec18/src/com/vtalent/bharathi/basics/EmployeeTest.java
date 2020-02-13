package com.vtalent.bharathi.basics;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Arrays;

	public class EmployeeTest {
		static Employee[] employeeArray;
		static Scanner input = new Scanner(System.in);
		//static Employee[] temp;
		
		public static boolean insertAnEmployee() {
			boolean flag = false;
			if(employeeArray == null) {
				System.out.println("Array Size is not defined, Please run again and pass the value");
				flag =false;
			}
			else {
				Employee employee = new Employee();
				System.out.println("Please enter employee Id");
				String id = input.next();
				Integer empid = Integer.valueOf(id) ;
				employee.employeeId = empid;
				System.out.println("Please enter employee name");
				String name = input.next();
				String empname = String.valueOf(name) ;
				employee.employeeName = empname;
				
				
				
				System.out.println("Please enter employee mobileno");
				String no = input.next();
				Long empmobilno = Long.valueOf(no) ;
				employee.employeeMobileNo = empmobilno;
				System.out.println("Please enter employee years of experience");
				String years = input.next();
				Integer empyears = Integer.valueOf(years) ;
				employee.yearsOfExperience = empyears;
				System.out.println("Please enter employee package");
				String annualpackage = input.next();
				Double emppack = Double.valueOf(annualpackage) ;
				employee.employeePackage = emppack;
				employee.employeeSalary= ((employee.employeePackage)/12)-employee.EMI;
				for (int i = 0; i<=employeeArray.length-1;i++) {
					if(employeeArray[i]== null) {
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
				for(int i = 0; i<employeeArray.length; i++) {
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
					if (employee.employeeId ==searchId) {
						System.out.println(employee.employeeId + "\t" + employee.employeeName + "\t" + employee.employeeSalary+	"\t"
					+ employee.employeeMobileNo+"\t"  + employee.yearsOfExperience+"\t"+employee.employeePackage+"\t"
								+employee.loanAmount+"\t"+employee.tenure+"\t"+employee.EMI);
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
				System.out.println("EmployeeId\t EmployeeName\t EmployeeSalary\t EmployeeMobileNo\t"
						+ " YearsOfExperience\t EmployeePackage\t employeeLoanAmount\t tenure\t EMI");
				for(int i=0;i<=employeeArray.length-1;i++) {
					if(employeeArray[i] != null) {
						Employee employee = employeeArray[i];
						System.out.println("\t"+employee.employeeId + "\t" + employee.employeeName + "\t" + employee.employeeSalary+"\t"
					+ employee.employeeMobileNo+"\t"  + employee.yearsOfExperience+"\t"+employee.employeePackage+"\t"
								+employee.loanAmount+"\t"+employee.tenure+"\t"+employee.EMI);
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
				for(int i = 0; i<employeeArray.length; i++) {
					Employee employee = employeeArray[i];
					if (employee.employeeId == updateId) {
						System.out.println("Your details are");
						System.out.println(employee.employeeId + "\t" + employee.employeeSalary + "\t"
								+ employee.employeeMobileNo);
						while(true) {
						System.out.println("Do you want to update your details(yes/No)");
						String choice = input.next();
						
														if (choice.contentEquals("yes")) {
															System.out.println("do you want to update salary (yes/No)");
															choice= input.next();
																								if (choice.contentEquals("yes")) {
																									System.out.println("please enter the salary to update");
																									float updatedSal = input.nextFloat();
																									employee.employeeSalary = updatedSal;
																								}
																								       else if(choice.contains("no"))  {
																										System.out.println("do you want to update mobile no(yes/no)");
																										String choice1  = input.next();
																																	if (choice1.contentEquals("yes")) {
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
							//break;
							
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
					System.out.println(employee.employeeName);

					System.out.println("\t"+employee.employeeId + "\t" + employee.employeeName + "\t" + employee.employeeSalary+	"\t"
							+ employee.employeeMobileNo+"\t"  + employee.yearsOfExperience+"\t"+employee.employeePackage+"\t"
										+employee.loanAmount+"\t"+employee.tenure+"\t"+employee.EMI);
					if( employeeArray.length>1 )if( employeeArray[i+1]==null) {flag= true;break;}
					flag= true;
					}
			
		
					}
			}
			return flag;			
		}
		
		
		public static boolean getALoan() {
			boolean flag = false;
			if(employeeArray == null) {
				System.out.println("Array is empty, Please try again");
				flag =false;
			}
			else {
				System.out.println("Enter the employee id to take loan");
				int loanId = input.nextInt();
				for(int i = 0; i<employeeArray.length-1; i++) {
					Employee employee = employeeArray[i];
						System.out.println("do you want to take loan y/n");
						String choice = input.next();
						if(choice.contentEquals("y")) {
							System.out.println("Enter the amount you required");
							int loanamt = input.nextInt();							
							double emppack = (employee.employeePackage)/2;
							try {
								
								if(loanamt >=emppack) {
									throw new EmployeeLoan();
									
							}
								else{
									System.out.println("You are eligible for loan ");
									employee.loanAmount=loanamt;
								}
							}
							catch(EmployeeLoan e) {
								System.out.println(e);
							}					
																
								System.out.println(loanamt+" with 14% intrest y/n");
								choice = input.next();
								if(choice.contentEquals("y")) {
									System.out.println("Enter the tenure months");							
									
									employee.tenure = input.nextInt();
									double overallInterest = ((loanamt*0.14)+loanamt);
									employee.EMI = overallInterest/employee.tenure;
									System.out.println(employee.EMI);
									System.out.println("your application has been processed");
									
									
									System.out.println(employee.employeeSalary);
									flag= true;
									break;
									
								
								
									
									
								
									
								}
						}
							}
						
							
						}
					
			return flag;
				
				
			}
		
		
		public static void serialization()throws Exception {
			
			try{
				FileOutputStream fos=new FileOutputStream("E:\\Employ.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(employeeArray);		
		oos.close();
		fos.close();}catch(Exception e){
			e.printStackTrace();
			
		}
	}
	public static  void deSerialization()throws Exception {
		
			
			FileInputStream fis=new FileInputStream("E:\\Employ.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object obj=ois.readObject();
			Employee[] emparray=(Employee[])obj;
			employeeArray=emparray;
			for(int i=0;i<=emparray.length-1;i++) {
				if (emparray[i] != null) {
			System.out.println("Id- "+emparray[i].employeeId+'\n'+"Name- "+emparray[i].employeeName+'\n'+"Package- "+emparray[i].employeePackage+'\n'+"Salary- "+emparray[i].employeeSalary);
			
				}
			ois.close();}
		}
			
		
		
			
				

		
		
		
		public static void main(String[] args) {
			System.out.println("do you want to read data from the file [yes/no]");
			String choiceS=input.next();
			
			if(choiceS.equals("yes")) {try {
				deSerialization();		
			    	
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println("no backup found ");
				System.out.println("Please enter the size of array to store the employees");
				int employeeSize = input.nextInt();
				employeeArray = new Employee[employeeSize];
			
				
			}}else {
			System.out.println("Please enter the size of array to store the employees");
			int employeeSize = input.nextInt();
			employeeArray = new Employee[employeeSize];
			
			}
			
			
			while(true) {
				
				System.out.println("Please select your choice");
				System.out.println("1) Insert an employee");
				System.out.println("2) Delete an employee");
				System.out.println("3) Search an employee");
				System.out.println("4) Print All employees");
				System.out.println("5) Update an employee");
				System.out.println("6) Terminate the application");
				System.out.println("7) searchWithName");
				System.out.println("8) get A loan");
				System.out.println("9) to read data");
				System.out.println("10) to get data");
				int choice = input.nextInt();
				switch (choice) {
				case 1:for(int i=0;i<=employeeArray.length-1;i++) {
					if (employeeArray[i]== null) {
					  boolean insertFlag = insertAnEmployee();
						if (insertFlag) {
							System.out.println("Inserted Succesfully");
						} else {
							System.out.println("Something went worng! Please try again");
						}break;
				  }else if(i==employeeArray.length-1){					  
				  System.out.println("array is full do you want to del any employee and replace another employee yes/no");
				  String str=input.next();				 
				  if(str.equals("yes")) {
				  deleteAnEmployee();
				  insertAnEmployee();}
				   else if(str.equals("no")) {System.out.println("Processing your request");
					
					 Employee[] copy = (Employee[]) Arrays.copyOf(employeeArray, employeeArray.length+1);	
					 employeeArray=copy;
					 insertAnEmployee();
									
				break;
				
				   } }}
				 
				
				
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
				break;
				case 7:boolean searchFlagName = searchWithName();
				if (searchFlagName) {
					System.out.println(" Successfully displayed");
				}
				else {
					System.out.println("Nothing found ");
				}
				break;
				
				case 8:boolean loanFlag= getALoan();
				if(loanFlag) {
					System.out.println("successfully loan taken");
				}else
				{
					System.out.println("try again");
				}
				break;
				
				case 9:try {
					//deSerialization();
						serialization();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						System.out.println("something went wrong");
					}	break;
					
				case 10 :try {
					deSerialization();
						//serialization();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						System.out.println("something went wrong"+e1);
					}break;
				default:System.out.println("Invalid Option Please try again");
				break;
				}
			}
		}

	}
	

				