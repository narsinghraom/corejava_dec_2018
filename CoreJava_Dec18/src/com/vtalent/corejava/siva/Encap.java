package com.vtalent.corejava.siva;

public class Encap {
	private int empId;
	private double empSalary;
	private long empPhoneNo;
	
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	public void setEmpSalary(double empSalary)
	{
		this.empSalary=empSalary;
	}
	public void setEmpPhoneNo(long empPhoneNo)
	{
		this.empPhoneNo=empPhoneNo;
	}
	public int getEmpId()
	{
		return empId;
	}
	public double getEmpSalary()
	{
		return empSalary;
	}
	public long getEmpPhoneNo()
	{
		return empPhoneNo;
	}
}
