package com.vtalent.rakesh;

public class NestedClassTwo {

	public void function() {
		int q = 1, w = 2, e = 3;
		System.out.println(q);
	}

	public class NestedClassOne {
		public void function() {
			int q = 3, w = 2, e = 1;
			System.out.println(q);
		}

	}

	public static void main(String arg[]) {

		NestedClassTwo two = new NestedClassTwo();

	}
}
