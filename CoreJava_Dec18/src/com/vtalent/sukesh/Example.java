package com.vtalent.sukesh;
public class Example {
	double d1, d2;

	public long FunctionOne(double d1, double d2) {
		d1 = d1 + d2;
		this.d2 = this.d1 + d2;
		return (long) ((long) d1 + d2);

	}

	public static void main(String[] args) {
		Example ex = new Example();
		ex.FunctionOne(10.0, 15.0);
		System.out.println(ex.d1 + ex.d2);
		System.out.println(ex);

	}

}
