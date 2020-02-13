package com.vtalent.bharathi.basics;

public class SampleString {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 = "abc";
		String s4 = "abc";
		s1 = "def";
		s2 = "fff" ;
		System.out.println(s1.equals(s2));  // returnd false
		//
		System.out.println(s1==s2);  
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s4==s2);
	
	
	
	}

}
