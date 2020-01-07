package com.vtalent.bharathi.basics;

public class Strings {
	
 // string is a pre defined class
	// it is immautable
	
	
	
	// string declaration
	
	
	public static void main(String[] args) {
		
		String s1 = new String("Hello java"); 
		String s3 = new String("Hello");
		String s2 = "Welcome to Programming world";
		String s4 = "hello";
		String s5 = new String("hello");
		//s5 = "hai";
		
		
		System.out.println(s1.length());   // length of the string
		System.out.println(s2.length());
		
		//It returns the character of particular index
		System.out.println(s1.charAt(0));
		
		// It returns the asci value of that  index
		
		System.out.println(s1.codePointAt(0));   //
		System.out.println(s5==s1);
		
		// It returns the asci value of that before index
		
		System.out.println(s1.codePointBefore(1));
		
		// It returns count the characters of the string include start and end index
		System.out.println(s2.codePointCount(0,9 ));
		
		System.out.println(s3.compareTo(s2));   // pending
		
		
	// ignoring case diffrence
		
		System.out.println(s1.compareToIgnoreCase(s2));
	
	// concate
		System.out.println(s1+" "+s2);
	// contains
	//it returns true if the same data is present in
	// it will check the entire string if it is there returns true
		System.out.println(s3.contains("hello"));
		System.out.println(s4.contains("Hello"));
		System.out.println(s2.contains("world"));
		
		// it checks for the data content if it is same returns true else false also consider the case  sensitive and doesnt care about address location
		System.out.println(s4.contentEquals(s3));
		
		// 
		
		System.out.println(String.copyValueOf(s2.toCharArray()));
		
		
		
		
		
	}
	

}
