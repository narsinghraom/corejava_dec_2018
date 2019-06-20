package com.vtalent.sukesh;

public class DemoTwo {
	int i;
	int j;
	DemoTwo d;

	public DemoTwo Function1(DemoTwo d1) {
		d = new DemoTwo();
		d.d = new DemoTwo();
		d.d.d = d1;
		d.d.i = d1.i + d1.j;
		d.d.j = d1.i * d1.j;
		return d.d;
	}

	public static void main(String[] args) {
		DemoTwo d1 = new DemoTwo();
		d1.i = 7;
		d1.j = 5;
		DemoTwo d2 = d1.Function1(d1);
		System.out.println(d2.i + d2.j);
		System.out.println(d1.i + d1.j);
		System.out.println(d1.d.i + d1.d.j);
		System.out.println(d2.i + d2.i);
		System.out.println(d2.j + d2.j);
	}

}
