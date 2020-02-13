package com.vtalent.vijaya.basic;

public class Sample2 {
	int a=5;
	static int b;
	int c;
	public static void main(String[] args) {
		b=5;
		Sample2 sample2=new Sample2();
		sample2.c=5;
		sample2.b=10;
		System.out.println(sample2.a+b+sample2.c);
	}

}
