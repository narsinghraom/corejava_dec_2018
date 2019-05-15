package com.vtalent.sukesh;

public class A {
	private float f1;

	private A() {
		f1 = 2.5f;
	}

	public static A Function() {
		A a1 = new A();
		return a1;
	}

	public float Getvalue() {
		return f1;
	}

}
