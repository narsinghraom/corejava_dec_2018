package com.vtalent.rakesh;

public class AbcOne extends AbcImpl {

	public void function(int x, int y) {
		System.out.println(x + y);

	}

	// public int function(int x) {
	// System.out.println(x);
//
	// return x;
	// }

	public static void main(String args[]) {
		AbcOne a = new AbcOne();
		int t = a.function(6);
		System.out.println(t);
	}
}
