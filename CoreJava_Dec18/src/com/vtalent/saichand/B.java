package com.vtalent.saichand;

class A {
	private float f1;

	private A() {
		f1 = 2.5f;

	}

	public static A function() {
		A a1 = new A();
		return a1;
	}

	public float getvalue() {
		return f1;
	}
}

class B {
	int x, y;
	A a;
	B b;

	public A functionOne() {
		a = A.function();
		x = (int) a.getvalue();
		y = x + (int) a.getvalue();
		return a;
	}

	public static B functionTwo() {
		B b = new B();
		b.b = new B();
		b.b.a = b.functionOne();
		b.b.x = (int) b.b.a.getvalue();
		b.b.y = (int) b.b.a.getvalue() + 5;
		return b.b;
	}

	public static void main(String[] args) {
		B b2 = functionTwo();
		b2.x = b2.x + 5;
		b2.y = b2.y + 5;
		float f2 = b2.a.getvalue();
		System.out.println(f2);
		System.out.println(b2.x);
		System.out.println(b2.y);
	}
}
