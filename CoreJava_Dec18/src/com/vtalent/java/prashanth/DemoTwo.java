package com.vtalent.java.prashanth;

public class DemoTwo {
	int i, j;
	DemoTwo d;

	public DemoTwo function(DemoTwo d1) {
		d = new DemoTwo();
		d.d = new DemoTwo();
		d.d.d = d1;
		//here we are storing values in d.d.i of d1.i and d1.j
		d.d.i = d1.i + d1.j;
		d.d.j = d1.i * d1.j;
		return d.d;
	}

	public static void main(String[] args) {
		//d1 isa local ref for main method
		DemoTwo d1 = new DemoTwo();
		d1.i = 7;
		d1.j = 5;
		//d1 is a local ref for function meth
		DemoTwo d2 = d1.function(d1);
		System.out.println(d2.i + d2.j);
		System.out.println(d1.i + d1.j);
		System.out.println(d1.d.i + d1.d.j);
		System.out.println(d2.i + d2.d.i);
		System.out.println(d2.j + d2.d.j);
	}

}
