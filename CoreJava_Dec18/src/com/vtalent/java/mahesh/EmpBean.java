package com.vtalent.java.mahesh;
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
class Employe extends EmpBean{
	
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
		}
		else {
			System.out.println("Already Inserted." + '\n');
		}
	}
	public void DeleteData(){
		if(earray!=null){
			for (int i = 0; i <= earray.length - 1; i++) {
				emp = earray[i];
				System.out.println(emp.getEmpID());
			}
			System.out.println("enter id to be deleted");
			int del = in.nextInt();
			if (null!=emp) {
				for (int i = 0; i < earray.length - 1; i++) {
					 earray[i]=emp;
					if (earray[i]!=null&& emp.getEmpID()==del) {
						earray[i]=null;
						System.out.println("deleted succesfully");
					}
				}
			}
		}
	 else {
		System.out.println("no data found! please insert data first");
	}
	}
	public void searchData() {
		if (earray != null) {
			System.out.println("Enter The Employee ID:");
			int x = in.nextInt();
			for (int i = 0; i <= earray.length - 1; i++) {
				emp = earray[i];
				if (null!=emp){
				if (x == emp.getEmpID()) {
					System.out.println("Employee ID: " + emp.getEmpID() 
							+ "      " + "Employee Name: " + emp.getEmpName()
							+ "      " + "Employee Mobile Number: " + emp.getEmpMobileNumber() 
							+ "      " + "Employee Salary: " + emp.getEmpSalary());
								
				}
				}
				 else {
					System.out.println("Enter the Valid Id" + '\n');
				}
				
		}
	}		
		 else {
			System.out.println("Insert  the Employee Data first" + '\n');
		}
	}
	public void PrintData() {
		if (earray != null) {
			
			for (int i = 0; i <= earray.length - 1; i++) {
				Employe emp = earray[i];
				if(null != emp){
					System.out.println("Employee ID: " + emp.getEmpID() 
							+ "      " + "Employee Name: " + emp.getEmpName()
							+ "      " + "Employee Mobile Number: " + emp.getEmpMobileNumber()  
							+ "      " + "Employee Salary: " + emp.getEmpSalary() );
				}
				
			}
			} 
		else {
			System.out.println("Insert the Employee Data first" + '\n');
		}
	}
	public void Exit(){
		System.out.println("task exited");
	}
	}