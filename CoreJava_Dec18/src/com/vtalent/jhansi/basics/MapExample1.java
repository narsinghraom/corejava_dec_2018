package com.vtalent.jhansi.basics;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {

	public static void main(String[] args) {
		Map<Emp , String> m1 = new HashMap<Emp , String>();
		Emp emp1 = new Emp();
		emp1.setId(10);
		emp1.setEmployeeName("Jhansi");
		Emp emp2 = new Emp();
		emp2.setId(10);
		emp2.setEmployeeName("Jhansi");
		
		m1.put(emp1, "First Employee Object");
		m1.put(emp2, "Second Employee Object");
		System.out.println(m1);
		
	}

}
