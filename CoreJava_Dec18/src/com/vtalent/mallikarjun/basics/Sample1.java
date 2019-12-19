package com.vtalent.mallikarjun.basics;

public class Sample1 {
	int a,b;
	int d;
	static int c;
	public static void main(String[] args) {
		c=10;
		Sample1 sample=new Sample1();
		sample.function(c);
		System.out.println(sample.a+c+sample.b);
	}
	void function(int c) {
         a=20;
         b=c+5;
}
}
