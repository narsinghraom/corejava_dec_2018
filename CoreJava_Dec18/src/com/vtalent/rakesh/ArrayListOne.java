package com.vtalent.rakesh;

import java.util.ArrayList;

public class ArrayListOne {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(123);
		al.add(0);
		al.add(45454);
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(9);
		al.addAll(al1);
		Object o = new Object();
		System.out.println(o.getClass());
		
		System.out.println(al.isEmpty());
		al.remove(new Integer(123));
		for (int i : al) {
			System.out.println(i);
		}

	}
}
