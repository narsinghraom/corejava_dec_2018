package com.vtalent.java.venkatesh;

public class DemoTwo3 {
	int i, j;
	DemoTwo3 d;

	public DemoTwo3 function(DemoTwo3 d1) {
		d = new DemoTwo3();
		d.d = new DemoTwo3();
		d.d.d = d1;
		d.d.i = d1.i + d1.j;
		d.d.j = d1.i * d1.j;z
		return d.d;
	}

	public static void main(String[] args) {
		DemoTwo3 d1 = new DemoTwo3();
		d1.i = 7;
		d1.j = 5;
		DemoTwo3 d2 = d1.function(d1);
		System.out.println(d2.i + d2.j);
		System.out.println(d1.i + d1.j);
		System.out.println(d1.d.i + d1.d.j);
		System.out.println(d2.i + d2.d.i);
		System.out.println(d2.j + d2.d.j);
	}

}


