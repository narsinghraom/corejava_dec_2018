package com.vtalent.amreen;

public class StackOverflowExample {
	// cannot create object inside class
	static StackOverflowExample obj = new StackOverflowExample();
	int i;

	public static void main(String[] args) {
		StackOverflowExample obj1 = new StackOverflowExample();
		obj1.i = 10;
		System.out.println(obj1.i);
	}

}
