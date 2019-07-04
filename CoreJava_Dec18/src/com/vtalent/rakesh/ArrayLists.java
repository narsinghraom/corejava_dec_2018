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
		System.out.println("al:" + al);

		al.add(2, "q");
		System.out.println("al:" + al);
		ArrayLists q = new ArrayLists();
		q.setQwerty("rakesh");
		a.add(q);
		b.add(q);
		System.out.println("printing a" + a);
		System.out.println("printing a.size: " + a.size());

		System.out.println("a.addAll(b)" + a.addAll(b));
		System.out.println("a" + a);
		System.out.println("a.contains(q)" + a.contains(q));
		System.out.println("a.isEmpty()" + a.isEmpty());

		System.out.println("a.size()" + a.size());
		System.out.println("a.indexOf(123)" + a.indexOf(123));
		System.out.println("a.get(0)" + a.get(0));
		System.out.println("a.clone()" + a.clone());
		int x = 10;
		System.out.println(x);
		for (ArrayLists z : a) {
			System.out.println("z.getQwerty()" + z.getQwerty());
		}

	}

}
