package com.vtalent.jhansi.basics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEmployee {
	
	static ArrayList<Emp> arrayOfEmployees = new ArrayList<Emp>();
	
	public static void main(String[] args) {
		Emp emp3 = new Emp();
		emp3.setId(10);
		emp3.setEmployeeName("Jhansi");
		Emp emp4 = new Emp();
		emp4.setId(20);
		emp4.setEmployeeName("Jyotshna");
		arrayOfEmployees.add(emp3);
		arrayOfEmployees.add(emp4);
		
		Iterator<Emp> itr = arrayOfEmployees.iterator();
		while(itr.hasNext()) {
			Emp emp = itr.next();
			System.out.println(emp.getId() + emp.getEmployeeName());
		}
		
		for(Emp employee : arrayOfEmployees) {
			System.out.println(employee.getId() + employee.getEmployeeName());
		}
	}

}
