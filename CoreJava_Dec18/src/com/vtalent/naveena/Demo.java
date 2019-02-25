package com.vtalent.naveena;

public class Demo {
	long l1, l2;
	static float f1, f2;

	public int function(long l1, long l2) {
		// this.l1 = l1 + l2;
		l1 = l1 + l2;
		this.l2 = l1 * l2;

		return (int) ((int) this.l1 + this.l2);
	}

	public static void function(float f1, float f2) {
		Demo.f1 = f1 + f2;
		Demo.f2 = f1 - f2;
	}

	public static void main(String[] args) {
		Demo sample = new Demo();
		int k = sample.function(1,2);
		function((float) k, (float) k + 1);
		System.out.println(k);
		System.out.println(sample.l1);
		System.out.println(sample.l2);
		System.out.print(sample);

	}

}
