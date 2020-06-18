package com.vtalent.corejava.alekya.Threadscollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(100, "firstObject");
		m1.put(200, "secondOject");
		
		System.out.println(m1);
		m1.put(100, "thirdObject");//it will override and gives changed value
		m1.put(300, "secondObject");//values can same key should be unique key means numbers here value is string
		
		
		
		System.out.println(m1.get(300));
		
		System.out.println(m1);
		for(Map.Entry<Integer, String> map : m1.entrySet()) {
			System.out.println("Key = "+map.getKey() + " Value = "+map.getValue());
		}
		

	}

}

