package com.vtalent.jhansi.basics;

public class StrSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5. Swap a program without using Temp, Third Variable, StirngBuffer,
		 * StringBuilder? s="Hello"; s1="World";
		 */
		String s = "Hello";
		String s1 = "World";
		int l=s.length();
		int l1=s1.length();
		s = s + s1;
		s = s.substring(0,l1);
		s1 = s.substring(l);
		System.out.println(s);
		System.out.println(s1);
	}

}
