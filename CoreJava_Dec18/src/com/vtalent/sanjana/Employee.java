package com.vtalent.sanjana;
import java.io.*;
import java.util.Date;
public class Employee implements Serializable
	{
	    private String employeeName;
		private int employeeId;
		private double employeePackage;
		private double salary;
		private double pf;
		private double LoanAmount;
		private double EMI;
		private int tenure;
		private double EmpTakeHome;
		private Date StartTime;
		private Date EndTime;
		public void setEmployeeId(int employeeId)
		{
			this.employeeId=employeeId;
		}
		public void setEmployeePackage(double employeePackage)
		{
			this.employeePackage=employeePackage;
		}
		public void setEmployeeName(String employeeName)
		{
			this.employeeName=employeeName;
		}
		public int getEmployeeId()
		{
			return employeeId;
		}
		public double getEmployeePackage()
		{
			return employeePackage;
		}
		public String getEmployeeName()
		{
			return employeeName;
		}
	
		public String getEmployeeSalary()
		{
			double sal=employeePackage/12;
			pf=(sal*2)/100;
			salary=sal-pf;
			String s=String.format("%.2f", salary);
			return s;
			
		}
		
		public String getEmployeepf()
		{
			String s=String.format("%.2f", pf);
			return s;
			
		}
		public void setEmployeeTenure(int T)
		{
			this.tenure=T;
		}
		public int getTenure()
		{
			return tenure;
		}
		public void setLoanAmount(double loanAmount)
		{
			loanAmount=5*salary;
			this.LoanAmount=loanAmount;
		}
		
		public String getLoanAmount()
		{
			String s=String.format("%.2f", LoanAmount);
			return s;
		}
		public void setEMI(double emi)
		{
			emi= ((LoanAmount)+(LoanAmount*((0.14*tenure)/12)))/(tenure);
			this.EMI=emi;
		}
		
		public String getEMI()	
		{
			String s=String.format("%.2f", EMI);

			return s;
		}
		public void setTakeHome(double sth)
		{
			sth=salary-EMI;
			this.EmpTakeHome=sth;
		}
		public String getTakeHome()
		{
			
			String s=String.format("%.2f", EmpTakeHome);

			return s;
		}
		public void setStartTime(Date date)
		{
			this.StartTime=date;
		}
		public Date getStartTime()
		{
			return StartTime;
		}
		public void setEndTime(Date date)
		{
			this.EndTime=date;
		}
		public Date getEndTime()
		{
			return EndTime;
		}
		
		public String getLoanAmount1()
		{
			String s=String.format("%.2f",LoanAmount);
			return s;
		}
		public String getEMI1()
		{
			String s=String.format("%.2f",EMI);
			return s;
		}
		
		
		
	}

