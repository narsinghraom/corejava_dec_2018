package com.vtalent.vijaya.basic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEmployee {
	
	static ArrayList<Employee1> arrayOfEmployees = new ArrayList<Employee1>();
	
	public static void main(String[] args) {
		Employee1 emp1 = new Employee1();
		emp1.setId(10);
		emp1.setEmployeeName("vijaya");
		Employee1 emp2 = new Employee1();
		emp2.setId(20);
		emp2.setEmployeeName("vijju");
		arrayOfEmployees.add(emp1);
		arrayOfEmployees.add(emp2);
		
		Iterator<Employee1> itr = arrayOfEmployees.iterator();
		while(itr.hasNext()) {
			Employee1 emp =itr.next();
			System.out.println(emp.getId()+"\t"+ emp.getEmployeeName());
		}
		
		for(Employee1 employee : arrayOfEmployees) {
			System.out.println(employee.getId()+"\t" + employee.getEmployeeName());
		}
	}

}
