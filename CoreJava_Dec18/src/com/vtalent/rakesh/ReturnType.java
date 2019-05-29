package com.vtalent.rakesh;

public class ReturnType {
	public int add(int q, int w, int e, int r) {

		int t = q + w;
		int y = e + r;
		System.out.println(t);
		return y;
	}

	public static void main(String args[]) {
		Ten t = new Ten();
		t.qwerty();

		ReturnType r = new ReturnType();
		int g = r.add(1, 2, 3, 4);
		System.out.println(g);
	}

}
