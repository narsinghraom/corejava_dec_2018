package com.vtalent.sukesh;

import java.util.ArrayList;
import java.util.Iterator;

public class ExamplesCollections {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Hi");
		al.add("Hello");
		al.add(1000);
		System.out.println(al);
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		for (Object c : al) {
			System.out.println("For Each method " + c);
		}

		System.out.println("size of ArrayList" + al.size());
		al.remove(0);
		System.out.println("after Removing array....size of ArrayList  "
				+ al.size());
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		ArrayList l = new ArrayList(al);
		System.out.println("Second Array " + l);
		// al.removeAll(al);
		System.out.println(al.removeAll(al));
		System.out.println(al.isEmpty());

	}
}
