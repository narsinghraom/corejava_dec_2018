package com.vtalent.rakesh;

public class MethodInReturnType extends Employeee {
	static int a;

	public int add(int q, int w) {

		int e = q + w;
		int a = 0;
		System.out.println(e);
		return adds(e);

	}

	public int adds(int k) {
		System.out.println(k + 1);
		return k + 1;

	}

	public static void main(String[] args) {

		MethodInReturnType m = new MethodInReturnType();
		m.add(2, 3);
		Employeee q = new Employeee();
		m.getName();
		System.out.println(m.getName());

	}
}
