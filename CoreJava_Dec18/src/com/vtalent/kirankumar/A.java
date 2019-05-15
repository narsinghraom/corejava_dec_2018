package com.vtalent.kirankumar;

public class A {

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
