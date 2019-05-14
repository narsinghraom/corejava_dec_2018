package com.vtalent.saichand;

public class ConstructEx {
	int x, y;

	ConstructEx() {
		this(5, 5);
	}

	ConstructEx(int x) {
		this.x = this.x + x;
		y = y + this.x;
	}

	ConstructEx(int x, int y) {
		this(x + y);
		this.x = this.x + x;
		this.y = this.y + y;
	}

	public static void main(String[] args) {
		ConstructEx c1 = new ConstructEx();
		ConstructEx c2 = new ConstructEx(5);
		ConstructEx c3 = new ConstructEx(5, 5);
		System.out.println(c1.x + c1.y);
		System.out.println(c2.x + c2.y);
		System.out.println(c3.x + c3.y);
	}
}
