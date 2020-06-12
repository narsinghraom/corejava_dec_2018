package com.vtalent.tarun.basics;

public class StaticNullTest {
	static void staticmethod() {
		System.out.println("U invoked this Method()");
	}

	public static void main(String[] args) {
		StaticNullTest snt = null;
		snt.staticmethod();
		/*
		 * This gives "U invoked this Method()" output, as reference var "snt" is null
		 * complier makes object var "snt" to class ref StaticNullTest
		 * Thus, the method is invoked and prints the same;
		 */
	}

}
