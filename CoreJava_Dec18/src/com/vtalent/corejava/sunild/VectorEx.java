package com.vtalent.corejava.sunild;


import java.util.ArrayList;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
//		Vector v = new Vector();
//		v.add(1);
//		v.add(2);
//		v.add("Hello");
//		v.add("world");
//		System.out.println(v);
		
		ArrayList al = new ArrayList();
		al.add("hello");
		al.add("world");
		
		Vector v = new Vector();
		//copying all elements into vector from arraylist
		v.addAll(al);
		
		System.out.println("Index place: "+v.indexOf("hello"));
		
		System.out.println(v);
		System.out.println("First element: "+v.firstElement());
		System.out.println();
		
		
		System.out.println("Intial capacity:" +v.capacity());
		
		v.trimToSize();
		
		System.out.println("After Trimming :" +v.capacity());
		
		if(v.contains("hello")) {
			System.out.println("The obj is: "+v);
			System.out.println("Hash code: "+v.hashCode());
			
			System.out.println("Get the value: "+v.get(1));
			System.out.println("Size of vector: "+v.size());
		}
		
		v.clear();
		System.out.println("After clearing vector :" +v);
		if(v.isEmpty()) {
			System.out.println("vector is empty...!");
		}
	}

}
