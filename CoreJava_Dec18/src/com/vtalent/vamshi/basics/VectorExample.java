package com.vtalent.vamshi.basics;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<String> v1=new Vector<String>();
		v1.add("HI");
		v1.add("HELLO"); 
		v1.add("HELLO"); 
		System.out.println(v1);
		
		Enumeration<String> en=v1.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
