package com.vtalent.rakesh;

public class Polymorphim {

	public static void main(String[] args) {

		Poly1 p1 = new Poly1();
		Poly2 p2 = new Poly2();
		Poly3 p3 = new Poly3();
		Poly1 p4 = new Poly3();
		Poly1 p5 = new Poly2();
		Poly2 p6 = new Poly3();
		// Poly2 p7=new Poly1();
		// Poly3 p8 = new Poly2();

		float f1 = p1.function(2.5f, 1.5f);

		p1.function((long) f1);
		p1.function(f1);
		p1.function();

		// float f1=p2.function(2.5f, 1.5f);
		p2.function((long) f1);
		p2.function(f1);
		p2.function();

		// float f1=p3.function(2.5f, 1.5f);
		p3.function((long) f1);
		p3.function(f1);
		p3.function();

		// float f1=p4.function(2.5f, 1.5f);
		p4.function((long) f1);
		p4.function(f1);
		p4.function();

		// float f1=p5.function(2.5f, 1.5f);
		p5.function((long) f1);
		p5.function(f1);
		p5.function();

		// float f1=p6.function(2.5f, 1.5f);
		p6.function((long) f1);
		p6.function(f1);
		p6.function();

		// float f1=p7.function(2.5f, 1.5f);
		// p7.function((long)f1);
		// p7.function(f1);
		// p7.function();

		// float f1=p8.function(2.5f, 1.5f);
		// p8.function((long)f1);
		// p8.function(f1);
		// p8.function();

		System.out.println(p1.f1);
		System.out.println(p1.f2);
		// System.out.println(p1.l1);
		// System.out.println(p1.l2);
		System.out.println(p2.f1);
		System.out.println(p2.f2);
		System.out.println(p2.l1);
		System.out.println(p2.l2);
		System.out.println(p3.f1);
		System.out.println(p3.f2);
		System.out.println(p3.l1);
		System.out.println(p3.l2);
		System.out.println(p4.f1);
		System.out.println(p4.f2);
		// System.out.println(p4.l1);
		// System.out.println(p4.l2);
		System.out.println(p5.f1);
		System.out.println(p5.f2);
		// System.out.println(p5.l1);
		// System.out.println(p5.l2);
		System.out.println(p6.f1);
		System.out.println(p6.f2);
		System.out.println(p6.l1);
		System.out.println(p6.l2);
		// System.out.println(p7.f1);
		// System.out.println(p7.f2);
		// System.out.println(p7.l1);
		// System.out.println(p7.l2);
		// System.out.println(p8.f1);
		// System.out.println(p8.f2);
		// System.out.println(p8.l1);
		// System.out.println(p8.l2);

	}

}
