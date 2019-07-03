package com.vtalent.amreen;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String args[]) {
		TreeSet<Integer> ref = new TreeSet<Integer>();
		ref.add(1);
		ref.add(3);
		ref.add(2);
		System.out.println(ref);
		System.out.println("retreiving the lowest value" + ref.pollFirst());
		System.out.println("retreving the highest value" + ref.pollLast());

	}

}
