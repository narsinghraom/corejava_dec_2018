package com.vtalent.vijaya.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.String;

public class ArrayListExample {
	public static void main(String[] args) {
		//non-generic type
		ArrayList al=new ArrayList();
		al.add("Hi");
		al.add(new Integer(10));
		System.out.println(al);
		String name=(String) al.get(0);
		Object id=al.get(1);
		//generic type
		ArrayList<String> all=new ArrayList();
		all.add("Hi");
		all.add("Hello");
		String s11=all.get(0);
		all.add(null);
		all.add(2,"bye");
		System.out.println(all);
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("secondobject");
		all.addAll(al2);
		Iterator<String> itr=all.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	
	}

}
