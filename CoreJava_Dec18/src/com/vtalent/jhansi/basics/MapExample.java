package com.vtalent.jhansi.basics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> m1 = new HashMap<Integer , String>();
		m1.put(100 , "firstObject");
		m1.put(200, "secondObject");
		System.out.println(m1);
		m1.put(100, "thirdObject");
		m1.put(300, "secondObject");
		System.out.println(m1.get(200));
		System.out.println(m1);
		for(Map.Entry<Integer, String> map : m1.entrySet()) {
			System.out.println("key = " + map.getKey()+"value = "+ map.getValue());
		}

		
	}

}
