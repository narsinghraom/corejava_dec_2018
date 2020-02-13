package com.vtalent.jhansi.basics;

public class Testemp {
	public static void main(String[] args) {
		EmployeeBean empref=new EmployeeBean();
		empref.setEmployeeId(100);
		empref.setEmployeesalary(25000);
		System.out.println("Id="+empref.getEmployeeId());
		System.out.println("salary="+empref.getEmployeesalary());
	}

}


