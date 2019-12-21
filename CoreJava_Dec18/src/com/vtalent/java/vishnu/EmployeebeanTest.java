package com.vtalent.java.vishnu;
import java.util.*;
class EmployeeBean1 {
	private int employeeId;
	private double employeeSalary;
	private long employeeMobileNo;
	static EmployeeBean1[] emp1;
	static Scanner sc = new Scanner(System.in);
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalaray(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public long getEmployeeMobileNo() {
		return employeeMobileNo;
	}
	public void setEmployeeMobileNo(long employeeMobileNo) {
		this.employeeMobileNo = employeeMobileNo;
	}
	
	public void insert() {
		System.out.println("Please enter no of employees to insert in to Array: ");
		int z = sc.nextInt();
		emp1 = new EmployeeBean1[z];
		
		for(int i=0;i<emp1.length;i++) {
			EmployeeBean1 ae = new EmployeeBean1();
			System.out.println("Please enter employee Id: ");
			employeeId = sc.nextInt();
			ae.setEmployeeId(employeeId);
			System.out.println("Please enter Salary: ");
			employeeSalary = sc.nextDouble();
			ae.setEmployeeSalaray(employeeSalary);
			System.out.println("Please enter Mobile no: ");
			employeeMobileNo = sc.nextLong();
			ae.setEmployeeMobileNo(employeeMobileNo);
			emp1[i] = ae;
		}
		for(int i=0;i<emp1.length;i++) {
			EmployeeBean1 ae1 = (EmployeeBean1)emp1[i];
			System.out.println("Id="+ae1.employeeId +" "+"Salary="+ae1.employeeSalary +" "+"Mobile no="+ae1.employeeMobileNo);
		}
		System.out.println("Employee data inserted successfully in to the Array. ");
	}
	
	public void delete() {
		System.out.println("Enter an employeeId to be delete. ");
		int w = sc.nextInt();
		int i,count=0;
		for(i=0; i<emp1.length; i++) {
			if(emp1[i]!=null && emp1[i].employeeId == w){
				emp1[i]=null;
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.println("Employee Id Not Found..!!");
		} else {
			System.out.println("Employee id Deleted Successfully..!!");
			System.out.println("Now the New Array is : ");
			for(i=0; i<emp1.length; i++) {
				if(emp1[i] != null) {
					EmployeeBean1 ae2 = (EmployeeBean1)emp1[i];
					System.out.println("Id="+ae2.employeeId +" "+"Salary="+ae2.employeeSalary +" "+"Mobile no="+ae2.employeeMobileNo);
				}
			}
		}
	}
	
	public void search() {
		System.out.println("Enter an employeeId to be search: ");
		int x = sc.nextInt();
		for (int i=0;i<emp1.length;i++) {
			if(emp1[i] != null) {
				EmployeeBean1 ae3 = (EmployeeBean1)emp1[i];
				if(emp1[i].employeeId == x) {
					System.out.println("Id="+ae3.employeeId +" "+"Salary="+ae3.employeeSalary +" "+"Mobile no="+ae3.employeeMobileNo);
					System.out.println("Given employeeId is in the array. ");
					return;
				}
			}
		}
		System.out.println("Employee id not found. ");
	}
	
	public void printAll() {
		for(int i=0;i<emp1.length;i++) {
			if(emp1[i] != null) {
				EmployeeBean1 ae4 = (EmployeeBean1)emp1[i];
				System.out.println("Id="+ae4.employeeId +" "+"Salary="+ae4.employeeSalary +" "+"Mobile no="+ae4.employeeMobileNo);
			}
		}
		System.out.println("All the employee details printed successfully. ");
	}
		
}

public class EmployeebeanTest {



	public static void main(String[] args) {
		
		EmployeeBean1 a = new EmployeeBean1();
		for(;;) {
			Scanner s= new Scanner(System.in);
			System.out.println("Please select your choice: \r\n" +
					"1. insert Into Array.\r\n" + 
					"2. delete from my Array.\r\n" + 
					"3. Search an employee from my Array.\r\n" + 
					"4. Print All the employees from my Array.\r\n" + 
					"5. Exit.");
			int scan = s.nextInt();
			switch(scan) {
			case 1: a.insert();
			break;
			case 2: a.delete();
			break;
			case 3: a.search();
			break;
			case 4: a.printAll();
			break;
			case 5: 
			System.exit(0);
			default: System.out.println("Please give a valid Input: ");
			
			}
		}
	}

}
