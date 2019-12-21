package com.vtalent.java.haritha.narsingh;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<HashCodeEx, String> mapObjRef=new HashMap<HashCodeEx, String>();
		HashCodeEx h1 = new HashCodeEx();
		h1.str ="ABC";
		h1.i=10;
		HashCodeEx h2 = new HashCodeEx();
		h2.str ="ABC";
		h2.i=10;
		mapObjRef.put(h1,"FirstObject");
		mapObjRef.put(h2,"Second Object");
		
		
		
		
		
		
		Map<Integer, String> mapRef = new HashMap<Integer, String>();
		mapRef.put(100, "Abc");
		mapRef.put(100,"Abcdf");
		Set<Map.Entry<Integer, String>> setRef = mapRef.entrySet();
		for(Map.Entry<Integer, String> mapObj : setRef) {
			System.out.println(mapObj.getKey() +" "+mapObj.getValue());
		}
		
	}

}
