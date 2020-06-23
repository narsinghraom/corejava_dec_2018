package com.vtalent.omprakash;

import java.util.*;

public class HashSetExample {
	
	public static void main(String[] args) {
		Set<String> set1=new HashSet<String>();
		String s1="vtalent";
		String s2="info";
		String s3="vtalent";
		System.out.println("hashcode values of the strings are s1=" +s1.hashCode()+ " s2 = "+ s2.hashCode()+ " s3 = " +s3.hashCode());
		 
		set1.add(s1);
		set1.add(s2);
		set1.add(s3);
		set1.add(null);
		set1.add(null);
		System.out.println(set1);
		Iterator <String> i1=set1.iterator();
		while(i1.hasNext()){
			System.out.println(i1.next());	
		}
		if(null!=set1 && !set1.isEmpty()) {
			for(String s:set1) {
				System.out.println(s);
			}
		}
 		
	}
	
}	


