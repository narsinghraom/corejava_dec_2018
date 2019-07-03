package com.vtalent.saritha;

import java.util.*;
//import java.util.Map;

public class Mapex {
	public static void main(String []args){ 
		Map <Integer, String> mapRef=new HashMap<>();
		mapRef.put(10, "hai");
		mapRef.put(20, "hai");
		mapRef.put(30, "hello");
		mapRef.put(10, "hey");
		System.out.println(mapRef);
		Map<Employee,String> mapRef2=new HashMap<>();
		Employee e1=new Employee();
		e1.setID(100);
		Employee e2=new Employee();
		e2.setID(100);
		Employee e3=new Employee();
		e3.setID(100);
		mapRef2.put(e1, "firstemployee");
		mapRef2.put(e2,"secondemployee");
		mapRef2.put(e3,"thirdemployee");
		System.out.println(mapRef2);
		mapRef.get(e1);
		for(Map.Entry<Integer,String> mapObj:mapRef.entrySet()){
			System.out.println(mapObj.getKey()+""+mapObj.getValue());
		}
		Set set=mapRef.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		}
		
		
	}


