package com.vtalent.tarun.basics;

public class Swapping {

	public static void main(String[] args) {
	
		int a = 99;
		int b= 88;
		System.out.println("--Before Swappig--");
		System.out.println("a=" +a);
		System.out.println("b=" +b);	
	int temp=a;
	a=b;
	b= temp;
	System.out.println("--After Swapping--");
	System.out.println("a="+a);
	System.out.println("b=" +b);
}
}