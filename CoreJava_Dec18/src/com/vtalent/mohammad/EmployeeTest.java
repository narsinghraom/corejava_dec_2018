package com.vtalent.mohammad;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.vtalent.mohammad.Employee;

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
			employee.employeeName = input.next();
			
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
					Employee employee = employeeArray[i];
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
								System.out.println("Current Employee Salary : "+employee.employeeMobileNo);
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
						System.out.println(employee.employeeId + "\t \t" 
											+ employee.employeeSalary + "\t \t "
													+ employee.employeeMobileNo);
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
					employee.employeeName = employee.employeeName.toLowerCase();
					if (employee.employeeName.startsWith(search)) {
						System.out.println(employee.employeeId + "\t \t" + employee.employeeSalary + "\t \t "
								+ employee.employeeMobileNo + "\t \t" + employee.employeeName);
						flag = true;
						//break;
					}}
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
			
			System.out.print("Enter the id you want to search:");
			empid = input.nextInt();

			for (int i = 0; i <= employeeArray.length - 1; i++) {
				if (employeeArray[i] != null) {
					Employee employee = employeeArray[i];
					if (employee.employeeId == empid) {
					
			System.out.println("Do you want to continue loan process enter yes or no");
			String option=input.next();
			if(option.equals("yes")) {
				
				System.out.println("Please enter your experience");
				float exp=input.nextFloat();
				
				if(exp>=2 ) {
					System.out.println("you are eligible for loan");
					System.out.println("enter the amount you required and it should be from 1-1,00,000");
					float amt=input.nextFloat();
				try{	
					if(amt>100000) {
						throw new EmployeeLoan();
					}
					else{
						System.out.println("You are eligible for loan of "+amt+" with 14% of interest per Anum");
						employee.loanamt=amt;
					}
				}
				catch(EmployeeLoan e) {
					System.out.println(e);
				}							
						System.out.println("do you want to continue loan process enter yes or no");
						if(option.equals("yes")) {
							option=input.next();
							
							System.out.println("enter tenure of loan(12/24) months");
							employee.tenure=input.nextInt();
							//employee.emi=(float) ((amt)+((amt)0.14(employee.tenure))/12)/(employee.tenure);
							float Iamt=(float) (amt*0.14*employee.tenure)/12;
							employee.emi=(amt+Iamt)/employee.tenure;
							
							System.out.println("your emi: " + employee.emi);
							System.out.println("your application has been under processing");
							
							flag= true;
							break;
							
						}else {
							System.out.println("you cancel the loan");
							break;
						}
						
					}else {
						System.out.println("you get the loan  half of ur package");
						break;
					}
				}else {
					System.out.println("to get loan should have 2 years of experience");
				break;
				}
				
			}else{
				System.out.println("thank you");
			break;
			}
		}
			}
		}
		return flag;
		}
		

	public static void printAllEmployees() {
		if (employeeArray == null) {
			System.out.println("No Data Found");
		} else {
			System.out.println("EmployeeId \t EmployeeSalary \t EmployeeMobileNo");
			for (int i = 0; i <= employeeArray.length - 1; i++) {
				if (employeeArray[i] != null) {
					Employee employee = employeeArray[i];
					System.out.println(employee.employeeId + "\t  \t" + employee.employeeSalary + "\t \t \t \t"
							+ employee.employeeMobileNo);
				}
			}
		}
	}
	
public static void serialization()throws Exception {
		
		//File f=new File("E:\\Employ.txt");
		try{FileOutputStream fos=new FileOutputStream("E:Employee.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(employeeArray);
		
	oos.close();
	fos.close();}catch(Exception e){
		e.printStackTrace();
		
	}
}
public static  void deSerialization()throws Exception {
	
		
		FileInputStream fis=new FileInputStream("E:Employee.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		Employee[] emparray=(Employee[])obj;
		for(int i=0;i<=emparray.length-1;i++) {
		System.out.println("Id- "+emparray[i].employeeId+'\n'+"Name- "+emparray[i].employeeName+'\n'+"Package- "+emparray[i].employeePackage+'\n'+"Salary- "+emparray[i].employeeSalary);
			
		ois.close();}
	}
	public static void main(String[] args) {
		
		System.out.println("do you want to read data from the file [yes/no]");
		String choiceS=input.next();
		
		if(choiceS.equals("yes")) {try {
			//deSerialization();		
		       try
		       { 
		    	FileInputStream fis=new FileInputStream("E:\\Employ.txt");
		   		ObjectInputStream ois=new ObjectInputStream(fis);
		   		Object obj=ois.readObject();
		   		Employee[] emparray=(Employee[])obj;
		   		employeeArray=emparray;
		        
		          ois.close();
		       }catch(Exception i)
		       {
		          i.printStackTrace();
		          return;
		       }
			
		} catch (Exception e1) {
			System.out.println("ssssomething went wrong"+e1);
			
		}}else {
		
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
			System.out.println("8) Get a loan");
			System.out.println("9) to read data");
			System.out.println("10) to get data");
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
			case 8:
				boolean loanFlag = getALoan();
				if (loanFlag) {
					System.out.println("loan Succesful");
				} else {
					System.out.println("something went wrong, Please try again");
				}
				break;	
			case 9:try {
			//deSerialization();
				serialization();
			} catch (Exception e1) {
				System.out.println("something went wrong");
			}	
			break;
			
			case 10 :try {
			deSerialization();
				//serialization();
			} catch (Exception e1) {
				System.out.println("ssssomething went wrong"+e1);
			}
			break;

			default:
				System.out.println("Invalid Option Please try again");
				break;
			}
		}
	}
  }
}