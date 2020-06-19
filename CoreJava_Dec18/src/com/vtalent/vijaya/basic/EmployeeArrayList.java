package com.vtalent.vijaya.basic;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeArrayList {
	static List<Employee> employeeArrayList;
	static Scanner input = new Scanner(System.in);
	
	public static boolean insertAnEmployee() {
		boolean flag = false;
		
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
				employee.yoe=input.nextFloat();
				System.out.println("please enter employee Mobile No");
				employee.employeeMobileNo = input.nextLong();
				employeeArrayList.add(employee);
				flag = true;
	return flag;

	}
	
	public static boolean deleteEmployee() {
		boolean flag = false;
		
	
			int empid;

			System.out.println("enter id to delete");
			empid = input.nextInt();
			Iterator<Employee> itr=employeeArrayList.iterator();
			while(itr.hasNext()) {
				Employee e=itr.next();
				if(empid==e.employeeId) {
					itr.remove();
					flag=true;
				}
			}
			return flag;
		}
		
	public static boolean searchingEmployee() {
		boolean flag = false;
		int empid;
		

			System.out.print("Enter the element you want to search:");
			empid = input.nextInt();
			Iterator<Employee> itr=employeeArrayList.iterator();
			while(itr.hasNext()) {
				Employee e=itr.next();
				if(empid==e.employeeId) {
				
			
						System.out.println("EmployeeId \t EmployeeName \t EmployeePackage \t EmployeeSalary \t EmployeeYoe \t EmployeeMobileNo "
								+" LoanAmt \t Tenure \t Emi");
						System.out.println(e.employeeId +"\t\t"+e.employeeName+"\t\t"+e.employeePackage+
								"\t\t"+e.employeeSalary+"\t\t"+e.yoe+"\t\t"+e.employeeMobileNo+
								"\t\t"+e.loanamt+"\t\t"+e.tenure+"\t\t"+e.emi);
						flag = true;
						
					}
				}
			
		
		return flag;
	}
	
	public static boolean searchingEmployeeName() {
		boolean flag = false;
		String empName;
		

		System.out.print("Enter the employee name you want to search:");
		empName = input.next();
		empName=empName.toLowerCase();
		System.out.println("EmployeeId \t EmployeeName \t EmployeePackage \t EmployeeSalary \t EmployeeYoe \t EmployeeMobileNo "
				+" LoanAmt \t Tenure \t Emi");
		for (Employee employee:employeeArrayList) {
				if (employee.employeeName.startsWith(empName)) {
					
					System.out.println(employee.employeeId +"\t\t"+employee.employeeName+"\t\t"+employee.employeePackage+
							"\t\t"+employee.employeeSalary+"\t\t"+employee.yoe+"\t\t"+employee.employeeMobileNo+
							"\t\t"+employee.loanamt+"\t\t"+employee.tenure+"\t\t"+employee.emi);
					flag=true;
				}
		}
	return flag;
}

	public static void printAllEmployees() {
	
		
			System.out.println("EmployeeId \t EmployeeName \t EmployeePackage \t EmployeeSalary \t EmployeeYoe \t EmployeeMobileNo "
					+" LoanAmt \t Tenure \t Emi");
			for(Employee employee:employeeArrayList) {
					System.out.println(employee.employeeId +"\t\t"+employee.employeeName+"\t\t"+employee.employeePackage+
					"\t\t"+employee.employeeSalary+"\t\t"+employee.yoe+"\t\t"+employee.employeeMobileNo+
					"\t\t"+employee.loanamt+"\t\t"+employee.tenure+"\t\t"+employee.emi);
				}
			}
	
			
	public static boolean updatingEmployee() {
		boolean flag = false;
		int empid;
		String m;
		

			System.out.print("Enter the element you want to search:");
			empid = input.nextInt();

			for (Employee employee:employeeArrayList) {
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
		
		
		return flag;
	}
	
	
	public static boolean getALoan() {
		boolean flag = false;
		int empid;
			System.out.print("Enter the element you want to search:");
			empid = input.nextInt();

			
				for (Employee employee:employeeArrayList) {
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
			
		
		return flag;
	}
	public static void serialization()throws Exception {
		
		try {
			File file=new File("E:\\Employ.txt");
			FileOutputStream fos=new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(employeeArrayList);
			System.out.println("sucess");
			oos.close();
			fos.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}

public static  void deSerialization()throws Exception {
	
		
	try {
		FileInputStream fis=new FileInputStream("E:\\Employ.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		Object empArray=  obj;
		for(Employee employee:employeeArrayList) {
			System.out.println("Id="+employee.employeeId+'\n'+"Name- "+employee.employeeName+'\n'+"Package- "+employee.employeePackage+'\n'+"Salary- "+employee.employeeSalary+
					'\n'+"Experience- "+employee.yoe+'\n'+"Mobile No.- "+employee.employeeMobileNo);
		}
		ois.close();
	}catch(Exception e) {
		System.out.println(e);
	}
}
		
public void display(InnerClassEx ic) {
	ic.Serialization1();
}
	
		



	public static void main(String[] args) {
		employeeArrayList = new ArrayList<>();
		
		System.out.println("do u want previous value type yes else no");
		String option=input.next();

		if(option.equals("yes")) {
			try {
				FileInputStream fis=new FileInputStream("E:\\Employ.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				Object obj=ois.readObject();
				Object employee=obj;
				employeeArrayList=(List<Employee>) employee;
			}catch(FileNotFoundException e) {
				System.out.println("File is not created because of :-"+e);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
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
			case 1: 
				 boolean insertFlag = insertAnEmployee();
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
			case 11:try {
				EmployeeTest1 et=new EmployeeTest1();
				((EmployeeTest1) et).display(new InnerClassEx() {
					public void Serialization1() {
						File file=new File("E:\\Employ.txt");
						FileOutputStream fos = null;
						try {
							fos = new FileOutputStream(file);
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						}
						ObjectOutputStream oos = null;
						try {
							oos = new ObjectOutputStream(fos);
						} catch (IOException e) {
							e.printStackTrace();
						}
						try {
							oos.writeObject(employeeArrayList);
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("sucess");
						try {
							oos.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
						try {
							fos.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
		});
			}catch(Exception e) {
				System.out.println(e);
			} break;
			default:System.out.println("Invalid Option Please try again");
			break;
			}
			
		}
	}
}