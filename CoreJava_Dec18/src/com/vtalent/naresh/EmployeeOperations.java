package com.vtalent.naresh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmployeeOperations {
	Employee emp;

	static Employee[] emparray;
	Scanner sc = new Scanner(System.in);

	public static void insertData(Employee emp) {
		if (emparray != null) {
			for (int i = 0; i <= emparray.length - 1; i++) {
				if (emparray[i] == null) {
					emparray[i] = emp;
					// System.out.println("here");
					break;
				}
			}
			System.out.println("Successfully Inserted." + '\n');
		}

		/*
		 * else { System.out.println("Already Inserted" + '\n'); }
		 */
	}

	public void printAllData() {
		
		if (emparray != null) {
			for (int i = 0; i < emparray.length ; i++) {
				Employee emp1 = emparray[i];
				 if(emparray[i]==null) {
					 
				 }
				 else {
				System.out.println("Employ id- "+emp1.getEmployId()+'\n'+"Employ Name- "+emp1.getEmployname()+'\n'+ "Employ Package- "+emp1.getEmployPackage()+'\n'+ "Employ Salary- "+emp1.getEmploySalary()+'\n'+ "Employ Pf(2%)- "+emp1.getEmployPf()+'\n'+"Loan Amount-"+emp1.getLoanAmount()+'\n'+"EMI-"+emp1.getEmi()+'\n'+"Tenure-"+emp1.getTenure()+'\n'+"Take Home Salary-"+emp1.getTakeHome());
				 emp1.date();
				 }
			}}
	else  {
		try{
			EmployeeOperations eo=new EmployeeOperations();
			eo.deSerialization();
		}
		catch(Exception e){
			
		}
		//System.out.println("Employee Data is empty" + '\n');
	}
	
			}

	public void updateData() {
		if (emparray != null) {
			Employee emp1;
			for (int i = 0; i <= emparray.length - 1; i++) {
				emp1 = emparray[i];
				if(emparray[i]==null) {
					System.out.println("Insert Data First");
				}
				else {
				System.out.println(emp1.getEmployId() + "   "
						+ emp1.getEmployPackage());
			}
			}
	
			System.out.println("Enter the Id to be Updated" + '\n');
			int x = sc.nextInt();
			System.out.println("Select the option to be updated 1.Name"+'\n'+"2.Package");
			int np=sc.nextInt();
			if(np==1) {
				for ( int i = 0; i <= emparray.length - 1; i++) {
					Employee emp2;
					emp2 = emparray[i];
					if (x == emp2.getEmployId()) {
						System.out .println("Enter the new name to be Updated" + '\n');
						emp2.setEmployname(sc.next());
					
				
					if(emparray!=null) {
						for(  i=0; i<=emparray.length-1;i++) {
							if(emparray[i]!=null) {
							 emp=emparray[i];
							System.out.println(emp.getEmployId()+"   "+ emp.getEmployname());
							}
															  }
										}
			
			else {
				System.out.println("First Insert Employee Data" + '\n');
			}
				}
				}
				}
				

			
			
			else if(np==2) {
				for ( int i = 0; i <= emparray.length - 1; i++) {
					Employee emp2;
					emp2 = emparray[i];
					if (x == emp2.getEmployId()) {
						System.out .println("Enter the new Package to be Updated" + '\n');
						emp2.setEmployPackage(sc.nextDouble());
					
				
					if(emparray!=null) {
						for(  i=0; i<=emparray.length-1;i++) {
							if(emparray[i]!=null) {
							 emp=emparray[i];
							System.out.println(emp.getEmployId()+"   "+ emp.getEmployPackage());
							}
															  }
										}
			
			else {
				System.out.println("First Insert Employee Data" + '\n');
			}
				}
				}	
			}
			else {
				System.out.println("Invalid Input");
			}
		}
	} 
public void searchData()throws Exception {
						if(emparray!=null) {
							System.out.println("Enter the Employ_Id:");
							Employee emp1;
							int x=sc.nextInt();
							for(int i=0;i<=emparray.length-1;i++) {
								emp1=emparray[i];
								if(emparray[i]==null) {
									
								}
								else if (x==emp1.getEmployId()) {
									System.out.println("Employ id- "+emp1.getEmployId()+'\n'+"Employ Name- "+emp1.getEmployname()+'\n'+ "Employ Package- "+emp1.getEmployPackage()+'\n'+ "Employ Salary- "+emp1.getEmploySalary()+'\n'+ "Employ Pf(2%)- "+emp1.getEmployPf()+'\n');
									break;
								}
								else {
									System.out.println("Enter the Valid Id"+'\n');
								}
								}
					}
							
						else {
							System.out.println("Enter id to search from Previous data");
							int x=sc.nextInt();
							FileInputStream fis=new FileInputStream("E:/Employ1.txt");
							ObjectInputStream ois=new ObjectInputStream(fis);
							Object obj=ois.readObject();
							Employee[] emparray1=(Employee[])obj;
							for(int i=0;i<=emparray1.length-1;i++) {
								if(x==emparray1[i].getEmployId()) {
							System.out.println("Id- "+emparray1[i].getEmployId()+'\n'+"Name- "+emparray1[i].getEmployname()+'\n'+"Package- "+emparray1[i].getEmployPackage()+'\n'+"Salary- "+emparray1[i].getEmploySalary()+'\n'+"pf- "+emparray1[i].getEmployPf());
								//	emparray1[i]=null;
								}
								}
							
							//System.out.println("Insert the Employee Data first"+'\n');
						}
						
						
						
					}
					public void deleteEmploy()throws Exception {
						 
							if(emparray!=null) { 
							Employee emp1;
							for(int i=0;i<=emparray.length-1;i++) {
								 emp1=emparray[i];
								System.out.println(emp1.getEmployId());
								
																  }
							System.out.println("Enter the Id to be Deleted");
								int x=sc.nextInt();
								for(int i=0;i<=emparray.length-1;i++) {
									 emp1=emparray[i];
									 	if(x==emp1.getEmployId()) {
									 		emparray[i]=null;
									 		System.out.println("Successfully Deleted, Plz Replace the Deleted Employee with New Employe"+'\n');
								}
								
								}
																
}
						else {
							System.out.println("Enter id to remove from Previous data");
							int x=sc.nextInt();
							FileInputStream fis=new FileInputStream("E:/Employ1.txt");
							ObjectInputStream ois=new ObjectInputStream(fis);
							Object obj=ois.readObject();
							Employee[] emparray1=(Employee[])obj;
							for(int i=0;i<=emparray1.length-1;i++) {
								if(x==emparray1[i].getEmployId()) {
									emparray1[i]=null;
									break;
								}
								}
							
							
						}
	 					}
					
					
	public void employLoan(double salary,Employee emp1) {
				
						try {
							if(salary<20000) {
								throw new EmployeeLoan();
							}
							else {
								//Employee emp1 =new Employee();
								double loanamount=salary*5;
								emp1.setLoanAmount(loanamount);
								System.out.println("Congrats:) You're Eligible for a Loan of Amount of "+loanamount+" with a interest rate of 14% per Annum(12 Months)"+'\n'+"Would you like to opt for a Loan"+'\n'+" 1.Yes 2.No" );
								int a=sc.nextInt();
								if(a==1) {
									
									
									System.out.println("Enter Tenure Period");
									int tenure=sc.nextInt();
									emp1.setTenure(tenure);
								  double i=(((0.14*tenure)/12))*loanamount;
								  double emi=(i+loanamount)/tenure;
								  emp1.setEmi(emi);
										
									
									//emp1.getLoanAmount();
									//emp1.getEmi();
								}
								else if(a==2) {
									System.out.println("Thank You");
								}
								
								else {
									System.out.println("Enter Valid Id");
								}
							}
						}
						catch(EmployeeLoan e) {
							System.out.println(e);
						}
						
					}

	public void employeeLoanMain() {
		if(emparray!=null) {
		System.out.println("Enter Employee id to check Loan Eligibility");
			int a=sc.nextInt();
			for ( int i = 0; i <= emparray.length - 1; i++) {
			emp = emparray[i];
			if(emparray[i]==null) {
			break;	
			}
			else if (a == emp.getEmployId()) {
				EmployeeOperations eo=new EmployeeOperations();
				//eo.employLoan(emp.getEmploySalary());
				eo.employLoan(emp.getEmploySalary(),emparray[i]);
				break;
				}
			 
				
	}
		}
			else {
				System.out.println("Insert some data first");
			}
		}
	
	
	public void deSerialization()throws Exception {
	
		
		FileInputStream fis=new FileInputStream("E:/Employ1.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		Employee[] emparray1=(Employee[])obj;
		for(int i=0;i<=emparray1.length-1;i++) {
		System.out.println("Id- "+emparray1[i].getEmployId()+'\n'+"Name- "+emparray1[i].getEmployname()+'\n'+"Package- "+emparray1[i].getEmployPackage()+'\n'+"Salary- "+emparray1[i].getEmploySalary()+'\n'+"pf- "+emparray1[i].getEmployPf());
		}
	}
		public void serialization()throws Exception {
			
			File f=new File("E:/Employ1.txt");
			FileOutputStream fos=new FileOutputStream(f);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(emparray);
			 
		
	}
	
	}
