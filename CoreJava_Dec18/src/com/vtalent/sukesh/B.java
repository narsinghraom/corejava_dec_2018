package com.vtalent.sukesh;

public class B {
	int x, y;
	A a;
	B b;

	public A FunctionOne() {
		a = A.Function();
		x = (int) a.Getvalue();
		y = (int) a.Getvalue();
		return a;
	}

	public static B FunctionTwo() {
		B b = new B();
		b.b = new B();
		b.b.a = b.FunctionOne();
		b.b.x = (int) b.b.a.Getvalue();
		b.b.y = (int) b.b.a.Getvalue() + 5;
		return b.b;

	}

	public static void main(String[] args) {
		B b2 = FunctionTwo();
		b2.x = b2.x + 5;
		b2.y = b2.y + 5;
		float f2 = b2.a.Getvalue();
		System.out.println(f2);
		System.out.println(b2.x);
		System.out.println(b2.y);
	}

}
