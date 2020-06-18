package com.vtalent.jyothsna;

import java.util.HashMap;
import java.util.Map;



public class MapExample1 {
	public static void main(String[] args) {
		Map<Employee1, String> m1 = new HashMap<Employee1, String>();
		Employee1 emp3 = new Employee1();
		emp3.setId(10);
		emp3.setEmployeeName("jyothsna");
		Employee1 emp4 = new Employee1();
		emp4.setId(10);
		emp4.setEmployeeName("jyothsna");
		//by viewing our understanding emp1 and emp2 are same objects
		m1.put(emp3, "First Employee Object");
		m1.put(emp4, "Second Employee Object");
		System.out.println(m1);
		
		
		
	}

}
