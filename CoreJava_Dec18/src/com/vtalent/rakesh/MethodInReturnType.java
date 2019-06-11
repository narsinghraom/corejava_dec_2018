package com.vtalent.rakesh;

public class MethodInReturnType {
	static int a;

	public int add(int q, int w) {

		int e = q + w;
		int a = 0;

		return adds(10);

	}

	public int adds(int k) {
		this.a = k;
		return k;

	}

	public static void main(String[] args) {

		MethodInReturnType m = new MethodInReturnType();
		m.add(2, 3);
		System.out.println(a);
	}
}
