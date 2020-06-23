package com.vtalent.omprakash;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEmployee {
	
	static ArrayList<Employee1> arrayOfEmployees=new ArrayList<Employee1>();
	
	public static void main(String[] args) {
		Employee1 emp1=new Employee1();
		emp1.setId(10);
		emp1.setEmployeeName("Omprakash");
		Employee1 emp2=new Employee1();
		emp2.setId(10);
		emp2.setEmployeeName("chityala");
		arrayOfEmployees.add(emp1);
		arrayOfEmployees.add(emp2);
		
		Iterator<Employee1>itr=arrayOfEmployees.iterator();
		while(itr.hasNext());
		{
		Employee1 emp=itr.next();
		System.out.println(emp.getId()+emp.getEmployeeName());
		}
		for (Employee1 employee:arrayOfEmployees) {
			System.out.println(employee.getId()+employee.getEmployeeName());		
		}
   }
}
