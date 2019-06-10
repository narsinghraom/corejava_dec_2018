package com.vtalent.praveena;

public class EmployeeDetails {
	
		private int employeeID;
		private double empSalary;
		private String Name;
		private double Package;
		double PF;
		public void setemployeeID(int employeeID)
		{
			this.employeeID=employeeID;
		}
		/*public void setemployeeSalary(double Package)
		{
			double sal=Package/12;
			double PF=sal*0.02;
			this.empSalary=sal-PF;
			
		}*/
		public int getemployeeID()
		{
			return this.employeeID;
		}
		public double getemployeeSalary()
		{
			double sal=this.Package/12;
			double PF=sal*0.02;
			this.empSalary=sal-PF;
			return this.empSalary;
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
		
		/*public void setemployeePF(double Package)
		{
			double sal=Package/12;
			double PF=sal*0.02;
			this.PF=PF;
		}*/
		public double getemployeePF()
		{
			double sal=this.Package/12;
			double PF=sal*0.02;
			this.PF=PF;
			return PF;
		}
	}


