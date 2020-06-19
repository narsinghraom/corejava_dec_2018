package com.vtalent.tarun.basics;

public class StrToInt {

	public static void main(String[] args) {
		/*
		 * Integer to String
		 */
		int x = 69;
		String y = Integer.toString(x);
		System.out.println(y);
		System.out.println(x);
		System.out.println("=============================================");
		/*
		 * String to Integer
		 */	
		String z = "69";
		int ab = Integer.parseInt(z);
		System.out.println(z);
		System.out.println(ab);
		System.out.println("=============================================");
		/*
		 * Swapping Strings without using 3rd Variable;
		 */
		String a="Tarun";
		String b="Kumar";
		a=a+b; //TarunKumar
		b=a.substring(0, a.length()-b.length()); //TarunKumar-Kumar = Tarun = b
		a=a.substring(b.length()); //TarunKumar-Tarun(b) = Kumar
		System.out.println(a);
		System.out.println(b);		
	}
}
