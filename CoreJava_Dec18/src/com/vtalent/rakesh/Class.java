package com.vtalent.rakesh;

public class Class {

	int l, k = 8;

	public void function(int k) {
		this.k = 9;
		k = 6;
		int u = 4;
		double d = (double) u;
		System.out.println(k);
	}

	public void function(double k) {

	}

	public static void main(String[] args) {
		Class r = new Class();
		r.function(7);
		System.out.println(r.l);
		r.function(0.0);
		r.function(5);
	}
}
