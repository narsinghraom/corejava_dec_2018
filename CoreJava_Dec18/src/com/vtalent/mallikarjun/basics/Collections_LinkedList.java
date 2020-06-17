package com.vtalent.mallikarjun.basics;

import java.util.Iterator;
import java.util.LinkedList;

public class Collections_LinkedList {

	public static void main(String[] args) {

		LinkedList li = new LinkedList();
		li.add("Hi");
		li.add("Hello");
		System.out.println(li);

		// iterator

		Iterator<String> itr = li.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
