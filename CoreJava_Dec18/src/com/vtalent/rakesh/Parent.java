package com.vtalent.rakesh;

public class Parent {
	public void function() {
		System.out.println("method in Parent Class");
	}

	public static void main(String args[]) {
		Parent p = new Parent();
		p.function();
		ChildOne c1 = new ChildOne();
		c1.function();
		Parent p1 = new ChildTwo();
		p1.function();
	}
}
