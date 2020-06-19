package com.vtalent.jyothsna;

import java.util.ArrayList;
import java.util.Iterator;

import com.vtalent.narsingh.collections.Employee;

public class ArrayEmployee {
static ArrayList<Employee1> arrayOfEmployees = new ArrayList<Employee1>();
	
	public static void main(String[] args) {
		Employee1 emp3 = new Employee1();
		emp3.setId(10);
		emp3.setEmployeeName("jyothsna");
		Employee1 emp4 = new Employee1();
		emp4.setId(20);
		emp4.setEmployeeName("Mothe");
		arrayOfEmployees.add(emp3);
		arrayOfEmployees.add(emp4);
		
		Iterator<Employee1> itr = arrayOfEmployees.iterator();
		while(itr.hasNext()) {
			Employee1 emp =itr.next();
			System.out.println(emp.getId() + emp.getEmployeeName());
		}
		
		for(Employee1 employee : arrayOfEmployees) {
			System.out.println(employee.getId() + employee.getEmployeeName());
		}
	}
}
