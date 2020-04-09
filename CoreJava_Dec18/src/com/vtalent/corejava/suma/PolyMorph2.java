package com.vtalent.corejava.suma;

class Sample2 {
	int x;

	public void function(int x) {
		this.x = this.x + x;
	}

	public void function() {
		System.out.println(x);
	}

}

class Sample3 extends Sample2 {
	int x, y;

	public void function(int x) {
		this.x = this.x + x + 2;
		y = x;
	}

	public void function(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;

	}
}

public class PolyMorph2 {
	public static void main(String[] args) {
		Sample2 s2 = new Sample3();
		s2.function(2);
		s2.function();
		System.out.println(s2.x);
	}

}