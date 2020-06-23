package com.vtalent.srinu;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		v1.add("Hi");
		v1.add("hello");
		System.out.println(v1);
		Enumeration<String> en = v1.elements();
		while(en.hasMoreElements()) { //it will check whether the elements are present in collection or not
			System.out.println(en.nextElement());
		}
	}

}
