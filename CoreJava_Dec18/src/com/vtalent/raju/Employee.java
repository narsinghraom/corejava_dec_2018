package com.vtalent.raju;
import java.util.Scanner;


public class Employee {
	
	private int employid;
	private String employname;
	private double employpackage;
	private double employsalary;
	private double employpf;
	
	
	public void setEmployId(int employid) {
		this.employid=employid;
	}
	
	public void setEmployname(String employname) {
		this.employname=employname;
	}
	
	public void setEmployPackage(double employpackage) {
		this.employpackage=employpackage;
	}
	
	public int getEmployId() {
		return employid;
	}
		public double getEmployPackage() {
			return employpackage;
		}
		
		public String getEmployname() {
			return employname;
		}
		
		public double employSalary() {
			double a=employpackage/12;	//calculating monthly salary
			employpf =(a*2)/100;	// calculating pf
			employsalary=a-employpf;
			return employsalary;
			//System.out.print("Monthly Salary- "+employsalary+"  "+" Provident Fund(2%)- "+employpf);
		}
		public double employpf() {
			return employpf;
		}
	}