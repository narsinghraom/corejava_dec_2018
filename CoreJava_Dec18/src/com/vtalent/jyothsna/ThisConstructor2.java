package com.vtalent.jyothsna;

public class ThisConstructor2 {
	int x, y;

	public ThisConstructor2() {
		this(5);
		x = 5 + 6;
		y = 7 - 6;

	}

	public ThisConstructor2(int x) {
		// this(5,6);
		this.x = x + this.x;
		y = x + y;
	}

	public ThisConstructor2(int x, int y) {
		this();
		this.x = x + this.x;
		this.y = y + this.y;
	}

	public static void main(String[] args) {
		ThisConstructor2 t = new ThisConstructor2(5, 6);
		System.out.println(t.x + "  " + t.y);

	}

}
