package com.vtalent.jyothsna;

/**
 * @author jyothsna
 *
 */
public class Sample1 {
	int a, b,d;
	static int c;

	public static void main(String[] args) {
		c = 10;
		Sample1 s1 = new Sample1();
		s1.function(c);
		System.out.println(s1.a + s1.b + c);
	}

	/**
	 * @param c
	 */
	public void function(int c) {
		a = c;
		b = c + 5;
		c = a + b;
		
		System.out.println(c);
	}
}
