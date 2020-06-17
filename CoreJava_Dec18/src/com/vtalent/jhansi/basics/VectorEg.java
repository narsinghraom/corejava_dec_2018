package com.vtalent.jhansi.basics;

import java.util.*;

public class VectorEg {

	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<String>();
		v1.add("Hi");
		v1.add("Hello");
		System.out.println(v1);
		
		//Enumeration
		Enumeration<String> e1= v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
	}
}
