package com.vtalent.rakesh;

import java.util.ArrayList;

public class ArrayListOne {
	int x = 0;

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("rakesh");
		al.add(123);
		al.add(0);
		al.add(45454);
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(9);
		al.addAll(al1);

		al.add(4, 6);
		System.out.println("al:" + al);
		al.addAll(3, al1);
		System.out.println("al.clone():" + al.clone());
		System.out.println("al.contains(123):" + al.contains(123));
		System.out.println("al.containsAll(al1):" + al.containsAll(al1));

		System.out.println("al:" + al);
		System.out.println("al.get(1):" + al.get(0));
		System.out.println("al:" + al);
		System.out.println("al.isEmpty():" + al.isEmpty());
		System.out.println("al.remove(new Integer(123)):" + al.remove(new Integer(123)));
		for (int i : al) {
			System.out.println("i:" + i);
		}

	}
}