package com.vtalent.kirankumar;

<<<<<<< HEAD
public class EmployeeOperations {
	static Employee[] empArray;

	public static void view() {
		System.out.println("1-Insert an Employee");
		System.out.println("2-Updata an Emploee");
		System.out.println("3-Delete an Employee");
		System.out.println("4-Searching an Employee");
		System.out.println("5-print all Employee Details");
		System.out.println("6-Exit");
	}

	public static void insertData(Employee emp) {
		if (empArray != null) {
			for (int i = 0; i <= empArray.length - 1; i++) {
				if (empArray[i] == null) {
					empArray[i] = emp;
					break;
				}
			}
		} else {
			System.out.println("already inserted");
		}
	}

	public static void upDateEmployeeData() {
		int count = 0;
		if (empArray != null) {
			System.out.println("enter Updated  EmployeeID:");
			int x = Test.input.nextInt();
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (x == emp.getEmployeeID()) {
						System.out.println("enter Salary:");
						int x1 = Test.input.nextInt();
						emp.setEmployeeSalary(x1);
						System.out.println("Ofter update " + emp.getEmployeeID() + "    " + emp.getEmployeeSalary());
						count = 1;
						break;
					} else {
						count++;
					}
				}
			}
			if (count == EmployeeOperations.empArray.length) {
				System.out.println("enter Valid ID to UPdate");
			}

		} else {
			System.out.println("1st Enter Data");
		}
	}

	public static void DeleteEmployeeData() {
		int Count = 0;
		if (empArray != null) {
			System.out.println("enter EmployeeID");
			int x = Test.input.nextInt();
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (x == emp.getEmployeeID()) {
						empArray[i] = null;
						System.out.println("Deleted Data");
						Test.z = EmployeeOperations.empArray.length;
						break;
					} else {
						Count = 2;
					}
				}
			}
			if (Count == 2) {
				System.out.println("Enter Correct Employee ID");
			}
		} else {
			System.out.println("1st enter Data");
		}
	}

	public static void searchEmployee() {
		int count = 0;
		if (empArray != null) {
			System.out.println("enter EmployeeID:");
			int x = Test.input.nextInt();
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (x == emp.getEmployeeID()) {
						System.out.println(
								"EmployeeId:---" + emp.getEmployeeID() + "  Salary:---" + emp.getEmployeeSalary());
						count = 1;
						break;
					} else {
						count = 2;
					}
				}
			}
			if (count == 2) {
				System.out.println("Enter Valid ID");
			}

		} else {
			System.out.println("1st Insert Data");
		}
	}

	public static void printAllEmployeeData() {
		if (empArray != null) {
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					System.out.println(emp.getEmployeeID() + " " + emp.getEmployeeSalary());
				}
			}
		} else {
			System.out.println("Not Data Not available to Print");
		}

	}

}
=======
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
				System.out.println("Employ id- "+emp1.getEmployId()+'\n'+"Employ Name- "+emp1.getEmployname()+'\n'+ "Employ Package- "+emp1.getEmployPackage()+'\n'+ "Employ Salary- "+emp1.getEmploySalary()+'\n'+ "Employ Pf(2%)- "+emp1.getEmployPf()+'\n');
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
				EmployeeOperations eo=new EmployeeOperations();
				eo.employLoan(emp.getEmploySalary());
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
>>>>>>> 57da0be8e4c3cc67b707b93822524f1292d76f83
