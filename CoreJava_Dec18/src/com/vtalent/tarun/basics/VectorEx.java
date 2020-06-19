package com.vtalent.tarun.basics;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		v1.add("Hi");
		v1.add("Hello");
		v1.add("World");
		System.out.println(v1);
		Enumeration<String> en = v1.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
