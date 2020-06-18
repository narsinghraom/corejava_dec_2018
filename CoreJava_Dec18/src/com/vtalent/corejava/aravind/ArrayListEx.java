package com.vtalent.corejava.aravind;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
//		al.add("hello");
//		al.add("world");
//		System.out.println(al);
//		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Bikes");
		al1.add("cars");
		al1.add("flights");
		al1.add(3, "Null");
		System.out.println(al1);
		al1.trimToSize();
		System.out.println("After trimming:" +al1.size());
		

		List<String> arrlist2 = al1.subList(2, 3);
		System.out.println(arrlist2);
		System.out.println();
		System.out.println("the size of array: " + al1.size());
		Iterator<String> itr = al1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		boolean ans = al1.contains("Bikes");
		if (ans)
			System.out.println("The list Contain value: " + ans);
	}

}
