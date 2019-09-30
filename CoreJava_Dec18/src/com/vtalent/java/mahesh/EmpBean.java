package com.vtalent.java.mahesh;

import java.util.Scanner;

public class EmpBean {
	private int EID;
	private String EName;
	private double ESalary;
	private long EMobileNumber;

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

	public void setEmpMobileNumber(long empMobileNumber) {
		this.EMobileNumber = empMobileNumber;
	}

	public long getEmpMobileNumber() {
		return EMobileNumber;
	}
}

class Employe extends EmpBean {

	static Employe emp;

	static Employe[] earray;
	
	Scanner in = new Scanner(System.in);

	public static void InsertData(Employe emp) {
		if (earray != null) {
			for (int i = 0; i <= earray.length - 1; i++) {
				if (earray[i] == null) {
					earray[i] = emp;
					break;
				}
			}
			System.out.println("Sucessfully Inserted." + '\n');
		} else {
			System.out.println("Already Inserted." + '\n');
		}
	}

	public void DeleteData() {
		int c=0;
		if (earray != null) {
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
			}if (c == 0) {
				System.out.println("Enter Valid ID");
			}
		}
	}else{
		System.out.println("No data found! Insert the Employee Data first");
	}
}
	
	public void searchData() {
		int c=0;
		if (earray != null) {
			System.out.println("Enter The Employee ID:");
			int x = in.nextInt();
			for (int i = 0; i <= earray.length - 1; i++) {
				emp = earray[i];
				if (null!=emp) {
				if (x == emp.getEmpID()) {
						System.out.println("Employee ID: " + emp.getEmpID()
								+ "      " + "Employee Name: "
								+ emp.getEmpName() + "      "
								+ "Employee Mobile Number: "
								+ emp.getEmpMobileNumber() + "      "
								+ "Employee Salary: " + emp.getEmpSalary());
						c++;
				}
				} 
				}if(c==0){
					System.out.println("Enter valid ID");
				}
		}else{
			System.out.println("No data found! Insert the Employee Data first");
		}
	}
	
	  /*if (earray != null) {
			System.out.println("Enter The Employee name:");
			String x = in.next();
			for (int i = 0; i <= earray.length - 1; i++) {
				emp = earray[i];
				if (null!=emp) {
				if (x.equals(emp.getEmpName())) {
						System.out.println("Employee ID: " + emp.getEmpID()
								+ "      " + "Employee Name: "
								+ emp.getEmpName() + "      "
								+ "Employee Mobile Number: "
								+ emp.getEmpMobileNumber() + "      "
								+ "Employee Salary: " + emp.getEmpSalary());
					}
				}
			else if (x!=emp.getEmpName()){
				System.out.println("Enter the Valid name");
				}
				}
			}
	  else {
	  System.out.println("Insert  the Employee Data first"); 
	  } 
	  }*/
	public void UpdateData() {
		int c=0;
		if (earray != null) {
			System.out.println("Enter The Employee ID of the employee whose details to be updated:");
			int x = in.nextInt();
			for (int i = 0; i <= earray.length - 1; i++) {
				emp = earray[i];
				if (null!=emp) {
				if (x == emp.getEmpID()) {
					System.out.println("Do you want to update the Employee ID?\t"+(emp.getEmpID())+"\ty/n:");
					String s1=in.next();
					if(s1.equals("yes")){
						System.out.println("Enter ID to be updated:");
						emp.setEmpID(in.nextInt());
					}
					System.out.println("Do you want to update the Employee Name?\t"+ (emp.getEmpName()) +"\ty/n:");
					String s2=in.next();
					if(s2.equals("yes")){
						System.out.println("Enter Name to be updated:");
						emp.setEmpName(in.next());
					}
					System.out.println("Do you want to update the Employee Mobile Number?\t" +(emp.getEmpMobileNumber())+"\ty/n:");
					String s3=in.next();
					if(s3.equals("yes")){
						System.out.println("Enter Mobile Number to be updated:");
						emp.setEmpMobileNumber(in.nextLong());
					}
					System.out.println("Do you want to update the Employee Salary?\t"+(emp.getEmpSalary())+"\ty/n:");
					String s4=in.next();
					if(s4.equals("yes")){
						System.out.println("Enter Salary to be updated:");
						emp.setEmpSalary(in.nextDouble());
						c++;
						System.out.println("Updated succesfully");
					}
				}
				}
				}if(c==0){
					System.out.println("Enter valid ID");
				}
		}else{
			System.out.println("No data found! Insert the Employee Data first");
		}
	  }
	public void PrintData() {
		int c=0;
		if (earray != null) { 
			for (int i = 0; i <= earray.length - 1; i++) {
				Employe emp = earray[i];
				if (null != emp) {
					System.out.println("Employee ID: " + emp.getEmpID()
							+ "      " + "Employee Name: " + emp.getEmpName()
							+ "      " + "Employee Mobile Number: " + emp.getEmpMobileNumber() + "      "
							+ "Employee Salary: " + emp.getEmpSalary());
					c++;
				}
			}if(c==0){
				System.out.println("Enter valid ID");
			}
		} else {
			System.out.println("No data found! Insert the Employee Data first" + '\n');
		}
	}

	public void Exit() {
		System.out.println("task exited");
	}
}