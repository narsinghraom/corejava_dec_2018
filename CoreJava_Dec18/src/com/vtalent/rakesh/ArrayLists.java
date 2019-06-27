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

		ArrayList<String> al = new ArrayList<>();
		al.add("rakesh");
		al.add(1, "q");
		System.out.println(al);

		al.add(2, "q");
		// System.out.println(al);
		ArrayLists q = new ArrayLists();
		q.setQwerty("rakesh");
		a.add(q);
		/*
		 * b.add(q); a.addAll(b);
		 */
		// System.out.println(a);

		System.out.println(a);
		System.out.println(a.size());

		System.out.println(a.addAll(b));
		System.out.println(a);
		System.out.println(a.contains(q));
		System.out.println(a.isEmpty());
		// System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.indexOf(123));
		System.out.println(a.get(0));
		System.out.println(a.clone());

		for (ArrayLists z : a) {
			System.out.println(z.getQwerty());
		}

	}

}
