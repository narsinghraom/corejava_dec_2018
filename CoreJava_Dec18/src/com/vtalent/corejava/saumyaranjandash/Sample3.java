package com.vtalent.corejava.saumyaranjandash;

public class Sample3 {
	int a=10;
	static int b=5;
	public static void main(String[] args) {
		Sample3 sample = new Sample3();
		System.out.println(sample.a);
		System.out.println(sample.b);
		
		sample.a=50;
		sample.b=30;
		System.out.println(sample.a);
		System.out.println(sample.b);
		Sample3 sample1 = new Sample3();
		System.out.println(sample1.a);
		System.out.println(sample1.b);
	}

}
