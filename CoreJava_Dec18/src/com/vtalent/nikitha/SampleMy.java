package com.vtalent.nikitha;

public class SampleMy {
	int a, b;

	public void method(int a, float b) {
		this.a = this.b + this.a;
		this.b = this.a + a;
		b = this.a + b;
		a = (int) (this.b + b);

		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(a);
		System.out.println(b);
	}

	public static int function(int i, int j) {
		i = j + 1;
		System.out.println("i value" + i);
		System.out.println("j value" + j);
		return i + j;
	}

	public static void main(String[] args) {
		SampleMy samplemy = new SampleMy();
		System.out.println("Start the program execution");
		samplemy.method(3, 3.3f);

		int f = function(2, 4);
		System.out.println("end of the program");
	}
}
