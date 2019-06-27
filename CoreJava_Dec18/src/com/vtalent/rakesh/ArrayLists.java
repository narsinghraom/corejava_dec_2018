package com.vtalent.rakesh;

import java.util.ArrayList;

public class ArrayLists {
	static ArrayList<ArrayLists> a = new ArrayList<>();
	static ArrayList<ArrayLists> b = new ArrayList<>();
	String qwerty;

	public String getQwerty() {
		return qwerty;
	}

	public void setQwerty(String qwerty) {
		this.qwerty = qwerty;
	}

	public static void main(String[] args) {

		ArrayLists q = new ArrayLists();
		q.setQwerty("rakesh");
		a.add(q);
		b.add(q);
		a.addAll(b);
		System.out.println(a);
		for ( q : a) {
			System.out.println();
		}
		// System.out.println(a);
		// System.out.println(a.size());
		/*
		 * a.addAll(b);
		 * 
		 * // System.out.println(a); // System.out.println(a.size());
		 * System.out.println(a.indexOf(123)); System.out.println(a.get(0));
		 */
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
