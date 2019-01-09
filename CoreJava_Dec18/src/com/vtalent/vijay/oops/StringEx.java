package com.vtalent.vijay.oops;

public class StringEx {

	public static void main(String[] args) {
		

		String s1=new String("Hello");
		System.out.println(s1);
		String s2="Hello";
		System.out.println(s2);
		String s3="Hello";
		System.out.println(s3);
		String s4=new String("Hello");
		System.out.println(s4);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.charAt(0 ));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.concat(s4));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.endsWith("o"));
		System.out.println(s1.hashCode());
		System.out.println(s1.length());
	
	}
}
