package com.vtalent.corejava.suma;

public class Test {
	
		static EmpBean[] eArray = new EmpBean[2];
		public static void main(String[] args) {
	EmpBean eRef = new EmpBean();
	eRef.setEmpId(100);
	eRef.setEmpSalary(25000);
	eArray[0]= eRef;
	System.out.println(eRef.getEmpSalary());

		}

	}

