package com.vtalent.corejava.avinash;

public class Test {
	static EmployeeBean[]eArray=new EmployeeBean[2];
	public static void main(String[]args) {
		EmployeeBean eRy=new EmployeeBean();
		//eRy.empId=100;
		eRy.setEmpId(100);
		eRy.setEmpSalary(25000.00);
		eArray[0]=eRy;
		System.out.println("EmpId="+eRy.getEmpId());
	}
}
