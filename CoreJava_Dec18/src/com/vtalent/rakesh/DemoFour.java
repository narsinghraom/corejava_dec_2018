package com.vtalent.rakesh;

public class DemoFour extends DemoThree {
	String n, k;

	public static void main(String arg[]) {

		DemoFour d4 = new DemoFour();

		double g = d4.function(1, 2, "r");
		System.out.println(g);

	}

	public double function(int a, int b, String c) {
		int d = (a * b);
		System.out.println(c);
		this.n = "rakesh";
		this.k = "narsing";
		double q = d;
		System.out.println(this.n);
		System.out.println(k);
		return q;

	}

}
