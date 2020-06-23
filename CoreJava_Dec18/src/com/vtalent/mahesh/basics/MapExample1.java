package com.vtalent.mahesh.basics;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
	public static void main(String[] args) {
		Map<ArrayEmployee2, String> m1 = new HashMap<ArrayEmployee2, String>();
		ArrayEmployee2 emp1 = new ArrayEmployee2();
		emp1.setId(10);
		emp1.setEmployeeName("mahesh");
		ArrayEmployee2 emp2 = new ArrayEmployee2();
		emp2.setId(10);
		emp2.setEmployeeName("umesh");
		//by viewing our understanding emp1 and emp2 are same objects
		m1.put(emp1, "First Employee Object");
		m1.put(emp2, "Second Employee Object");
		System.out.println(m1);
		
		
		
	}

}
