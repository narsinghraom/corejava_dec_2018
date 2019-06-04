package com.vtalent.rakesh;

public class ClassOne {
	public float function(float f, int h) {

		return f;
	}

	public static void main(String args[]) {
		ClassTwoo c2 = new ClassTwoo();

		int q = c2.function(1.0, 2, 7);
		System.out.println(q);

	}
}
