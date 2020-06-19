package com.vtalent.mallikarjun.basics;

import java.util.ArrayList;

public class Collections_ArrayListAllMethods {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add(null);
		al.add("10");
		al.add("b");
		System.out.println(al);
		System.out.println(al.size());
		
		ArrayList<Object> al1=new ArrayList<>();
		al1.add("c");
		al1.add(55);
		al1.add(6);
		System.out.println(al1);
		
		al1.addAll(al);
		System.out.println(al1);
		/*
		 * al.addAll(al1); System.out.println(al);
		 */
		al1.add(al);
		System.out.println(al1);
		System.out.println(al);
		/*
		 * al.add(al1); System.out.println(al);
		 */
		System.out.println(al1.contains(al));
		System.out.println(al.contains(al1));
		System.out.println();
		System.out.println(al1.containsAll(al));
		System.out.println(al.containsAll(al1));
		System.out.println();
		System.out.println(al1.removeAll(al));
		System.out.println(al1);
		System.out.println(al);
		System.out.println(al.removeAll(al1));
		System.out.println(al1);
		System.out.println(al);
		
		System.out.println();
		al1.add("c");
		al1.add(55);
		al1.add(6);
		System.out.println(al1);
		System.out.println(al);
		
	}

}
