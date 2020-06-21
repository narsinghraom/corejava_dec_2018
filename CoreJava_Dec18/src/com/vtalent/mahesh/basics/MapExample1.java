package com.vtalent.mahesh.basics;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
	public static void main(String[] args) {
		Map<Employee, String> m1 = new HashMap<Employee, String>();
		Employee emp1 = new Employee();
		emp1.setId(10);
		emp1.setEmployeeName("Narsingh");
		Employee emp2 = new Employee();
		emp2.setId(10);
		emp2.setEmployeeName("Narsingh");
		//by viewing our understanding emp1 and emp2 are same objects
		m1.put(emp1, "First Employee Object");
		m1.put(emp2, "Second Employee Object");
		System.out.println(m1);
		
		
		
	}

}
