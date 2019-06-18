package com.vtalent.rakesh;

public class ReturnType {
	int j;

	public static int add(int q, int w, int e, int r) {

		int t = q + w;
		int y = e + r;
		System.out.println(t);
		return y;
	}

	public ReturnType function(ReturnType h) {
		int x = 0, y = 0, z;
		z = x + y;
		return h;
	}

	public static void main(String args[]) {
		Ten t = new Ten();
		t.qwerty();

		ReturnType r = new Ten();
		ReturnType o = new ReturnType();
		Ten y = new Ten();
		t.add(1, 2, 3, 4);
		int j = t.j;

		o.add(1, 2, 3, 4);
		// System.out.println(g);
	}

}
