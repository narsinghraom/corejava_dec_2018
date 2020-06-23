package com.vtalent.srinu;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(100, "firstObject");
		m1.put(200, "secondOject");
		
		System.out.println(m1);
		m1.put(100, "thirdObject");
		m1.put(300, "secondObject");
		
		System.out.println(m1.get(300));
		
		System.out.println(m1);
		for(Map.Entry<Integer, String> map : m1.entrySet()) {
			System.out.println("Key = "+map.getKey() + " Value = "+map.getValue());
		}
		

	}

}
