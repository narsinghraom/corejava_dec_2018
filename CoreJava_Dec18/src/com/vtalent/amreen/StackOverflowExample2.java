package com.vtalent.amreen;

public class StackOverflowExample2 {
	StackOverflowExample2 obj;

	// constructor
	StackOverflowExample2() {
		// cannot create object inside the constructor
		obj = new StackOverflowExample2();
	}

	int i = 10;

	public static void main(String[] args) {
		StackOverflowExample2 obj2 = new StackOverflowExample2();
		obj2.i = 10;
		System.out.println(obj2.i);

	}

}
