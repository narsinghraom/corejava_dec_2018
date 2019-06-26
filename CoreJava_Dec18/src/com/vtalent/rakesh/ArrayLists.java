package com.vtalent.rakesh;

import java.util.ArrayList;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		a.add(6);
		a.add(123);
		b.add(4);
		// System.out.println(a);
		// System.out.println(a.size());
		a.addAll(b);

		// System.out.println(a);
		// System.out.println(a.size());
		System.out.println(a.indexOf(123));
		System.out.println(a.get(0));

		/*
		 * Iterator<String> itr = a.iterator(); while (itr.hasNext()) { String s =
		 * (String) itr.next(); System.out.println(s);
		 * 
		 * }
		 */
		/*
		 * for (int s : a) { System.out.println(s);
		 * 
		 * }
		 */

	}

}
