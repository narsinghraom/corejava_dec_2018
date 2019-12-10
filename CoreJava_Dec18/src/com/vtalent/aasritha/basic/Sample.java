package com.vtalent.aasritha.basic;

public class Sample {
	int a,b;
	static int c;
	public static void main(String[] args) {
		c=10;
		Sample s1=new Sample();
		s1.function(c);
		System.out.print(s1.a+s1.b+c);
		}
	public void function(int c) {
		a=c;
		b=c+5;
	}

}
