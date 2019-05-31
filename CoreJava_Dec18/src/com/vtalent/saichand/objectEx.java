package com.vtalent.saichand;

public class objectEx {
	static objectEx oe = new objectEx();
	int i = 20;

	public void function() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objectEx oe1 = new objectEx();
		oe1.i = 10;
		oe.i = 10;
		oe1.function();
		System.out.println(oe.i);

	}

}
