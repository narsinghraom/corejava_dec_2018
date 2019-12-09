package com.vtalent.mallikarjun.basics;

public class Swaping {
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("before swaping");
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping");
		System.out.println("a value is "+a);
		System.out.println("b values is "+b);
		
	}

}
