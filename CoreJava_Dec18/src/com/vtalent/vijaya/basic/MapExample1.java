package com.vtalent.vijaya.basic;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
	public static void main(String[] args) {
		Map<Employee1, String> m1 = new HashMap<Employee1, String>();
		Employee1 emp1 = new Employee1();
		emp1.setId(10);
		emp1.setEmployeeName("vijaya");
		Employee1 emp2 = new Employee1();
		emp2.setId(10);
		emp2.setEmployeeName("vijaya");
		//by viewing our understanding emp1 and emp2 are same objects
		m1.put(emp1, "First Employee Object");
		m1.put(emp2, "Second Employee Object");
		System.out.println(m1);
		
		
		
	}

}
