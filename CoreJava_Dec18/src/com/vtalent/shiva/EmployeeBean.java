package com.vtalent.shiva;

import java.util.Scanner;

public class EmployeeBean {
	private int id;
	
	private long mobile;
	private double salary;
	static EmployeeBean[] eb;
	
	
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	public void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter no of employees to insert in to Array: ");
		int a = sc.nextInt();
		eb = new EmployeeBean[a];
		
		for(int i=0;i<eb.length;i++) { 
			EmployeeBean e = new EmployeeBean();
			
			System.out.println("Please enter Id");
			e.id = sc.nextInt();
			
			System.out.println("Please enter salary");
			e.salary = sc.nextDouble();
			System.out.println("Please enter mobileno");
			e.mobile = sc.nextInt();
			eb[i] = e;
		}
		for (int i=0;i<eb.length;i++) {
			EmployeeBean ae=(EmployeeBean)eb[i];
			System.out.println("id=" + ae.id + " salary="+ae.salary + " mobileno=" + ae.mobile);
		}
	}
	public void printAll() {
		for (int i=0;i<eb.length;i++) {
			EmployeeBean ae1=(EmployeeBean)eb[i];
			System.out.println("id="+ae1.id +"salary="+ae1.salary+"mobileno="+ae1.mobile);
		}
	}
	public void delete() {
		for (int i=0;i<eb.length;i++) {
			EmployeeBean ae1=(EmployeeBean)eb[i];
			System.out.println("id="+ae1.id +"salary="+ae1.salary+"mobileno="+ae1.mobile);// TODO Auto-generated method stub
		
	}
	}
}