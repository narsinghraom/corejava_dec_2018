package com.vtalent.saichand;

public class demo2 {
	int i, j;
	demo2 d;

	public demo2 function(demo2 d1) {
		d = new demo2();
		d.d = new demo2();
		d.d.d = d1;
		d.d.i = d1.i + d1.j;
		d.d.j = d1.i * d1.j;
		return d.d;
	}

	public static void main(String args[]) {
		demo2 d1 = new demo2();
		d1.i = 7;
		d1.j = 5;
		demo2 d2 = d1.function(d1);
		System.out.println(d2.i + d2.j);
		System.out.println(d1.i + d1.j);
		System.out.println(d1.d.i + d1.d.j);
		System.out.println(d2.i + d2.d.i);
		System.out.println(d2.j + d2.d.j);
	}

}
