package com.vtalent.mahesh.basics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEmployee {
	
	static ArrayList<ArrayEmployee2> arrayOfEmployees = new ArrayList<ArrayEmployee2>();
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setId(10);
		emp1.setEmployeeName("mahesh");
		Employee emp2 = new Employee();
		emp2.setId(20);
		emp2.setEmployeeName("gaddam");
		arrayOfEmployees.add(emp1);
		arrayOfEmployees.add(emp2);
		
		Iterator<Employee> itr = arrayOfEmployees.iterator();
		while(itr.hasNext()) {
			Employee emp =itr.next();
			System.out.println(emp.getId() + emp.getEmployeeName());
		}
		
		for(Employee employee : arrayOfEmployees) {
			System.out.println(employee.getId() + employee.getEmployeeName());
		}
	}

}
