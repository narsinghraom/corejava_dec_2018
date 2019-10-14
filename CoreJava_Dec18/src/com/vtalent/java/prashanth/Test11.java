package com.vtalent.java.prashanth;
import java.util.Scanner;
class EmployeeBean1{
	
	private int employeeId;
	private double employeeSalary;
	private long employeeMobileNo;
	private String employeeName;
	public int setEmployeeId(int employeeId) {
		return this.employeeId=employeeId;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary=employeeSalary;
	}
	public void setEmployeeMobileNo(long employeeMobileNo) {
			this.employeeMobileNo=employeeMobileNo;
	}
	public void setEmployeeName(String employeeName) {
		 this.employeeName=employeeName;
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
	public String getEmployeeName() {
		return this.employeeName;
	}
	
}

public class Test11 extends EmployeeBean1 {
	static Scanner s=new Scanner(System.in);
	static EmployeeBean1 emp;
	EmployeeBean1[] employee_array;
	public void insert() {
		System.out.println("Please enter no of employees to insert in to array");
		   Scanner in=new Scanner(System.in);
		   int num_emp=in.nextInt();
		   employee_array=new EmployeeBean1[num_emp];
		   for(int i=0;i<num_emp;i++)
		   {
		   EmployeeBean1 emp=new EmployeeBean1();	
		   System.out.println("Enter Employee Id");
		   int eid=s.nextInt();
		   emp.setEmployeeId(eid);
		   System.out.println("please enter employee name");
		   String ename=s.next();
		   emp.setEmployeeName(ename);
		   System.out.println("Enter Employee Salary");
		   double esal=s.nextDouble();
		   emp.setEmployeeSalary(esal);
		   System.out.println("Enter employee Mobile Number");
		   long eno=s.nextLong();
		   emp.setEmployeeMobileNo(eno);
		   employee_array[i]=emp;
		   }
		   for (int j = 0; j <employee_array.length; j++) {
			   
			EmployeeBean1 em1 =employee_array[j];
	        System.out.println("id="+em1.getEmployeeId()+"  "+""
	        		+ "Salary="+em1.getEmployeeSalary()+"  "+""
	        		+ "MobileNumber="+em1.getEmployeeMobileNo());
		   }   		 
	}
	
	public static void main(String[] args) {
		System.out.println("Please select your choice");
		System.out.println("1.Insert in to array");
		System.out.println("2.Delete from my array");
		System.out.println("3.Search an employee from my Array.");
		System.out.println("4.Print All the employees from my Array.");
		System.out.println("5.Exit.");
		int opt=s.nextInt();
	for(;;) {
		switch(opt) {
			 
		case 1:System.out.println("Enter Employee details");  
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

}

