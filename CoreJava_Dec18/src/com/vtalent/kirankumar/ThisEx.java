package com.vtalent.kirankumar;

public class ThisEx {

	double d1, d2;

	public long functionone(double d1, double d2) {

		d1 = d1 + d2;
		this.d2 = this.d1 + d2;
		return (long) ((long) d1 + d2);

	}

	public static void main(String[] args)

	{

		ThisEx exp = new ThisEx();
		exp.functionone(10.0, 15.0);
		System.out.println(exp.d1 + exp.d2);
		System.out.println(exp);

	}

}
