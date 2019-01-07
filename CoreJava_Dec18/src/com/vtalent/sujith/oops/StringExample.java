package com.vtalent.sujith.oops;

public class StringExample {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Hello");
		String s2="Hello";
		String s3="Hello";
		String s4=new String ("Hello");
		
		s1="Hi";
		s4=s1;
		
		char ch=s2.charAt(2);
		System.out.println(ch);
		
		if(s1.equals(s2)) {
			System.out.println("s1 equals s2");
		}
		else {
			System.out.println("s1 not equals s2");

		}
		if(s2==s3) {
			System.out.println("s2 equals s3");
		}

	}

}
