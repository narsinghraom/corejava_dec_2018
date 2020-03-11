package com.vtalent.corejava.saumyaranjandash;

public class Sample1 {
	int x, y;

	static float f1 = 10.0f;

	public void function() {
		int x = 20;
		int y = 30;
		// this.x = x;
		// this.y = y;

	}

	public static void main(String[] args) {
		Sample1 sample1 = new Sample1();
		sample1.function();
		// int c=sample1.x + sample1.y;
		System.out.println(sample1.x + sample1.y);
		System.out.println(f1);

	}

}
