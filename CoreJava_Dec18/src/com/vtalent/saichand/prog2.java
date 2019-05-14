package com.vtalent.saichand;

public class prog2 {
	double d1, d2;

	public long functionOne(double d1, double d2) {
		d1 = d1 + d2;
		this.d2 = this.d1 + d2;
		return (long) 0;
	}

	public static void main(String[] args) {
		prog2 prog = new prog2();
		prog.functionOne(10.0, 15.0);
		System.out.println(prog.d1 + prog.d2);
		System.out.println(prog);
	}

}
