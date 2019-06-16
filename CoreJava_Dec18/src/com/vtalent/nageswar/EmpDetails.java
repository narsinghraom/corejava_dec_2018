package com.vtalent.nageswar;

import java.io.Serializable;
import java.util.Date;

public class EmpDetails implements Serializable{
		
			private int employeeID;
			private String Name;
			private double empSalary;
			private double Package;
			double PF;
			double LoanAmount;
			double EMI;
			int tenure;
			double EmpTakeHome;
			Date StartTime;
			Date EndTime;
			public void setemployeeID(int employeeID)
			{
				this.employeeID=employeeID;
			}
			
			public int getemployeeID()
			{
				return this.employeeID;
			}
			
			public void setemployeeName(String name)
			{
				this.Name=name;
			}
			public String getemployeeName()
			{
				return Name;
			}
			public void setemployeePackage(double Package)
			{
				this.Package=Package;
			}
			public double getemployeePackage()
			{
				return Package;
			}
			public void setemployeeTenure(int T)
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
			
			public double getemployeeSalary()
			{
				double sal=this.Package/12;
				double PF=sal*0.02;
				this.empSalary=sal-PF;
				return this.empSalary;
			}
			
			public double getemployeePF()
			{
				
				double sal=this.Package/12;
				double PF=sal*0.02;
				this.PF=PF;
				return PF;
			}
			public void setEMI(double emi)
			{
				this.EMI=emi;
			}
			
			public double getEMI()	
			{
				
				return EMI;
			}
			public double getTakeHome()
			{
				EmpTakeHome=this.empSalary-this.EMI;
				return EmpTakeHome;
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
			
			
	}


		 
		





