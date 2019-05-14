package com.vtalent.naresh;


public class Program2 {
	double d1, d2;

	public long functionOne(double d1, double d2) {

		d1 = d1 + d2;
		this.d2 = this.d1 + d2;
		return (long) ((long) d1 + d2);

	}

	public static void main(String[] args)

	{

		Program2 p = new Program2();
		p.functionOne(10.0, 15.0);
		System.out.println(p.d1 + p.d2);
		System.out.println(p);

	}

	
}
