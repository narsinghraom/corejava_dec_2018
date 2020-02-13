package com.vtalent.tarun.basics;

public class First {

	int x, y;

	public void function() {
		x = 10;
		y = 20;

	}
}

class Second extends First {
	int x;

	public void functionone() {
		x = super.x + x;
		y = x + y;

	}

}
class Test {

	public static void main(String[] args) {
		First f1 = new First();
		Second s1 = new Second();
		f1.function();
		System.out.println(f1.x + f1.y);
		s1.function();
		s1.functionone();
		System.out.println(s1.x + s1.y);

	}

}
