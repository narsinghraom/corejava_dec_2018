package com.vtalent.jhansi.basics;

public class StringEx {
	public static void main(String[] args) {
		String s1=new String("abc");
		String s2=new String("ABC");
		String s3="abc";
		char[] s5= {'a','b'};
		System.out.println(s3);
		String s4="abc";
		System.out.println(Integer.toHexString(s1.hashCode()));
		System.out.println(Integer.toHexString(s2.hashCode()));
		System.out.println(Integer.toHexString(s3.hashCode()));
		System.out.println(Integer.toHexString(s4.hashCode()));
		System.out.println("s1.equals(s2)");
		if(s1.equals(s2))
			System.out.println("true");
		else
			System.out.println("false");
		System.out.println(s3==s4);
		System.out.println(s1==s2);
		s2=new String("def");
		System.out.println("s2"+ s2);
		System.out.println(s1.charAt(1));
		System.out.println((char)s1.codePointAt(1));
		System.out.println((char)s1.codePointBefore(1));
		System.out.println(s1.codePointCount(1,2));
		System.out.println(s1.offsetByCodePoints(1,2));
		System.out.println(s1.hashCode());
	    System.out.println(s1.equalsIgnoreCase(s2));
	}}
	


