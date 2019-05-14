package com.vtalent.praveena;

public class ConstructorEx2 {
	int i, j;
	ConstructorEx2 d;

	public ConstructorEx2 function(ConstructorEx2 d1) {
		d = new ConstructorEx2();
		d.d = new ConstructorEx2();
		d.d.d = d1;
		d.d.i = d1.i + d1.j;
		d.d.j = d1.i * d1.j;
		return d.d;

	}

	public static void main(String[] args) {
		ConstructorEx2 d1 = new ConstructorEx2();
		d1.i = 7;
		d1.j = 5;
		ConstructorEx2 d2 = d1.function(d1);
		System.out.println(d2.i + d2.j);
		System.out.println(d1.i + d1.j);
		System.out.println(d1.d.i + d1.d.j);
	}
}
