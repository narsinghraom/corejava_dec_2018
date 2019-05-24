package com.vtalent.rakesh;

public class ContextThree {
	static ContextThree oe = new ContextThree();
	static int i = 20;

	public static int function() {
		System.out.println(i);
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContextThree oe1 = new ContextThree();
		oe1.i = 10;
		oe.i = 10;
		// oe1.function();
		// int q = Q.function();
		// System.out.println(oe.i);
		// System.out.println(oe);
		System.out.println(oe1.function());
	}

}
