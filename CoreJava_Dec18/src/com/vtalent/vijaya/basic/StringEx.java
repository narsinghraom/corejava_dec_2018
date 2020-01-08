package com.vtalent.vijaya.basic;

public class StringEx{
	public static void main(String[] args) {
		String s1=new String("abc");
		String s2=new String("hello");
		String s3="abc";
		String s4="welcome";
		s2=new String("def");
		s1="def";
		if(s1.equals(s2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println(s1.contentEquals(s3));
		System.out.println(s3==s4);
		System.out.println(s1==s2);
		System.out.println(s4.charAt(3));
		System.out.println(s3.codePointAt(1));
		System.out.println(s3.codePointBefore(1));
		System.out.println(s4.codePointCount(1, 2));	
		}

}
