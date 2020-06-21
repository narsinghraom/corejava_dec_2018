package com.vtalent.mahesh.basics;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayEmployee {
static ArrayList<ArrayEmployee2> arrayOfEmployees = new ArrayList<ArrayEmployee2>();
	
	public static void main(String[] args) {
		ArrayEmployee2 emp3 = new ArrayEmployee2();
		emp3.setId(10);
		emp3.setEmployeeName("mahesh");
		ArrayEmployee2 emp4 = new ArrayEmployee2();
		emp4.setId(20);
		emp4.setEmployeeName("umesh");
		arrayOfEmployees.add(emp3);
		arrayOfEmployees.add(emp4);
		
		Iterator<ArrayEmployee2> itr = arrayOfEmployees.iterator();
		while(itr.hasNext()) {
			ArrayEmployee2 emp =itr.next();
			System.out.println(emp.getId() + emp.getEmployeeName());
		}
		
		for(ArrayEmployee2 employee : arrayOfEmployees) {
			System.out.println(employee.getId() + employee.getEmployeeName());
		}
	}
}

