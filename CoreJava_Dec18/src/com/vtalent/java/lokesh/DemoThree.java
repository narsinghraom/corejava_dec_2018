package com.vtalent.java.lokesh;

public class DemoThree {
	int i, j;
	DemoThree d;

	public DemoThree function(DemoThree d1) {
		d = new DemoThree();
		d.d = new DemoThree();
		d.d.d = d1;
		d.d.i = d1.i + d1.j;
		d.d.j = d1.i * d1.j;
		return d.d;
	}

	public static void main(String[] args) {
		DemoThree d1 = new DemoThree();
		d1.i = 7;
		d1.j = 5;
		DemoThree d2 = d1.function(d1);
		System.out.println(d2.i + d2.j);
		System.out.println(d1.i + d1.j);
		System.out.println(d1.d.i + d1.d.j);
		System.out.println(d2.i + d2.d.i);
		System.out.println(d2.j + d2.d.j);
	}

}
