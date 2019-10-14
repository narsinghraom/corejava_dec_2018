package com.vtalent.prashanth;

import java.util.*;

class EmployeeBean1 {
	private int employeeId;
	private String employeeName;
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
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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
			System.out.println("Plese enter employee Name: ");
			sc.nextLine();
			employeeName = sc.nextLine();
			ae.setEmployeeName(employeeName);
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
			System.out.println("Id="+ae1.employeeId +" "+"Name="+ae1.employeeName+" "+"Salary="+ae1.employeeSalary +" "+"Mobile no="+ae1.employeeMobileNo);
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
					System.out.println("Id="+ae2.employeeId +" "+"Name="+ae2.employeeName+" "+"Salary="+ae2.employeeSalary +" "+"Mobile no="+ae2.employeeMobileNo);
				}
			}
		}
	}
	
	public void search() {
		System.out.println("Enter an employeeId to be search: ");
		int x = sc.nextInt();
		for (int i=0;i<emp1.length;i++) {
			EmployeeBean1 ae3 = (EmployeeBean1)emp1[i];
			if(emp1[i] != null && emp1[i].employeeId == x) {
				System.out.println("Id="+ae3.employeeId +" "+"Name="+ae3.employeeName+" "+"Salary="+ae3.employeeSalary +" "+"Mobile no="+ae3.employeeMobileNo);
				System.out.println("Given employeeId is in the array. ");
				return;
			}
		}
		System.out.println("Employee id not found. ");
	}
	
	public void printAll() {
		for(int i=0;i<emp1.length;i++) {
			if(emp1[i] != null) {
				EmployeeBean1 ae4 = (EmployeeBean1)emp1[i];
				System.out.println("Id="+ae4.employeeId +" "+"Name="+ae4.employeeName+" "+"Salary="+ae4.employeeSalary +" "+"Mobile no="+ae4.employeeMobileNo);
			}
		}
		System.out.println("All the employee details printed successfully. ");
	}
	
	public void searchWithName() {
		boolean flag = false;
		int message=0;
		System.out.println("Enter an employeeName Starting Letter to be search: ");
		char t = sc.next().charAt(0);
		for (int i=0;i<emp1.length;i++) {
			EmployeeBean1 ae5 = (EmployeeBean1)emp1[i];
			if(emp1[i] != null) {
				String e1 = emp1[i].employeeName;
				char[] n = e1.toCharArray();
				if( n[0] == t) {
					flag = true;
					if(message==0) {
						System.out.println("EmployeeName found with " + t + " letter. ");
						message++;
					}
					System.out.println("Id="+ae5.employeeId +" "+"Name="+ae5.employeeName+" "+"Salary="+ae5.employeeSalary +" "+"Mobile no="+ae5.employeeMobileNo);	
				}
			}
		}
		if(!flag) {
			System.out.println("EmployeeName not found with " + t + " letter. ");
		}
	}
	
	public void update() {
		System.out.println("Enter an employeeId to be update: ");
		int c = sc.nextInt();
		for (int i=0;i<emp1.length;i++) {
			EmployeeBean1 ae3 = (EmployeeBean1)emp1[i];
			if(emp1[i] != null && emp1[i].employeeId == c) {
				System.out.println("Given employeeId details. ");
				System.out.println("Id="+ae3.employeeId +" "+"Name="+ae3.employeeName+" "+"Salary="+ae3.employeeSalary +" "+"Mobile no="+ae3.employeeMobileNo);
				System.out.println("Do you want to update employeeId yes or no. ");
				String es = sc.next();
				if(es.equals("yes")) {
					System.out.println("Enter employeeId to be update: ");
					int l = sc.nextInt();
					emp1[i].employeeId = l;
					System.out.println("Employee Id updated successfully. ");
					System.out.println("Id="+ae3.employeeId +" "+"Name="+ae3.employeeName+" "+"Salary="+ae3.employeeSalary +" "+"Mobile no="+ae3.employeeMobileNo);
				}else {
					System.out.print("");
				}
				System.out.println("Do you want to update employeeName yes or no");
				String es1 = sc.next();
				if(es1.equals("yes")) {
					System.out.println("Enter employeeName to be update: ");
					sc.nextLine();
					String s1 = sc.nextLine();
					emp1[i].employeeName = s1;
					System.out.println("Employee Name updated successfully.");
					System.out.println("Id="+ae3.employeeId +" "+"Name="+ae3.employeeName+" "+"Salary="+ae3.employeeSalary +" "+"Mobile no="+ae3.employeeMobileNo);
				}else {
					System.out.print("");
				}
				System.out.println("Do you want to update employeeSalary yes or no");
				String es2 = sc.next();
				if(es2.equals("yes")) {
					System.out.println("Enter employeeSalary to be update: ");
					double d1 = sc.nextDouble();
					emp1[i].employeeSalary = d1;
					System.out.println("Employee Salary updated successfully.");
					System.out.println("Id="+ae3.employeeId +" "+"Name="+ae3.employeeName+" "+"Salary="+ae3.employeeSalary +" "+"Mobile no="+ae3.employeeMobileNo);
				}else {
					System.out.print("");
				}
				System.out.println("Do you want to update employeeMobileNo yes or no");
				String es3 = sc.next();
				if(es3.equals("yes")) {
					System.out.println("Enter employeeMobileNo to be update: ");
					long l1 = sc.nextLong();
					emp1[i].employeeMobileNo = l1;
					System.out.println("Employee MobileNo updated successfully.");
					System.out.println("Id="+ae3.employeeId +" "+"Name="+ae3.employeeName+" "+"Salary="+ae3.employeeSalary +" "+"Mobile no="+ae3.employeeMobileNo);
				}else {
					System.out.println("Employee details successfully updated. ");
					System.out.println("Id="+ae3.employeeId +" "+"Name="+ae3.employeeName+" "+"Salary="+ae3.employeeSalary +" "+"Mobile no="+ae3.employeeMobileNo);
				}
				return;
			}
		}
		System.out.println("Employee id not found. ");
	}
	
}

public class EmployeeTest {

	public static void main(String[] args) {
		
		EmployeeBean1 a = new EmployeeBean1();
		for(;;) {
			Scanner s = new Scanner(System.in);
			System.out.println("Please select your choice: \r\n" +
					"1. insert Into Array.\r\n" + 
					"2. delete from my Array.\r\n" + 
					"3. Search an employee from my Array.\r\n" + 
					"4. Print All the employees from my Array.\r\n" +
					"5. Search an employeeName with letter from my Array.\r\n" +
					"6. Update an employee details.\r\n" +
					"7. Exit.");
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
			case 5: a.searchWithName();
			break;
			case 6: a.update();
			break;
			case 7: 
			System.exit(0);
			default: System.out.println("Please give a valid Input: ");
			
			}
		}
	}

}
