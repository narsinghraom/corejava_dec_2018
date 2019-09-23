package com.vtalent.java.prashanth;
import java.util.Scanner;
class EmployeeBean1{
	static Scanner num_emp=new Scanner(System.in);
	private int employeeId;
	private double employeeSalary;
	private long employeeMobileNo;
	public int setEmployeeId(int employeeId) {
		return this.employeeId=employeeId;
	}
	public double setEmployeeSalary(double employeeSalary) {
		return this.employeeSalary=employeeSalary;
	}
	public long setEmployeeMobileNo(long employeeMobileNo) {
		return this.employeeMobileNo=employeeMobileNo;
	}
	public int getEmployeeId() {
		return this.employeeId;
	}
	public double getEmployeeSalary() {
		return this.employeeSalary;
	}
	public long getEmployeeMobileNo() {
		return this.employeeMobileNo;
	}

	
}

public class Test11 extends EmployeeBean1 {
	
	public static void main(String[] args) {
		System.out.println("Please select your choice");
		System.out.println("1.Insert in to array");
		System.out.println("2.Delete from my array");
		System.out.println("3.Search an employee from my Array.");
		System.out.println("4.Print All the employees from my Array.");
		System.out.println("5.Exit.");
		Scanner option=new Scanner(System.in);
		//EmployeeBean obj=new EmployeeBean();
		int opt=option.nextInt();
	
		EmployeeBean[] obj;
		EmployeeBean t1=new EmployeeBean();
		
	
		switch(opt) {
			 
		case 1:System.out.println("Enter Employee details");
			   System.out.println("Please enter no of employees to insert in to array");
			   Scanner in=new Scanner(System.in);
			   int num_emp1=num_emp.nextInt();
			   obj=new EmployeeBean[num_emp1];
			   Scanner empid=new Scanner(System.in);
			   int eid=empid.nextInt();
			   t1.setEmployeeId(eid);
			   Scanner empsal=new Scanner(System.in);
			   double esal=empsal.nextDouble();
			   t1.setEmployeeSalary(esal);
			   Scanner empno=new Scanner(System.in);
			   long eno=empno.nextLong();
			   t1.setEmployeeMobileNo(eno);
			   for (int i = 0; i < obj.length; i++) {
				   obj[i]=t1;
				
			}
			   
			break;
		case 2:System.out.println("Delete employee details");
			break;
		case 3:System.out.println("search Employee details");
			break;
		case 4:System.out.println("Print all the emplyees from the array");
			break;
		case 5:System.out.println("Exit");
			break;
		default:
			System.out.println("Invalid input please give proper input");
		}
		
			
		

	}

}

