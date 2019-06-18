package com.vtalent.mahadev;

public class Constructorex {
	int x, y;

	Constructorex() {
		x = 5;
		y = 7;
	}

	Constructorex(int x) {
		this.x = this.x + x;
		y = y + this.x;
	}

	Constructorex(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;
	}

	public static void main(String[] args) {
		Constructorex c1 = new Constructorex();
		Constructorex c2 = new Constructorex(5);
		Constructorex c3 = new Constructorex(5, 5);
		System.out.println(c1.x + c1.y);
		System.out.println(c2.x + c2.y);
		System.out.println(c3.x + c3.y);

	}
}
