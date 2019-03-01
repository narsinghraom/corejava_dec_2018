package com.vtalent.harish;

public class ObjectEx3 {
	ObjectEx oe = new ObjectEx();
	ObjectEx oe2 = new ObjectEx();

	int k;

	public void function() {
		System.out.println(k);
	}

	public static void main(String[] args) {

		ObjectEx oe1 = new ObjectEx();
		oe1.k = 10;
		oe1.function();
	}
}
