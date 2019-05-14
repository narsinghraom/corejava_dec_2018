package com.vtalent.rakesh;

class Constructor {

	int x, y;

	Constructor() {
		this(5,5);
	}

	Constructor(int x) {
		this.x = this.x + x;
		y = y + this.x;

	}

	Constructor(int x, int y) {

		this.x = this.x + x;
		this.y = this.y + y;
	}

	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		

		System.out.println(c1.x + c1.y);
		
	}
}


