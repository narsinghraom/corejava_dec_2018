package com.vtalent.rakesh;

public class ClassReference {

	static int x = 10;

	public ClassReference(ClassReference c) {
		int x = 100;
		this.x = x;
	}

	public static void main(String[] args) {
		ClassReference u = new ClassReference();
		ClassReference c1 = new ClassReference(c);

		System.out.println(c1);
	}

}
