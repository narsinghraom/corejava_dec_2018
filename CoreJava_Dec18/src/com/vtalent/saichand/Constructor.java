package com.vtalent.saichand;

public class Constructor {
	int x, y;

	Constructor() {
		x = 5;
		y = 6;
	}

	Constructor(int x) {
		this.x = this.x + x;
		y = y + x;
	}

	Constructor(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;
	}

	public void function() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor(5);
		Constructor c3 = new Constructor(4, 5);
		System.out.println(c1.x);
		System.out.println(c2.x);
		System.out.println(c3.y);

	}

}

