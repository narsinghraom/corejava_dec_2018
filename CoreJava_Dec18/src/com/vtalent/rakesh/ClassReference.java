package com.vtalent.rakesh;

public class ClassReference {

	static int x = 10;

	public ClassReference(int r) {
		int x = 100;
		this.x = x;
	}

	public static void main(String[] args) {
		ClassReference u = new ClassReference(7);
		double x1 = 100000;
		double t = x1 * 2 / 100;
		System.out.println(t);
	}

}
