package com.vtalent.tarun.basics;

public class Sample1 {

	int a, b;
	static int c;

	private void function(int c) {
		a = c;
		b = c + 10;
		c = a + b;
	}

	public static void main(String[] args) {

		c = 10;
		Sample1 s1 = new Sample1();
		s1.function(c);
		System.out.println(s1.a + s1.b + c);
	}

}
