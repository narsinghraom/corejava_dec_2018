package com.vtalent.sanjana;

public class ObjectEx {
	static ObjectEx oe = new ObjectEx();
	int i = 20;

	public void function() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		ObjectEx oe1 = new ObjectEx();
		oe1.i = 10;
		oe.i = 10;
		oe1.function();
		System.out.println(oe.i);

	}

}
