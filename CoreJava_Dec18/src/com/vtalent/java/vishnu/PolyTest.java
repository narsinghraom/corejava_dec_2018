package com.vtalent.java.vishnu;

class polyOne {
	double a, b;
	static int x, y;

	public int function(double a) {
		this.a = a + a;
		b = b + a;
		return (int) a;
	}

	public double function(int x, int y, int z) {
		polyOne.x = polyOne.x + x;
		polyOne.y = polyOne.y + y;
		return (x + y);
	}
}

class polyTwo extends polyOne {
	double a;

	public int function(double a) {
		this.a = this.a + a;
		b = b + a;
		return (int) (a + b);
	}

	public int function(double a, double b) {
		this.a = this.a + a;
		this.b = this.b + b;
		return (int) (a + b);
	}

}

public class PolyTest {
	public static void main(String[] args) {
		polyTwo p1 = new polyTwo();
		int k = p1.function(2.0);
		k = p1.function((double) k, (double) k);
		double d1 = p1.function(k, k, k);// 16.0
		System.out.println(d1);// 16.0
		System.out.println(k);// 8
		System.out.println(p1.a);// 6.0
		System.out.println(p1.b);// 6.0

	}
}
