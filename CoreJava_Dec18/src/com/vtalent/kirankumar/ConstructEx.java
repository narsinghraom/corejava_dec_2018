package com.vtalent.kirankumar;

public class ConstructEx {

	int x, y;

	ConstructEx() {

		this(5, 5);

	}

	ConstructEx(int x) {
		this.x = this.x + x; // 10
		y = y + this.x; // 10

	}

	ConstructEx(int x, int y)

	{
		this(x + y);
		this.x = this.x + x; // 15
		this.y = this.x + y; // 20

	}

	public static void main(String[] args) {

		ConstructEx c1 = new ConstructEx();

		System.out.println(c1.x + c1.y);

	}
}