package com.vtalent.sanjana;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Date;
public class Employee implements Serializable
	{
	    private String employeeName;
		private int employeeId;
		private double employeePackage;
		private double sal;
		private double pf;
		private double salary;
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
		public void setEmployeeSalary(double salary)
		{
		
			this.salary=salary;
			
		}
		public int getEmployeeId()
		{
			return employeeId;
		}
		public double getEmployeePackage()
		{
			return employeePackage;
		}
		public String getEmployeePackage1()
		{
			String s=String.format("%.2f",employeePackage );
			return s;
		}
		public String getEmployeeName()
		{
			return employeeName;
		}
	
		public double getEmployeeSalary()
		{
			
			return salary;
			
			
		}
		public String getEmployeeSalary1()
		{
			sal=(employeePackage/12);
			pf=(sal*0.02);
			salary=sal-pf;
			//sal=employeePackage/12;
			String s=String.format("%.2f",sal);
			return s;
		}
		public double getEmployeepf()
		{
			return pf;
		}
		
	public String getEmployeepf1()
		{
			String s=String.format("%.2f",pf);
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
			
			this.LoanAmount=loanAmount;
		}
		
		public double getLoanAmount()
		{
			
			return LoanAmount;
		}
		public void setEMI(double emi)
		{
			
			this.EMI=emi;
		}
		
		public double getEMI()	
		{
			

			return EMI;
		}
		public void setTakeHome(double sth)
		{
			
			this.EmpTakeHome=sth;
		}
		
		
		public double getTakeHome()
		{
			double EmpTakeHome=salary-EMI;

			return EmpTakeHome;
		}
		public String getTakeHome1()
		{
			
			double EmpTakeHome=salary-EMI;
			
			String fff=new DecimalFormat("##.##").format(EmpTakeHome);
			return fff;
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

