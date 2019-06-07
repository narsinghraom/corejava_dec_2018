package com.vtalent.venkatesh;

class Polymorphism {

     public static void main(String[] args) {

	  Poly1 p1 = new Poly1();

	  float f1 = p1.function(2.5f, 1.5f);
	  p1.function((long) f1);
	  p1.function(f1);
	  System.out.println("p1 values");

	  p1.function();
	  System.out.println(p1.f1);
	  System.out.println(p1.f2);

	  Poly2 p2 = new Poly2();
	  float f2 = p2.function(2.5f, 1.5f);
	  p2.function((long) f2);
	  p2.function(f2);
	  System.out.println("p2 values");

	  p2.function();

	  System.out.println(p2.f2);
	  System.out.println(p2.f1);

	  System.out.println("l1=" + p2.l1);
	  System.out.println("l2=" + p2.l2);

	  Poly3 p3 = new Poly3();
	  float f3 = p3.function(2.5f, 1.5f);
	  p3.function((long) f3);
	  p3.function(f3);
	  System.out.println("p3 values");

	  p3.function();

	  System.out.println(p2.f2);
	  System.out.println(p2.f1);

	  System.out.println("l1=" + p2.l1);
	  System.out.println("l2=" + p2.l2);

	  Poly1 p4 = new Poly3();
	  float f4 = p4.function(2.5f, 1.5f);
	  p3.function((long) f4);
	  p3.function(f4);
	  System.out.println("p4 values");

	  p3.function();

	  System.out.println(p2.f2);
	  System.out.println(p2.f1);

	  System.out.println("l1=" + p2.l1);
	  System.out.println("l2=" + p2.l2);

	  Poly1 p5 = new Poly2();
	  float f5 = p5.function(2.5f, 1.5f);
	  p3.function((long) f5);
	  p3.function(f5);
	  System.out.println("p5 values");

	  p3.function();

	  System.out.println(p2.f2);
	  System.out.println(p2.f1);

	  System.out.println("l1=" + p2.l1);
	  System.out.println("l2=" + p2.l2);

	  Poly2 p6 = new Poly3();
	  float f6 = p6.function(2.5f, 1.5f);
	  p3.function((long) f6);
	  p3.function(f6);
	  System.out.println("p6 values");

	  p3.function();

	  System.out.println(p2.f2);
	  System.out.println(p2.f1);

	  System.out.println("l1=" + p2.l1);
	  System.out.println("l2=" + p2.l2);
     }

}
