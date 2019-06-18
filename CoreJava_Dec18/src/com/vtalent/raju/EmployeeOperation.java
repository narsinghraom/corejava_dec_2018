package com.vtalent.raju;


import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;


public class EmployeeOperation {
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

		else {
			System.out.println("Already Inserted" + '\n');
		}
	}

	public void printAllData() {
		if (emparray != null) {
			for (int i = 0; i < emparray.length ; i++) {
				Employee emp1 = emparray[i];
				 if(emparray[i]==null) {
					 
				 }
				 else {
				System.out.println("Employ id- "+emp1.getEmployId()+'\n'+"Employ Name- "+emp1.getEmployname()+'\n'+ "Employ Package- "+emp1.getEmployPackage()+'\n'+ "Employ Salary- "+emp1.employSalary()+'\n'+ "Employ Pf(2%)- "+emp1.employpf()+'\n');
				 }
			}}
	else {
		System.out.println("Employee Data is empty" + '\n');
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
					public void searchData() {
						if(emparray!=null) {
							System.out.println("Enter the Employ_Id:");
							Employee emp1;
							int x=sc.nextInt();
							for(int i=0;i<=emparray.length-1;i++) {
								emp1=emparray[i];
								if(emparray[i]==null) {
									
								}
								else if (x==emp1.getEmployId()) {
									System.out.println("Employ id- "+emp1.getEmployId()+'\n'+"Employ Name- "+emp1.getEmployname()+'\n'+ "Employ Package- "+emp1.getEmployPackage()+'\n'+ "Employ Salary- "+emp1.employSalary()+'\n'+ "Employ Pf(2%)- "+emp1.employpf()+'\n');
									break;
								}
								else {
									System.out.println("Enter the Valid Id"+'\n');
								}
								}
					}
							
						else {
							System.out.println("Insert the Employee Data first"+'\n');
						}
						
					}
					public void deleteEmploy() {
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
							System.out.println("No Data Found"+'\n');
						}
						
						}
					
					
	public void employLoan(double salary) {
						try {
							if(salary<20000) {
								throw new EmployeeLoan();
							}
							else {
								System.out.println("This Employ is Eligible for Loan ");
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
				EmployeeOperation eo=new EmployeeOperation();
				eo.employLoan(emp.employSalary());
				break;
				}
			 
				
	}
		}
			else {
				System.out.println("Insert some data first");
			}
		}
	
	
	public void deSerialization() {
		try {
		FileInputStream fis=new FileInputStream("D:/Employee.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
	//	Object obj=ois.readObject();
		DemoSerializable1 d1=(DemoSerializable1)ois.readObject();
		
		System.out.println(d1.getName());
		System.out.println(d1.getgender());
		System.out.println(d1.getAge());
		}
		catch(Exception e) {
			
		}
	}
	
	}
