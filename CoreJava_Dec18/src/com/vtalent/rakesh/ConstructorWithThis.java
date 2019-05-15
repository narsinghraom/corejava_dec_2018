package com.vtalent.rakesh;

public class ConstructorWithThis {
	int x, y;

	ConstructorWithThis() {
		this(5, 5);
	}

	ConstructorWithThis(int x) {
		this.x = this.x + x;
		y = y + this.x;
	}

	ConstructorWithThis(int x, int y) {
		this(x + y);
		this.x = this.x + x;
		this.y = this.y + y;
	}

	public static void main(String[] args) {
		ConstructorWithThis c1 = new ConstructorWithThis();
		/*
		 * ConstructorEx c2 = new ConstructorEx(5); ConstructorEx c3 = new
		 * ConstructorEx(5, 5); / System.out.println(c1.x + c1.y);
		 */
		System.out.println(c1.x + c1.y);
	}
}
