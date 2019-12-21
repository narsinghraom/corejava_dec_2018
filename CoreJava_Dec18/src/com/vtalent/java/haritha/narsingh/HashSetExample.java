package com.vtalent.java.haritha.narsingh;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		HashCodeEx h1 = new HashCodeEx();
		h1.str ="ABC";
		h1.i=10;
		HashCodeEx h2 = new HashCodeEx();
		h2.str ="ABC";
		h2.i=10;
		Set<HashCodeEx> setRef = new HashSet<HashCodeEx>();
		setRef.add(h1);
		setRef.add(h2);
		for(HashCodeEx ex:setRef) {
			System.out.println(ex.str + " "+ex.i);
		}
	}

}









