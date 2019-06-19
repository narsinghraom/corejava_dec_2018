package com.vtalent.rakesh;

public class ClassOnee extends Class {
	public void function(int k) {

		int u = 4;
		double d = (double) u;
		System.out.println(k);
	}

	public static void main(String[] args) {
		ClassOnee g = new ClassOnee();
		g.function(6);
		g.function(6.0);
	}
}
