package com.vtalent.corejava.saumyaranjandash;

public class Sample {
	int x, y;
	static float f1;

	public void function() {
		x = 5;

		y = 10;
		f1 = 10.2f;

	}

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.function();
		System.out.println(sample.x + sample.y);
		System.out.println(f1);
		System.out.println(sample);
 	}
}
