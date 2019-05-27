package com.vtalent.rakesh;

public class AbcImpl implements Abc {

	int x, y;

	public void function(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;
		System.out.println(this.y);
	}

	public int function(int x) {
		this.x = this.x + x;
		return x;
	}
}
