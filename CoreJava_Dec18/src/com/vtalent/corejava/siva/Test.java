package com.vtalent.corejava.siva;

class EmployeeBean {
	private int empId;
	private double empSalary;
	
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	
	public void setEmpSalary(double empSalary)
	{
		this.empSalary=empSalary;
	}
	public int getEmpId()
	{
		return empId;
	}
	public double getEmpSalary()
	{
		return empSalary;
	}
	
}
public class Test
{
	static EmployeeBean[] eArray=new EmployeeBean[2];
	public static void main(String[] args) {
		EmployeeBean eRef=new EmployeeBean();
		eRef.setEmpId(100);
		eRef.setEmpSalary(25000.00);
		eArray[0]=eRef;
		System.out.println("EMP ID "+eRef.getEmpId());
		System.out.println("EMP Salary "+eRef.getEmpSalary());
		
	}
}
