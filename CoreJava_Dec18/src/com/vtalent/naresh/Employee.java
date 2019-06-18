package com.vtalent.naresh;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Scanner;

public class Employee implements Serializable {
	
	private int employid;
	private String employname;
	private double employpackage;
	private double employsalary;
	private double employpf;
	private double loanamount;
	private double emi;
	private int tenure;
	
	Scanner sc=new Scanner(System.in);
	
	public void setEmployId(int employid) {
		this.employid=employid;
	}
	
	public void setEmployname(String employname) {
		this.employname=employname;
	}
	
	public void setEmployPackage(double employpackage) {
		this.employpackage=employpackage;
	}
	public void setEmploySalary(double employsalary) {
		
		this.employsalary=employsalary;
	}
	
	public void setEmployPf(double employpf) {
		this.employpf=employpf;
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
		
		public double getEmploySalary() {
			double a=employpackage/12;	//calculating monthly salary
			employpf =(a*2)/100;	// calculating pf
			employsalary=a-employpf;
			return employsalary;
		
			//System.out.print("Monthly Salary- "+employsalary+"  "+" Provident Fund(2%)- "+employpf);
		}
		public double getEmployPf() {
			return employpf;
		}
		
		public void setLoanAmount(double loanamount) {
			this.loanamount=loanamount;
		}
		
		public double getLoanAmount() {
			return loanamount;
		}
		
		public void setEmi(double emi) {
			this.emi=emi;
		}
		public double  getEmi() {
			return emi;
			
		}
		public void setTenure(int tenure) {
						this.tenure=tenure;
		}
		public int getTenure() {
				return tenure;
			}
			
			public double getTakeHome() {
				employsalary=employsalary-emi;
				return employsalary;
			}
			
			public void date( ) {
				Calendar startdate=Calendar.getInstance();
				 System.out.println("Start Date of Loan: "+startdate.getTime());
				 startdate.add(Calendar.MONTH, tenure);
				 System.out.println("End Date of Loan:"+startdate.getTime());

			} 
		
		}

	
