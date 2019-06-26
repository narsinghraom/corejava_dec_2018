package com.vtalent.amreen;

import java.util.ArrayList;
import java.util.Iterator;

class TestArrayList {
	public static void main(String[] args) {
		// Creating an ArrayList without any type specified
		ArrayList al = new ArrayList();
		al.add("hello");
		al.add(1);
		al.add("sulthana");
		al.add(0, "amreen");
		al.add("hello");
		// al.clear();

		System.out.println(al.get(1));

		System.out.println(al);
		// following code is used to iterate
		Iterator itr = al.iterator();
		System.out.println("one way to iterate");
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
		System.out.println("other way to iterate");

		for (Object o : al) {
			System.out.println(o);
		}

	}
}
