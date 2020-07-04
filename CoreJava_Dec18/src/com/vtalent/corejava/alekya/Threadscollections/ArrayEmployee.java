package com.vtalent.corejava.alekya.Threadscollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEmployee {
	
	static ArrayList<Employee> arrayOfEmployees = new ArrayList<Employee>();
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setId(02);
		emp1.setEmployeeName("Alekya");
		Employee emp2 = new Employee();
		emp2.setId(20);
		emp2.setEmployeeName("Avadutha");
		arrayOfEmployees.add(emp1);
		arrayOfEmployees.add(emp2);
		
		Iterator<Employee> itr = arrayOfEmployees.iterator();//either u can use iterator method or for each method anyone is fine.
		while(itr.hasNext()) {
			Employee emp =itr.next();
			System.out.println(emp.getId() + emp.getEmployeeName());
		}
		
		for(Employee employee : arrayOfEmployees) {//for each
			System.out.println(employee.getId() + employee.getEmployeeName());
		}
	}

}
