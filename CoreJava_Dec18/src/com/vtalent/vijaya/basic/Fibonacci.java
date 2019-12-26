package com.vtalent.vijaya.basic;

public class Fibonacci {
public static void main(String[] args) {
	int a=0, b=1;
	System.out.println(" "+a+"\n "+b);
	for(int i=1;i<=10;i++) {
		int c=a+b;
	System.out.println(" "+c);
	a=b;
	b=c;
		
}
}
}