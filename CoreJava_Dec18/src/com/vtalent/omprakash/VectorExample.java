package com.vtalent.omprakash;
import java.util.*;
public class VectorExample {
	public static void main(String[] args) {
		Vector<String> v1=new Vector<String>();
		v1.add("Hi");
		v1.add("Hello");
		System.out.println(v1);
		Enumeration<String> en=v1.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		}

}
