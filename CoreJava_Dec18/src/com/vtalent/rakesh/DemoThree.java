package com.vtalent.rakesh;

public class DemoThree extends DemoTwo {
	String c;

	public void function(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;
	}

	public void function() {
		System.out.println(x);
		System.out.println(y);
	}

}
