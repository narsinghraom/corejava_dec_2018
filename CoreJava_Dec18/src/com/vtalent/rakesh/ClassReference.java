package com.vtalent.rakesh;

public class ClassReference {

	static int x = 10;

	public ClassReference(ClassReferene c) {
		int x = 100;
		this.x = x;
	}

	public static void main(String[] args) {
		ClassReference c = new ClassReference();
		ClassReference c1 = new ClassReference(c);

		System.out.println(c1);
	}

}
