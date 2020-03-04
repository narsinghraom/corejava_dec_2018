package com.vtalent.corejava.sunil;

public class TestEmployeeBean {

  static EmployeeBean[] eb=new EmployeeBean[2];
	
public static void main(String[] args) {

		EmployeeBean ebn=new EmployeeBean();
        ebn.setEmpId(100);
        ebn.setEmpSalary(2500.00);
        eb[3]=ebn;
		System.out.println("EmpId  :"+ebn.getEmpId());
		System.out.println("EmpSalary  :"+ebn.getEmpSalary());
	}

}
