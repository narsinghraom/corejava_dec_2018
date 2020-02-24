package com.vtalent.mallikarjun.basics;

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

	public class EmployeeArrayListTest {
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
		
		public static boolean deleteEmployee()throws Exception{
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

				System.out.print("Enter the employee Id you want to search:");
				empid = input.nextInt();
				for(Employee employee:employeeArrayList) {
					if(empid==employee.employeeId) {
						System.out.println("EmployeeId \t EmployeeName \t EmployeePackage \t EmployeeSalary \t EmployeeYoe \t EmployeeMobileNo "
								+" LoanAmt \t Tenure \t Emi");
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
						"\t\t"+employee.loanamt+"\t\t"+employee.tenure+"\t\t"+employee.emi+"\t\t"+employee.intrest);

			}
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
		
		public static boolean updatingEmployee() {
			boolean flag = false;
			int empid;
			String m;

				System.out.print("Enter the employee Id you want to search:");
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
		
		private static boolean getALoan() {
			boolean flag = false;
			int empid;

				System.out.print("Enter the employee Id you want to search:");
				empid = input.nextInt();

				for (Employee employee:employeeArrayList) {
					if (employee.employeeId == empid) {
						if(employee.loanamt==0) {
							System.out.println("Do you want to continue loan process press yes else no");
							String option=input.next();
							if(option.equals("yes")) {
								// System.out.println("Please enter ur experience");
								//	float exp=input.nextFloat();
								try {
								if(employee.yoe>=2 ) {
									System.out.println("you r eligible for loan");
									
									System.out.println("enter the amount you required and it should be from 1-1,00,000");
									float amt=input.nextFloat();
									try {
										if(amt<=100000) {
											System.out.println("You are eligible for loan of "+amt+" with 14% of interest per Anum");
										//	employee.loanamt=amt;
											System.out.println("do you want to continue loan process press yes else no");
											option=input.next();
											if(option.equals("yes")) {
												while(true) {
												System.out.println("enter tenure of loan(12/24) months");
												employee.tenure=input.nextInt();
												if(employee.tenure==12 || employee.tenure==24) {
												
												//employee.emi=(float) ((amt)+((amt)*0.14*(employee.tenure))/12)/(employee.tenure);
												float Iamt=(float) (amt*0.14*employee.tenure)/12;
												employee.emi=(amt+Iamt)/employee.tenure;
												employee.intrest=Iamt;
												
												employee.loanamt=amt;
												employee.employeeSalary=employee.employeeSalary-employee.emi;
												
												System.out.println("LoanAmt="+employee.loanamt+" Intrest="+employee.intrest+" monthly emi="+employee.emi);
												System.out.println("your application has been under processing");
												
												flag= true;
												break;
												}else {
													System.out.println("entered wrong, tenure should be 12 or 24 months ");
												}
												}
											}else {
												System.out.println("you cancle the loan");
												flag=true;
												break;
											}
										}else {
											throw new  MultipleExceptions.LoanException();
										}
									}catch( MultipleExceptions.LoanException e) {
										System.out.println(e);
									}	
									
								}else {
									throw new MultipleExceptions.ExperienceException();
								}
								}catch(MultipleExceptions.ExperienceException e) {
									System.out.println(e);
									flag=true;
								}
							}else {
								System.out.println("thankyou");
								flag=true;
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
			File file=new File("E:\\EmployeeArrayListTest.txt");
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
		@SuppressWarnings("unused")
		public static void deSerialization()throws Exception{
			try {
				FileInputStream fis=new FileInputStream("E:\\EmployeeArrayListTest.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				Object obj=ois.readObject();
				for(Employee employee1:employeeArrayList) {
					System.out.println("Id="+employee1.employeeId+'\n'+"Name- "+employee1.employeeName+'\n'+"Package- "+employee1.employeePackage+'\n'+"Salary- "+employee1.employeeSalary+
							'\n'+"Experience- "+employee1.yoe+'\n'+"Mobile No.- "+employee1.employeeMobileNo);
				}
				ois.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		public void display(InnerClassEx ic) {
			ic.Serialization1();
		}
	@SuppressWarnings({ "unchecked", "resource" })
	public static void main(String[] args) throws Exception {
		
		employeeArrayList = new ArrayList<>();
		
			System.out.println("do u want previous value type yes else no");
			String option=input.next();

			if(option.equals("yes")) {
				try {
					FileInputStream fis=new FileInputStream("E:\\EmployeeArrayListTest.txt");
					ObjectInputStream ois=new ObjectInputStream(fis);
					Object obj=ois.readObject();
					Object employee=obj;
					employeeArrayList=(List<Employee>) employee;
					System.out.println("here your previous data");
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
				System.out.println("5) Search with employee name");
				System.out.println("6) Terminate the application");
				System.out.println("7) Update an employee");
				System.out.println("8) get a loan");
				System.out.println("9) to write data in file");
				System.out.println("10) to read data from file");
				System.out.println("11) to write data in file using Anonymous inner class");
				 
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
				
				  case 3:boolean searchingFlag= searchingEmployee(); if(searchingFlag) {
				  System.out.println("searching Succesfully"); }else {
				  System.out.println("Something went worng! Please try again"); } break;
				 
				case 4: printAllEmployees();
						break;
				
				  case 7:boolean updatingFlag= updatingEmployee(); if(updatingFlag) {
				  System.out.println("update Succesfully"); }else {
				  System.out.println("Something went worng! Please try again"); } break;
				 
				
				  case 6: try { serialization(); } catch (Exception e) { e.printStackTrace(); }
				  System.exit(0);
				 
				
				  case 5:boolean searchingFlag1= searchingEmployeeName(); if(searchingFlag1) {
				  System.out.println("searching Succesfully"); }else {
				  System.out.println("Something went worng! Please try again"); } break;
				 
				
				  case 8:boolean loan= getALoan(); if(loan) {
				  System.out.println("Succesfully"); }else {
				  System.out.println("entered worng! Please try again"); } break;
				 
				
				  case 9:try { serialization(); } catch (Exception e1) {
				  System.out.println("something went wrong"+e1); } break;
				 
				
				  case 10:try { deSerialization(); } catch (Exception e1) {
				  System.out.println("something went wrong"+e1); } break;
				 
				case 11:try {
							EmployeeTest1 et=new EmployeeTest1();
							et.display(new InnerClassEx() {
								public void Serialization1() {
									File file=new File("E:\\EmployeeArrayListTest.txt");
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

