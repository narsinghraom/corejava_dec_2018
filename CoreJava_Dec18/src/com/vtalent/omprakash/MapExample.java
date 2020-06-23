package com.vtalent.omprakash;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map <Integer, String> m1= new HashMap<Integer ,String>();
		m1.put(100, "firstobject");
		m1.put(200, "secondobject");
		System.out.println(m1);
		
		m1.put(100, "thirdobject");
		m1.put(300, "secondobject");
		System.out.println(m1);
		System.out.println(m1.get(300));
		
		for(Map.Entry<Integer, String> map:m1.entrySet()) {
			System.out.println("Key="+ map.getKey()+"Value= "+ map.getValue());
		}
		
		
		
	}

}
