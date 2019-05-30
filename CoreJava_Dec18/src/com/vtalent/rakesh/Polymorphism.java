package com.vtalent.rakesh;

public class Polymorphism {
	public static void main(String args[]) {
		DemoOne d1 = new DemoThree();
		d1.function(2);
		d1.function(5, 2);
		// d1.function();
		DemoTwo d2 = new DemoThree();
		d2.function(3);
		d2.function(3, 2);
		// d2.function();
		DemoThree d3 = new DemoThree();
		d3.function(3);
		d3.function(4, 3);
		d3.function();
		// System.out.println(d1.x + d1.y);
		// System.out.println(d2.x + d2.y);
		// System.out.println(d3.x + d3.y);
		DemoFour d4 = new DemoFour();
		d4.function(5, 1, "1");
		double w = d4.function(5, 1, "1");
		System.out.println(w);
		double q = d4.function(3, 1, "1");
		System.out.println(q);
		d4.function(1, 2, "p");
	}
}
