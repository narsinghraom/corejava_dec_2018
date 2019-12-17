package com.vtalent.vamshi.basics;

public class Sample {
	int a=5;
	static int b;
	int c;
	
public static void main(String[] args) {
	b=5;
	Sample s1= new Sample();
	s1.c=5;
	s1.b=10;
System.out.println(s1.a+s1.b+s1.c+b);	
}
}
