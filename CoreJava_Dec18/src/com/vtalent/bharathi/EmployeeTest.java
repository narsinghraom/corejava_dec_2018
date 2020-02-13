package com.vtalent.bharathi.basics;


import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmployeeTest {
	static Employee[] employeeArray;
	static  Employee[]  emp1;
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
			System.out.println("Please enter employee package");
			employee.employeePackage=input.nextDouble();
			employee.employeeSalary=(float) employee.employeePackage/12;
			//System.out.println("Please enter employee salary");
			//employee.employeeSalary = input.nextFloat();
			System.out.println("Please enter ur Experience");
			employee.yoe=input.nextInt();
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
						System.out.println("EmployeeId \t EmployeeName \t EmployeePackage \t EmployeeSalary \t EmployeeYoe \t EmployeeMobileNo "
								+" LoanAmt \t Tenure \t Emi");
						System.out.println(employee.employeeId +"\t\t"+employee.employeeName+"\t\t"+employee.employeePackage+
								"\t\t"+employee.employeeSalary+"\t\t"+employee.yoe+"\t\t"+employee.employeeMobileNo+
								"\t\t"+employee.loanamt+"\t\t"+employee.tenure+"\t\t"+employee.emi);
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
			System.out.println("EmployeeId \t EmployeeName \t EmployeePackage \t EmployeeSalary \t EmployeeYoe \t EmployeeMobileNo "
					+" LoanAmt \t Tenure \t Emi");
			for(int i=0;i<=employeeArray.length-1;i++) {
				if(employeeArray[i] != null) {
					Employee employee = employeeArray[i];
					System.out.println(employee.employeeId +"\t\t"+employee.employeeName+"\t\t"+employee.employeePackage+
					"\t\t"+employee.employeeSalary+"\t\t"+employee.yoe+"\t\t"+employee.employeeMobileNo+
					"\t\t"+employee.loanamt+"\t\t"+employee.tenure+"\t\t"+employee.emi);
				}
			}}
	
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
	
	
	public static boolean getALoan() {
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
						if(employee.loanamt==0) {
							System.out.println("Do you want to continue loan process press yes else no");
							String option=input.next();
							if(option.equals("yes")) {
								// System.out.println("Please enter ur experience");
								//	float exp=input.nextFloat();
								if(employee.yoe>=2 ) {
									System.out.println("you r eligible for loan");
									System.out.println("enter the amount you required and it should be from 1-1,00,000");
									float amt=input.nextFloat();
									try {
										if(amt>=100000) {
											throw new EmployeeLoan();
										}else {
											System.out.println("You are eligible for loan of "+amt+" with 14% of interest per Anum");
											//employee.loanamt=amt;
											System.out.println("do you want to continue loan process press yes else no");
											option=input.next();
											if(option.equals("yes")) {
												System.out.println("enter tenure of loan(12/24) months");
												employee.tenure=input.nextInt();
												//employee.emi=(float) ((amt)+((amt)0.14(employee.tenure))/12)/(employee.tenure);
									
												
												float Iamt=(float) (amt*0.14*employee.tenure)/12;
												employee.emi=(amt+Iamt)/employee.tenure;
												employee.intrest=Iamt;
												
												System.out.println(employee.emi);
												employee.employeeSalary=employee.employeeSalary-employee.emi;
												System.out.println("your application has been under processing");
												employee.loanamt=amt;
												flag= true;
												break;
											}else {
												System.out.println("you cancle the loan");
											}
										}
									}catch(EmployeeLoan e) {
										System.out.println(e);
									}	
									
								}else {
									System.out.println("to get loane should have 2 years of experience");
								}
							}else {
								System.out.println("thankyou");
							}
						}else {
							System.out.println("you are already taken the loan");
						}
					}
						
				}
			}
		}
		return flag;
	}
	public static void serialization()throws Exception {
		
		File f=new File("E:\\Employ.txt");
		try{
			FileOutputStream fos=new FileOutputStream("E:\\\\Employ.txt");
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
		employeeArray = new Employee[employeeSize];}
		while(true) {
			System.out.println("Please select your choice");
			System.out.println("1) Insert an employee");
			System.out.println("2) Delete an employee");
			System.out.println("3) Search an employee");
			System.out.println("4) Print All employees");
			System.out.println("5) Update an employee");
			System.out.println("6) Terminate the application");
			System.out.println("7) Search with employee name");
			System.out.println("8) get a loan");
			System.out.println("9) to read data");
			System.out.println("10) to get data");
			
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
			case 8:boolean loan= getALoan();
					if(loan) {
						System.out.println("Succesfully");
					}else {
						System.out.println("Something went worng! Please try again");
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



		
