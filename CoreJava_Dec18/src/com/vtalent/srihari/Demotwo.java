package com.vtalent.srihari;

class Demotwo {

	int i, j;

	Demotwo d;

	public Demotwo function(Demotwo d1) {

		d = new Demotwo();

		d.d = new Demotwo();

		d.d.d = d1;

		d.d.i = d1.i + d1.j;

		d.d.j = d1.i * d1.j;

		return d.d;
	}

	public static void main(String[] args) {

		Demotwo d1 = new Demotwo();

		d1.i = 7;

		d1.j = 5;

		Demotwo d2 = d1.function(d1);

		System.out.println(d2.i + d2.j);

		System.out.println(d1.i + d1.j);

		System.out.println(d1.d.i + d1.d.j);
		
		System.out.println(d2.i + d2.d.i);
		
		System.out.println(d2.j + d2.d.j);
	}

}
