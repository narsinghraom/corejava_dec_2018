package com.vtalent.java.mahesh;

public class Demo2 {
	int i, j;
	Demo2 d;

	public Demo2 function(Demo2 d1) {
		d = new Demo2();
		d.d = new Demo2();
		d.d.d = d1;
		d.d.i = d1.i + d1.j;
		d.d.j = d1.i * d1.j;
		return d.d;
	}

	public static void main(String[] args) {
		Demo2 d1 = new Demo2();
		d1.i = 7;
		d1.j = 5;
		Demo2 d2 = d1.function(d1);
		System.out.println(d2.i + d2.j);
		System.out.println(d1.i + d1.j);
		System.out.println(d1.d.i + d1.d.j);
		System.out.println(d2.i + d2.d.i);
		System.out.println(d2.j + d2.d.j);
	}
}
 