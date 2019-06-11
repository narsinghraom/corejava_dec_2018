package com.vtalent.sanjana;
import java.io.*;
public class Employee implements Serializable
	{
	    private String employeeName;
		private int employeeId;
		private double employeePackage;
		double salary;
		double pf;
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
	
		public double getEmployeeSalary()
		{
			double sal=employeePackage/12;
			pf=(sal*2)/100;
			salary=sal-pf;
			return salary;
		}
		
		public double getEmployeepf()
		{
			
			return pf;
		}
			
	}

