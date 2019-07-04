package com.vtalent.amreen;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet1 {

	public static void main(String args[]) {

		/*
		 * System.out.println("removing all values");
		 * 
		 * set.clear(); System.out.println(set);
		 */

		ArrayList<String> array = new ArrayList<>();
		array.add("cow");
		array.add("dog");

		HashSet<String> set = new HashSet(array);
		set.add("amreen");
		set.add("hyd");
		set.add("fly");
		set.add("fly");
		System.out.println("duplicates are ignored" + set);
		HashSet<String> set1 = new HashSet<>();
		set1.add("chennai");
		set1.add("kolkata");
		set1.add("banglore");
		System.out.println("using add all method");
		set.addAll(set1);
		System.out.println(set);
		System.out.println("removing the newly added elements");
		set.removeAll(set1);
		System.out.println(set);
		System.out.println("adding arraylist to set");
		System.out.println(set);
	}
}
