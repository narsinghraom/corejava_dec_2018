package com.vtalent.amreen;

import java.util.ArrayList;

class TestArrayList {
	public static void main(String[] args) {
		// Creating an ArrayList without any type specified
		ArrayList al = new ArrayList();
		al.add(0);
		al.add(2);
		al.add(5.0F);
		al.add(11);
		al.add("amreen");
		al.add("amreen");
		al.add(2);
		String del = "amreen";
		System.out.println("last index method" + al.lastIndexOf("amreen"));
		boolean ans = al.contains(11);
		if (ans) {
			System.out.println("contains method -it contains the given word");
		}

		System.out.println(al);

		al.remove(new Float(5.0F));
		// al.remove(del);
		System.out.println("remove(object o) method" + al);

	}
}
