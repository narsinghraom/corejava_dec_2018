package com.vtalent.mamathasri1;
import java.util.Scanner;

public class EmpBean {
	private int EID;
	private String EName;
	private double ESalary;
	private String EMobileNumber;

	public void setEmpID(int empID) {
		this.EID = empID;
	}

	public int getEmpID() {
		return EID;
	}

	public void setEmpName(String empName) {
		this.EName = empName;
	}

	public String getEmpName() {
		return EName;
	}

	public void setEmpSalary(double empSalary) {
		this.ESalary = empSalary;
	}

	public double getEmpSalary() {
		return ESalary;
	}

	public void setEmpMobileNumber(String empMobileNumber) {
		this.EMobileNumber = empMobileNumber;
	}

	public String getEmpMobileNumber() {
		return EMobileNumber;
	}
}

class Employe extends EmpBean {

	static Employe emp;

	static Employe[] earray;
	Scanner in = new Scanner(System.in);//global Scanner object declaration

	public static void InsertData(Employe emp) {
		if (earray != null) {
			for (int i = 0; i <= earray.length - 1; i++) {
				if (earray[i] == null) {
					earray[i] = emp;
					break;
				}
			}
			System.out.println("Sucessfully Inserted." + '\n');//n is uesd for next line
		} else {
			System.out.println("Already Inserted." + '\n');
		}
	}

	public void DeleteData() {
		int c = 0;
		System.out.println("enter id to be deleted");
		int del = in.nextInt();
		if (null != emp) {
		for (int i = 0; i <= earray.length - 1; i++) {
			if (earray[i] != null) {
				emp = earray[i];
				
					if (del == emp.getEmpID()) {
						earray[i] = null;
						c++;
						System.out.println("deleted succesfully");
					}
				}
			}

		}
		if (c == 0) {
			System.out.println("no data found! please insert data first");
		}
	}

	public void searchData() {
		int c=0;
		if (earray != null) {
			System.out.println("Enter The Employee ID:");
			int x = in.nextInt();
			for (int i = 0; i <= earray.length - 1; i++) {
				emp = earray[i];
				if (null != emp) {
					if (x == emp.getEmpID()) {
						System.out.println("Employee ID: " + emp.getEmpID()
								+ "      " + "Employee Name: "
								+ emp.getEmpName() + "      "
								+ "Employee Mobile Number: "
								+ emp.getEmpMobileNumber() + "      "
								+ "Employee Salary: " + emp.getEmpSalary());
								c++;
					} 
					else if (x!=emp.getEmpID()){
						System.out.println("Enter the Valid Id");
						}		
			} 
			}
		} else {
			System.out.println("Insert  the Employee Data first");
		}
	}

		public void SearchName() {
			int c=0;
			if (earray != null) {
			 System.out.println("Enter The Employee Name:");
			  String s = in.next();
			  System.out.println(s);
			  for (int i = 0; i <= earray.length - 1; i++) {
					emp = earray[i];
	  
	     if (null!=emp){
		  if(s.equals(emp.getEmpName())) {  
	  System.out.println("Employee ID: " + emp.getEmpID() + "      " +
		  
			  
	  "Employee Name: " + emp.getEmpName() + "      " +
	  "Employee Mobile Number: " + emp.getEmpMobileNumber() + "      " +
	  "Employee Salary: " + emp.getEmpSalary()); 
	  c++;
	  }
		  }
	   if(c==0) {
	 System.out.println("Enter a Valid Name");
	   }
	  } 
			}else {
	  System.out.println("Insert  the Employee Data first"); 
	  } }
public void UpdateData() {
	int c=0;
	if(earray !=null)
	{
		System.out.println("Enter  the Employee Id of the employee whose details to updated:");
		int x=in.nextInt();
		for (int i = 0; i <= earray.length - 1; i++) {
			emp=earray[i];
			if(null!=emp) {
				if(x==emp.getEmpID()) {
					System.out.println(" do you want to update the Employe Id: yes/no");
					String s1= in.next();
					if(s1.equals("yes")) {
					System.out.println("Enter Empolyee Id to be updated");
					emp.setEmpID(in.nextInt());
				}
		System.out.println("Do you want to update the Employee name:yes /no");
		String s2=in.next();
		if(s2.equals("yes")) {
			System.out.println("enter employee name to be updated:");
		emp.setEmpName(in.next());
		}
		System.out.println("Do you want to update the MobileNumber:yes /no");
		String s4=in.next();
		if(s4.equals("yes")) {
			System.out.println("enter MobileNumberto be updated:");
		emp.setEmpMobileNumber(in.next());
		}
		System.out.println("do you want to update the employee salary:yes/no");
		String s3= in.next();
		if (s3.equals("yes"));
		System.out.println( "Enter ");
		emp.setEmpSalary(in.nextInt());
				}
			}
		
		
		
				}
				}		
		}
	public void PrintData() {
		if (earray != null) { 
			for (int i = 0; i <= earray.length - 1; i++) {
				Employe emp = earray[i];
				if (null != emp) {
					System.out.println("Employee ID: " + emp.getEmpID()
							+ "      " + "Employee Name: " + emp.getEmpName()
							+ "      " + "Employee Mobile Number: "
							+ emp.getEmpMobileNumber() + "      "
							+ "Employee Salary: " + emp.getEmpSalary());
				}
			}
		} else {
			System.out.println("Insert the Employee Data first" + '\n');
		}
	}

	public void Exit() {
		System.out.println("task exited");
	}

	}