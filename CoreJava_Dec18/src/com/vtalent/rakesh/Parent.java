package com.vtalent.rakesh;

public class Parent {
	public void function() {
		System.out.println("method in Parent Class");
	}

	public static void main(String args[]) {
		Parent p = new Parent();
		p.function();
		ChildOne c1 = new ChildTwo();
		c1.function();
		Parent p1 = new ChildOne();
		p1.function();
	}
}
