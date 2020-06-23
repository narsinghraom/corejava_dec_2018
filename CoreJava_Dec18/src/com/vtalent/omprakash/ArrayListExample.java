package com.vtalent.omprakash;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		//Non-generic Type
		ArrayList al=new ArrayList();
		al.add("Hi");// String
		al.add(new Integer(10));//integer
		System.out.println(al);
		String name=(String) al.get(0);
		Object id=al.get(0);
		
		//Generic type
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Hi");
		al1.add("Hello");
		String s11=al1.get(0);
		al1.add(null);
		al1.add(2, "bye");
		System.out.println(al1);
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("SecondObject");
		al1.addAll(al2);
		
		if(null!=al1 && !al1.isEmpty()) {
			for(String s:al1) {
				System.out.println(s);
			}
		}
		
		Iterator<String> itr= al1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}

		
		
		
		
		
		
		
	


