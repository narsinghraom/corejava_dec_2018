package com.vtalent.praveena;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class EmployeeDetails implements Serializable {
	
		private int employeeID;
		private String Name;
		private double ActualSal;
		private double empSalary;
		private double Package;
		private double PF;
		private double LoanAmount;
		private double EMI;
		private int tenure;
		private double EmpTakeHome;
		private Date StartTime;
		private Date EndTime;
		//private String S="N/A";
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
		public double getempActualSal()
		{
			this.ActualSal=this.Package/12;
			return ActualSal;
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
			String.format("%.2f", LoanAmount);
			return LoanAmount;
		}
		
		public double getemployeeSalary()
		{
			double PF=ActualSal*0.02;
			this.empSalary=ActualSal-PF;
			return this.empSalary;
		}
		
		public double getemployeePF()
		{
			
			double PF=ActualSal*0.02;
			this.PF=PF;
			return PF;
		}
		public void setEMI(double emi)
		{
			this.EMI=emi;
		}
		
		public double getEMI()	
		{
			String.format("%.2f", EMI);

			return EMI;
		}
		public double getTakeHome()
		{
			EmpTakeHome=this.ActualSal-this.PF-this.EMI;
			String.format("%.2f", EmpTakeHome);

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
		
		//Returning double values with only 2 digits after decimal
		
		public String getempActualSal1()
		{
		
		this.ActualSal=this.Package/12;
		String S=String.format("%.2f", ActualSal);	
		return S;
		}
		public String getemployeePF1()
		{
			double PF=ActualSal*0.02;
			this.PF=PF;
			String S=String.format("%.2f", PF);
			return S;
		}
		public String getLoanAmount1()
		{
						
			String S=String.format("%.2f", LoanAmount);
			return S;
		}
		public String getEMI1()
		{
		
			String S=String.format("%.2f", EMI);
			return S;
		}
		public String getTakeHome1()
		{
			EmpTakeHome=this.ActualSal-this.PF-this.EMI;
			String S=String.format("%.2f", EmpTakeHome);

			return S;
		}
		/*public String getTenure1()
		{
			String S=String S=String.format("%.2f", Tenure);
			return S;
		}
		public String getStartDate1()
		{
			String S=String S=String.format("%.2f",StartTime );
			return S;
		}
		public String getEndDate1()
		{
			return S;
		}*/
		
}


		
		/*public void setemployeePF(double Package)
		{
			double sal=Package/12;
			double PF=sal*0.02;
			this.PF=PF;
		}*/
		/*public void setemployeeSalary(double Package)
		{
			double sal=Package/12;
			double PF=sal*0.02;
			this.empSalary=sal-PF;
			
		}*/
	


